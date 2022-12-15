package com.sk.web.controller;

import com.sk.model.ResultEnum;
import com.sk.model.ResultJsonModel;
import com.sk.model.ResultModelImp;
import com.sk.web.config.CrmConfig;
import com.sk.web.constant.RequestCommonPathConstant;
import com.sk.web.model.ProductImage;
import com.sk.web.model.ProductImageExample;
import com.sk.web.service.ProductImageService;
import com.sk.web.utils.FileUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

@Api(tags = "产品图片")
@RestController
@RequestMapping(RequestCommonPathConstant.REQUEST_PROJECT_PATH+"/product_image")
public class ProductImageController {
    Logger log = LoggerFactory.getLogger(ProductImageController.class);

    @Autowired
    ProductImageService productImageService;

    @Autowired
    CrmConfig crmConfig;

    @Resource
    HttpServletResponse response;

    @ApiOperation("查询所有产品图片")
    @ApiImplicitParam
    @GetMapping("/v1/selectAll")
    public ResultModelImp<ProductImage> selectAll(ProductImage t){
        return productImageService.selectAll(t);
    }

//    @ApiOperation("分页查询所有产品图片")
//    @ApiImplicitParams(value = {@ApiImplicitParam(name = "PageRequest",dataTypeClass = PageRequest.class , value ="")})
//    @PostMapping("/v1/selectPage")
//    public PageResult selectPage(@RequestBody PageRequest pageQuery){
//        return productImageService.findPage(pageQuery);
//    }


    @ApiOperation("查询单个产品图片")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "ProductImage",dataTypeClass = ProductImage.class , value ="")})
    @PostMapping("/v1/selectOne")
    public ResultModelImp<ProductImage> selectOne(@RequestBody ProductImage t){
        return productImageService.selectOne(t);
    }

    @ApiOperation("增加产品图片")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "ProductImage",dataTypeClass = ProductImage.class , value ="")})
    @PostMapping("/v1/insert")
    public ResultModelImp<ProductImage> insert(@RequestBody ProductImage t) {
        return productImageService.insert(t);
    }


    @ApiOperation("上传图片")
    @PostMapping("/v1/upload")
    public ResultModelImp uploadImg(@RequestHeader("token") String token, @RequestParam("file") MultipartFile file) {
        String fileName = file.getOriginalFilename();
        String url = crmConfig.getUploadUrl();
        try {
            FileUtil.uploadFile(file.getBytes(),url, fileName);

            BufferedImage bim = ImageIO.read(file.getInputStream());
            int imgWidth = bim.getWidth();
            int imgHeight = bim.getHeight();
            FileUtil.uploadFile(FileUtil.compressImage(url+ fileName,imgWidth,imgHeight),url, fileName);

            return new ResultJsonModel<ProductImage>().setCode(ResultEnum.SUCCESS.getCode()).setMessage("/product_image/v1/getImage?path="+url+fileName);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultJsonModel<ProductImage>().setCode(ResultEnum.ERROR.getCode()).setMessage(ResultEnum.ERROR.getMsg());
        }
    }

    @ApiOperation("获取图片")
    @GetMapping("/v1/getImage")
    public void getImage (@RequestParam("path") String path) {
        try {
            File filePic = new File(path);
            if(filePic.exists()){
                FileInputStream is = new FileInputStream(filePic);
                int i = is.available(); // 得到文件大小
                byte data[] = new byte[i];
                is.read(data); // 读数据
                is.close();
                response.setContentType("image/*"); // 设置返回的文件类型
                OutputStream toClient = response.getOutputStream(); // 得到向客户端输出二进制数据的对象
                toClient.write(data); // 输出数据
                toClient.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


        @ApiOperation("删除产品图片")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "ProductImage",dataTypeClass = ProductImage.class , value ="")})
    @PostMapping("/v1/delete")
    public ResultModelImp<ProductImage> delete(@RequestHeader("token") String token, @RequestBody ProductImage t){
        return productImageService.delete(t);
    }

    @ApiOperation("更新产品图片")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "ProductImage",dataTypeClass = ProductImage.class , value ="")})
    @PostMapping("/v1/update")
    public ResultModelImp<ProductImage> update(@RequestHeader("token") String token, @RequestBody ProductImage t){
        ProductImageExample e = new ProductImageExample();
        e.createCriteria().andIdEqualTo(t.getId());
        return productImageService.update(t,e);
    }

}
