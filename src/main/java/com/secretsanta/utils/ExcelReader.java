package com.secretsanta.utils;

import com.secretsanta.model.Employee;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelReader {
    public static List<Employee> readEmployeesFromExcel(String filePath) {
        List<Employee> employees = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(new File(filePath));
             Workbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                if (row.getRowNum() == 0) continue; // Skip Header
                String name = row.getCell(0).getStringCellValue();
                String email = row.getCell(1).getStringCellValue();
                employees.add(new Employee(name, email));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employees;
    }
}
