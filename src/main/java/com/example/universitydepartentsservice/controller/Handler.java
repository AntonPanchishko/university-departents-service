package com.example.universitydepartentsservice.controller;

import com.example.universitydepartentsservice.controller.apphandler.CommandHandler;
import com.example.universitydepartentsservice.controller.apphandler.DepartmentMenuHandler;
import com.example.universitydepartentsservice.controller.apphandler.UnknownCommandHandler;
import java.util.Map;
import java.util.Scanner;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Getter
public class Handler {
    private final Map<String, CommandHandler> commandHandlerMap;

    @Autowired
    public Handler(Map<String, CommandHandler> commandHandlerMap) {
        this.commandHandlerMap = commandHandlerMap;
    }

    public void run() {
        new DepartmentMenuHandler().handle();
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        handleCommand(command);
    }

    public void handleCommand(String command) {
        while (true) {
            if (command.equals("menu")) {
                new DepartmentMenuHandler().handle();
                Scanner scanner = new Scanner(System.in);
                handleCommand(scanner.nextLine());
            }
            commandHandlerMap.getOrDefault(command, new UnknownCommandHandler()).handle();
            command = "menu";
        }
    }
}
