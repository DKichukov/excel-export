package com.excelexport.excelexport.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "books")
public class Book {

    @Id
    private Integer id;
    private String name;
    private String genre;
    private String publisher;
    private String isbn;
    private int pages;
    private String language;
}
