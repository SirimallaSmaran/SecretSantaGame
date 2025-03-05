package com.secretsanta;

import com.secretsanta.model.Employee;
import com.secretsanta.service.SecretSantaAssigner;
import com.secretsanta.utils.ExcelReader;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String inputFile = "data/Employee-List.xlsx";

        List<Employee> employees = ExcelReader.readEmployeesFromExcel(inputFile);
        if (employees.isEmpty()) {
            System.out.println("No employees found in the input file!");
            return;
        }

        SecretSantaAssigner.assignSecretSantas(employees);
    }
}
