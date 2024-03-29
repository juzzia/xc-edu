package com.xuecheng.manage_cms.controller;

import com.xuecheng.api.cms.SysDictionaryControllerApi;
import com.xuecheng.framework.domain.system.SysDictionary;
import com.xuecheng.manage_cms.service.SysDictionaryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sys/dictionary")
public class SysDictionaryController implements SysDictionaryControllerApi {


    @Autowired
    private SysDictionaryService sysDictionaryService;

    @Override
    @GetMapping("get/{type}")
    public SysDictionary getByType(@PathVariable("type") String type) {
        SysDictionary sysDictionary = sysDictionaryService.getByType(type);

        return sysDictionary;
    }
}
