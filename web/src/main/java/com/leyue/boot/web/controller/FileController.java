package com.leyue.boot.web.controller;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by lihao on 17/12/4.
 */

@Controller
@RequestMapping("file")
public class FileController {

    private static final Logger logger = LoggerFactory.getLogger(FileController.class);


    @RequestMapping(value = "upload")
    @ResponseBody
    public String upload(@RequestParam("files") MultipartFile file) {
        if (file.isEmpty()) {
            return "文件为空";
        }

        //获取文件名
        String fileName = file.getOriginalFilename();
        logger.info("上传文件名：" + fileName);


        //获取到后缀名
        String sffixName = fileName.substring(fileName.lastIndexOf("."));
        logger.info("上传的后缀名为： " + sffixName);


        //上传文件路径
        String filePath = "/Users/lihao/project/springboot/web/src/main/resources/static/images/upload/";

        //解决中文问题,liunx 下中文路径,图片显示问题
        // fileName = UUID.randomUUID() + suffixName;

        File dest = new File(filePath + fileName);

        //检测是否存在目录
        if (!dest.getParentFile().exists()) {
            try {
                FileUtils.forceMkdir(dest.getParentFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        logger.info("上传文件路径：" + dest.getAbsolutePath());

        try {
            file.transferTo(dest);
            return "上传成功";
        } catch (IOException e) {
            e.printStackTrace();
        }


        return "上传失败";
    }


    @RequestMapping("show")
    public String show() {
        return "upload/upload";
    }

}
