package com.diandiocdemo.diiocprogram.impl;

import com.diandiocdemo.diiocprogram.myinterface.DemoInterface;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
//@Repository
//@Component
public class DemoImpl implements DemoInterface {

    @Override
    public String getData() {
        return "Hello DI and IoC";
    }
}
