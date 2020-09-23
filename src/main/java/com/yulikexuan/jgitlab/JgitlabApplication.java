//: com.yulikexuan.jgitlab.JgitlabApplication.java


package com.yulikexuan.jgitlab;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;


@Slf4j
@Order(0)
@SpringBootApplication
public class JgitlabApplication implements CommandLineRunner {

    public static void main(String[] args) {

        log.info(">>>>>>> STARTING THE APPLICATION");

        SpringApplication.run(JgitlabApplication.class, args);

        log.info(">>>>>>> STARTING THE APPLICATION");
    }

    @Override
    public void run(String... args) throws Exception {

        log.info(">>>>>>> EXECUTING : command line runner");

        for (int i = 0; i < args.length; ++i) {
            log.info(">>>>>>> Main args[{}]: {}", i, args[i]);
        }

    }

}