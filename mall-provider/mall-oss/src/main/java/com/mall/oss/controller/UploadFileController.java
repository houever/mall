package com.mall.oss.controller;/**
 * @author houqj
 * @date 2020-02-22 11:43
 */

import cn.fast.web.common.result.Result;
import com.mall.oss.utils.OSSUtil;
import io.swagger.annotations.*;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;

/**
 * @Description: 文件上传下载
 * @Author houqj
 * @Date 2020/2/22 
 * @Version V1.0
 **/
@Api(tags = {"文件上传"})
@RestController
@RequestMapping(value = "/upload")
public class UploadFileController {

    /**
     * 文件上传
     * @param file
     */
    @ApiOperation(value="文件上传到阿里云OSS-单个文件上传", notes="批量文件上传")
    @ApiImplicitParams({@ApiImplicitParam(name = "file", value = "file", required = true, dataType = "MultipartFile", paramType = "path"),})
    @PostMapping("/batchFile")
    public String uplodBatchFile(@RequestParam("file") MultipartFile[] file) throws Exception {
        /*String originalFilename = file.getOriginalFilename();
        FileInputStream inputStream = (FileInputStream) file.getInputStream();*/
       /* System.out.println(inputStream);
        System.out.println(originalFilename);*/

        System.out.println("数组的长度" + file.length);
        for (int i = 0; i < file.length; i++) {
            String originalFilename = file[i].getOriginalFilename();
            InputStream inputStream = file[i].getInputStream();
            OSSUtil.uploadImageToOSS(originalFilename, inputStream);
        }
        return "上传成功";
    }

    @ApiOperation(value="文件上传到阿里云OSS", notes="单个文件上传")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Accept", value = "接收属性", required = true, dataType = "String", paramType = "header", defaultValue = "application/json"),
            @ApiImplicitParam(name = "Accept-Charset", value = "接收字符集", required = true, dataType = "String", paramType = "header", defaultValue = "utf-8"),
            @ApiImplicitParam(name = "Content-Type", value = "内容类型", required = true, dataType = "String", paramType = "header", defaultValue = "application/json; charset=UTF-8") })
    @RequestMapping(value = "/file",consumes = "multipart/*", headers = "content-type=multipart/data", method = RequestMethod.POST)
    public Result uploadSingleFile(@ApiParam(value = "上传文件", required = true) MultipartFile file,
                                   @RequestHeader HttpHeaders headers) throws Exception {
        String originalFilename = file.getOriginalFilename();
        InputStream inputStream = file.getInputStream();
        String s = OSSUtil.uploadImageToOSS(originalFilename, inputStream);
        return Result.success(s);
    }
}
