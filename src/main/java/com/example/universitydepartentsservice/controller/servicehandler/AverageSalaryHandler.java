package com.example.universitydepartentsservice.controller.servicehandler;

import com.example.universitydepartentsservice.controller.apphandler.CommandHandler;
import com.example.universitydepartentsservice.service.DepartmentService;
import java.util.Scanner;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AverageSalaryHandler implements CommandHandler {
    private final DepartmentService departmentService;

    @Override
    public void handle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("AVERAGE SALARY COMMAND HANDLER \n "
                + "========================================= \n "
                + "please input department name: ");
        String departmentName = scanner.nextLine();
        System.out.println(departmentService.getAverageSalary(departmentName));
    }
}
