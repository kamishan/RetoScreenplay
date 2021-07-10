package com.demoqa.automation.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {

    Faker faker = new Faker(new Locale("en-US"));

    private String firstName, email, lastName, mobileNumber,currentAddress,birthday,subjects,
            state,extensionName, extensionEmail, extensionCurrentAddress, filepath, sheetName,picturepath;

    public String getFirstName() {
        return firstName;
    }

    public String getExtensionName() {
        return extensionName;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getState() {
        return state;
    }

    public String getExtensionEmail() {
        return extensionEmail;
    }

    public String getSubjects() {
        return subjects;
    }

    public String getFilepath() {
        return filepath;
    }

    public String getSheetName() {
        return sheetName;
    }

    public String getExtensionCurrentAddress() {
        return extensionCurrentAddress;
    }

    public String getPicturepath() {
        return picturepath;
    }

    public DataInjection(){
        this.firstName = faker.name().firstName();
        this.lastName = faker.name().lastName();
        this.email = faker.internet().emailAddress();
        this.mobileNumber = faker.phoneNumber().subscriberNumber(10);
        this.currentAddress = faker.address().fullAddress();
        this.birthday = "12-15-1998";
        this.subjects = "Maths";
        this.state = "NCR";

        this.extensionName = "Name:";
        this.extensionEmail = "Email:";
        this.extensionCurrentAddress = "Current Address :";
        this.filepath = "Resources/data.xlsx";
        this.sheetName = "data01";
        //this.picturepath = "/home/zamekh/Programas/Intellij/PruebaAutomatizacion/Resources/ejercicio13-2.png";
        this.picturepath = "C:\\Users\\kamis\\OneDrive\\Escritorio\\PruebaAutomatizacion\\Resources\\ejercicio13-2.png";
    }


}
