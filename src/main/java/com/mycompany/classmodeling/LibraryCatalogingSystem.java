/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classmodeling;

/**
 *
 * @author bafsharim
 */
public class LibraryCatalogingSystem {

    private String title;
    private String author;
    private String publisher;
    private String publicationYear;
    private String status;
    private String borrower;
    private String borrowDate;
    private String returnDate;
    private boolean status1;
    private int BookChoice;

    public LibraryCatalogingSystem() {
    }

    public LibraryCatalogingSystem(String title, String author, String publisher, String publicationYear, String status, String borrower, String borrowDate, String returnDate, boolean status1, int BookChoice) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.status = status;
        this.borrower = borrower;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.status1 = status1;
        this.BookChoice = BookChoice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isStatus1() {
        return status1;
    }

    public void setStatus1(boolean status1) {
        this.status1 = status1;
    }

    public int getBookChoice() {
        return BookChoice;
    }

    public void setBookChoice(int BookChoice) {
        this.BookChoice = BookChoice;
    }
    
}
