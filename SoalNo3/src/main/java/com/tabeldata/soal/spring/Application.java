package com.tabeldata.soal.spring;

import com.tabeldata.soal.spring.umur.UmurSaya;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        UmurSaya u = applicationContext.getBean(UmurSaya.class);
        u.UmurSaya();
    }
}
