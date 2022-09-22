package com.example.demopackage;

import cn.hutool.core.lang.UUID;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


/**
 * @author wangjiahao
 * @date 2022/9/21 20:21
 */
@Component
public class RunnerListen implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.err.println(UUID.fastUUID());

    }
}
