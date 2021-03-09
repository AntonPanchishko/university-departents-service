package com.example.universitydepartentsservice;

import com.example.universitydepartentsservice.controller.Handler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.universitydepartentsservice.service",
        "com.example.universitydepartentsservice.controller",
        "com.example.universitydepartentsservice.conf",
        "com.example.universitydepartentsservice.repository"})
public class UniversityDepartmentsServiceApplication {
    private static Handler handler;

    public static void main(String[] args) {
        SpringApplication.run(UniversityDepartmentsServiceApplication.class, args);
        handler.run();
    }

    @Autowired
    public void setHandler(Handler handler) {
        UniversityDepartmentsServiceApplication.handler = handler;
    }
}
