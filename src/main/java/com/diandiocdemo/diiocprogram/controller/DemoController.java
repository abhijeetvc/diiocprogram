package com.diandiocdemo.diiocprogram.controller;

import com.diandiocdemo.diiocprogram.impl.DemoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

   // @Autowired
    private DemoImpl demoImpl;

//    public DemoController(DemoImpl demoImpl){
//        this.demoImpl=demoImpl;
//    }

    @Autowired
    public void setDemoImpl(DemoImpl demoImpl) {
        this.demoImpl = demoImpl;
    }

    @GetMapping(value="/check")
    public String accessData(){

        return demoImpl.getData();
    }
}
