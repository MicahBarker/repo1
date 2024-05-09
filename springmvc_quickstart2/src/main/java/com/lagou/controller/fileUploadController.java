package com.lagou.controller;

import com.lagou.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @Author 青科大-任安全
 * @Create 2024/5/4 10:44
 */
@Controller
public class fileUploadController {

    @RequestMapping("/fileUpload")
    public String fileUpload(String username, MultipartFile filePic) throws IOException {
        System.out.println(username);
        // 获取文件名
        String originalFilename = filePic.getOriginalFilename();
        //保存文件
        filePic.transferTo(new File("d:/upload/" + originalFilename));
        return "success";
    }

    @RequestMapping("/filesUpload")
    public String filesUpload(String username, MultipartFile[] filePic) throws IOException {
        System.out.println(username);
        for (MultipartFile multipartFile : filePic) {
            // 获取文件名
            String originalFilename = multipartFile.getOriginalFilename();
            // 保存到服务器
            multipartFile.transferTo(new File("d:/upload/" + originalFilename));
        }
        return "success";
    }
}
