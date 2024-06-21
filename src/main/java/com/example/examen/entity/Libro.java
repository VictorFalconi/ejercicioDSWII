package com.example.examen.entity;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "Libro")
public class Libro {
    private String title;
    private String isbn;
    private Integer pageCount;
    private Date publishedDate;
    private String thumbnaillUrl;
    private String shortDescription;
    private String longDescription;
    private String status;
    private String[] authors;
    private String[] categories;
}
