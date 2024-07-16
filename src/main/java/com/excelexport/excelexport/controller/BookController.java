package com.excelexport.excelexport.controller;

import com.excelexport.excelexport.service.BookService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    @GetMapping("/excel")
    public void generateExcelFile(HttpServletResponse response) {
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=books.xlsx";

        response.setHeader(headerKey, headerValue);

        bookService.generateExcel(response);
    }
}
