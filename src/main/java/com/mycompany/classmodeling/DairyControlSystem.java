/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classmodeling;

/**
 *
 * @author bafsharim
 */
public class DairyControlSystem {
    private int nationalIdSupplier ;
    private String nameSupplier ;
    private String email_addressSupplier ;
     private int phone;
     private byte[] attachmentSupplier ;
     private String contractSupplier ;

    public DairyControlSystem(int nationalIdSupplier, String nameSupplier, String email_addressSupplier, int phone, byte[] attachmentSupplier, String contractSupplier) {
        this.nationalIdSupplier = nationalIdSupplier;
        this.nameSupplier = nameSupplier;
        this.email_addressSupplier = email_addressSupplier;
        this.phone = phone;
        this.attachmentSupplier = attachmentSupplier;
        this.contractSupplier = contractSupplier;
    }

    public int getNationalIdSupplier() {
        return nationalIdSupplier;
    }

    public void setNationalIdSupplier(int nationalIdSupplier) {
        this.nationalIdSupplier = nationalIdSupplier;
    }

    public String getNameSupplier() {
        return nameSupplier;
    }

    public void setNameSupplier(String nameSupplier) {
        this.nameSupplier = nameSupplier;
    }

    public String getEmail_addressSupplier() {
        return email_addressSupplier;
    }

    public void setEmail_addressSupplier(String email_addressSupplier) {
        this.email_addressSupplier = email_addressSupplier;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public byte[] getAttachmentSupplier() {
        return attachmentSupplier;
    }

    public void setAttachmentSupplier(byte[] attachmentSupplier) {
        this.attachmentSupplier = attachmentSupplier;
    }

    public String getContractSupplier() {
        return contractSupplier;
    }

    public void setContractSupplier(String contractSupplier) {
        this.contractSupplier = contractSupplier;
    }
     
    
}
