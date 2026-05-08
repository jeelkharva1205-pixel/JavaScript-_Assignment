
package com.assignment.Book_Management.entity;
import jakarta.persistence.*;

    @Entity
    public class Books {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;


        private String title;

        @Column(name = "author_name")
        private String author;

        private String isbn;

        @Column(name = "publish_year")
        private int publishYear;

        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }

        public String getTitle() { return title; }
        public void setTitle(String title) { this.title = title; }

        public String getAuthor() { return author; }
        public void setAuthor(String author) { this.author = author; }

        public String getIsbn() { return isbn; }
        public void setIsbn(String isbn) { this.isbn = isbn; }

        public int getPublishYear() { return publishYear; }
        public void setPublishYear(Integer publishYear) { this.publishYear = publishYear; }
    }



