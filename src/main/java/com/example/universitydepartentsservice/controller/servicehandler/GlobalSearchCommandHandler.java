package com.example.universitydepartentsservice.controller.servicehandler;

import com.example.universitydepartentsservice.controller.apphandler.CommandHandler;
import com.example.universitydepartentsservice.service.ProfessorService;
import java.util.Scanner;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GlobalSearchCommandHandler implements CommandHandler {
    private final ProfessorService professorService;

    @Override
    public void handle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("GLOBAL SEARCH COMMAND HANDLER \n "
                + "========================================= \n "
                + "please input string value: ");
        String value = scanner.nextLine();
        System.out.println(professorService.findProfessorByStringValue(value));
    }
}
