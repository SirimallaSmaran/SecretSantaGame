package com.secretsanta.service;

import com.secretsanta.model.Employee;
import com.secretsanta.utils.ExcelReader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class SecretSantaAssigner {
    private static final String OUTPUT_DIR = "output/";
    private static final String OUTPUT_FILE = OUTPUT_DIR + "Secret-Santa-Assignments.csv";

    public static void assignSecretSantas(List<Employee> employees) {
        Collections.shuffle(employees); // Shuffle list to randomize

        for (int i = 0; i < employees.size(); i++) {
            Employee giver = employees.get(i);
            Employee receiver = employees.get((i + 1) % employees.size());
            giver.setSecretChild(receiver);
        }

        writeAssignmentsToCSV(employees);
    }

    private static void writeAssignmentsToCSV(List<Employee> employees) {
        try {
            File outputDir = new File(OUTPUT_DIR);
            if (!outputDir.exists()) {
                outputDir.mkdirs();
            }

            FileWriter writer = new FileWriter(OUTPUT_FILE);
            writer.append("Employee_Name,Employee_EmailID,Secret_Child_Name,Secret_Child_EmailID\n");

            for (Employee emp : employees) {
                writer.append(emp.getName()).append(",")
                      .append(emp.getEmail()).append(",")
                      .append(emp.getSecretChild().getName()).append(",")
                      .append(emp.getSecretChild().getEmail()).append("\n");
            }

            writer.flush();
            writer.close();
            System.out.println("Secret Santa assignments saved to: " + OUTPUT_FILE);
        } catch (IOException e) {
            System.err.println("Error writing to CSV file: " + e.getMessage());
        }
    }
}
