package com.mrc.demo20200824.com.mrc.demo20200824.cotroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class democontroller {

    @RequestMapping("getinfoes")
    public  Object fun1()
    {
        return "你好，我是马瑞晨";
    }
}
