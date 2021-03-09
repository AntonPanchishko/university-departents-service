package com.example.universitydepartentsservice.controller.apphandler;

import org.springframework.stereotype.Component;

@Component
public class UnknownCommandHandler implements CommandHandler {
    @Override
    public void handle() {
        System.out.println("Command not found.\n"
                + "Please try again.");
    }
}
