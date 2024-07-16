package com.excelexport.excelexport.service.impl;

import com.excelexport.excelexport.model.Book;
import com.excelexport.excelexport.repository.BookRepository;
import com.excelexport.excelexport.service.BookService;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    private static void fillTable(List<Book> books, XSSFSheet sheet, int dataRowInitialIndex) {
        for (Book book : books) {
            XSSFRow dataRow = sheet.createRow(dataRowInitialIndex);
            dataRow.createCell(0).setCellValue(book.getId());
            dataRow.createCell(1).setCellValue(book.getName());
            dataRow.createCell(2).setCellValue(book.getGenre());
            dataRow.createCell(3).setCellValue(book.getPublisher());
            dataRow.createCell(4).setCellValue(book.getIsbn());
            dataRow.createCell(5).setCellValue(book.getPages());
            dataRow.createCell(6).setCellValue(book.getLanguage());
            dataRowInitialIndex++;
        }
    }

    private static void writeFile(HttpServletResponse response, XSSFWorkbook workbook) {
        try {
            ServletOutputStream outputStream = response.getOutputStream();
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
        } catch (IOException e) {
            throw new RuntimeException("Failed to write Excel file to response", e);
        }
    }

    @Override
    public void generateExcel(HttpServletResponse response) {

        List<Book> books = bookRepository.findAll();

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Books Info");
        XSSFRow row = sheet.createRow(0);

        row.createCell(0).setCellValue("ID");
        row.createCell(1).setCellValue("Name");
        row.createCell(2).setCellValue("Genre");
        row.createCell(3).setCellValue("Publisher");
        row.createCell(4).setCellValue("Isbn");
        row.createCell(5).setCellValue("Pages");
        row.createCell(6).setCellValue("Language");

        int dataRowInitialIndex = 1;

        fillTable(books, sheet, dataRowInitialIndex);

        writeFile(response, workbook);
    }
}


