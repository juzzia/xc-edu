package com.xuecheng.manage_media.controller;

import com.xuecheng.api.media.MediaUploadControllerApi;
import com.xuecheng.framework.domain.media.response.CheckChunkResult;
import com.xuecheng.framework.model.response.ResponseResult;
import com.xuecheng.manage_media.service.MediaUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("media/upload")
public class MediaUploadController implements MediaUploadControllerApi {

    @Autowired
    private MediaUploadService mediaUploadService;


    @Override
    @PostMapping("/register")
    public ResponseResult register(String fileMd5, String fileName, Long fileSize, String mimetype, String fileExt) {

        return mediaUploadService.register(fileMd5,fileName,fileSize,mimetype,fileExt);
    }

    @Override
    @PostMapping("/checkchunk")
    public CheckChunkResult checkChunk(String fileMd5, Integer chunk, Long chunkSize) {

        return mediaUploadService.checkChunk(fileMd5,chunk,chunkSize);
    }

    @Override
    @PostMapping("/uploadchunk")
    public ResponseResult uploadChunk(MultipartFile file, Integer chunk, String fileMd5) {
        return this.mediaUploadService.uploadChunk(file,chunk,fileMd5);
    }

    @Override
    @PostMapping("/mergechunks")
    public ResponseResult mergeChunks(String fileMd5, String fileName, Long fileSize, String mimetype, String fileExt) {
        return this.mediaUploadService.mergeChunks(fileMd5,fileName,fileSize,mimetype,fileExt);
    }


    @PostMapping("handler/{id}")
    public ResponseResult handler(@PathVariable("id")String id){
        return this.mediaUploadService.sendMediaProcessTaskMsg(id);
    }
}
