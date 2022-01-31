package com.suyh;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DemoServiceImpl implements DemoService {
    @Override
    public void sayHello(String msg) {
        log.info("hello: {}", msg);
    }
}
