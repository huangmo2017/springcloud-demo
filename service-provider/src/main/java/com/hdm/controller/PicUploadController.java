package com.hdm.controller;

import com.hdm.service.PicUploadFileSystemService;
import com.hdm.vo.PicUploadResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RequestMapping("pic/upload")
@Controller
public class PicUploadController {
   /* @Autowired
    private PicUploadService picUploadService;*/

    @Autowired
    private PicUploadFileSystemService picUploadService;

    /**
     * @param uploadFile
     * @return
     * @throws Exception
     */
    @PostMapping
    @ResponseBody
    public PicUploadResult upload(@RequestParam("file") MultipartFile uploadFile)
            throws Exception {
        return this.picUploadService.upload(uploadFile);
    }

    @GetMapping
    @ResponseBody
    public String test() {
        return "hello";
    }


}