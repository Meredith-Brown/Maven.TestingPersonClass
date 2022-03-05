package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String city;
    private String state;
    private String phoneNumber;
    private String emailAddress;
    private int lastFourDigitsSSN;

    public Person() { // https://stackoverflow.com/questions/31284566/how-to-create-instance-of-a-object-without-passing-argument-in-constructor
    name = "";
    age = Integer.MAX_VALUE;
    city = "Miami";
    state = "Florida";
    phoneNumber = "234-567-8901";
    emailAddress = "beepboopbop@thegovernment.gov";
    lastFourDigitsSSN = 1092;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String city, String state, String phoneNumber, String emailAddress, int lastFourDigitsSSN) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.state = state;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.lastFourDigitsSSN = lastFourDigitsSSN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setLastFourDigitsSSN(int lastFourDigitsSSN) {
        this.lastFourDigitsSSN = lastFourDigitsSSN;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getLastFourDigitsSSN() {
        return lastFourDigitsSSN;
    }
}
