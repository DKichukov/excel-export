package com.excelexport.excelexport.service;

import jakarta.servlet.http.HttpServletResponse;

public interface BookService {

    void generateExcel(HttpServletResponse response);
}
