package com.example.universitydepartentsservice.controller.apphandler;

import org.springframework.stereotype.Component;

@Component
public class ExitProgramCommandHandler implements CommandHandler {
    @Override
    public void handle() {
        System.out.println("Program finished work.\n"
                + "Have a nice day!");
        System.exit(0);
    }
}
