package com.example.universitydepartentsservice.controller.apphandler;

import org.springframework.stereotype.Component;

@Component
public class DepartmentMenuHandler implements CommandHandler {
    @Override
    public void handle() {
        System.out.println("Please input command:\n"
                + "head - get head of department\n"
                + "statistic - get statistic\n"
                + "average - get average salary of department\n"
                + "amount - get amount of proffers in department\n"
                + "search - global search by string value\n"
                + "exit - exit");
    }
}
