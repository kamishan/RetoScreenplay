package com.demoqa.automation.utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import  java.io.FileInputStream;
import java.io.IOException;

public class Excel {
    public static String getCellValue(String filepath, String sheetName,int rowNumber ,int cellNumber) throws IOException {
        File excelFile = new File(filepath);
        FileInputStream inputStream = new FileInputStream(excelFile);
        Workbook workbook =  new XSSFWorkbook(inputStream);
        String data="";

        Sheet sheet = workbook.getSheet(sheetName);
        Row row = sheet.getRow(rowNumber);
        Cell cell = row.getCell(cellNumber);

        if(cell.getCellType()== CellType.STRING){
            data = cell.getStringCellValue();
        }
        else if(cell.getCellType()== CellType.NUMERIC){
            data = String.valueOf(cell.getNumericCellValue());
        }
        return data;
    }
}
