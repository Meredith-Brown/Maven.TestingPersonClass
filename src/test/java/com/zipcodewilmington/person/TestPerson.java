package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testDefaultConstructor2() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        String expectedCity = "Miami";
        String expectedState = "Florida";
        String expectedPhoneNumber = "234-567-8901";
        String expectedEmailAddress = "beepboopbop@thegovernment.gov";
        Integer expectedLastFourDigitsSSN = 1092;
        // When
        Person person = new Person();
        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        String actualCity = person.getCity();
        String actualState = person.getState();
        String actualPhoneNumber = person.getPhoneNumber();
        String actualEmailAddress = person.getEmailAddress();
        Integer actualLastFourDigitsSSN = person.getLastFourDigitsSSN();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedCity, actualCity);
        Assert.assertEquals(expectedState, actualState);
        Assert.assertEquals(expectedPhoneNumber, actualPhoneNumber);
        Assert.assertEquals(expectedEmailAddress, actualEmailAddress);
        Assert.assertEquals(expectedLastFourDigitsSSN, actualLastFourDigitsSSN);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetCity() {
        // Given
        Person person = new Person();
        String expected = "Wilmington";
        // When
        person.setCity(expected);
        // Then
        String actual = person.getCity();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetState() {
        // Given
        Person person = new Person();
        String expected = "Delaware";
        // When
        person.setState(expected);
        // Then
        String actual = person.getState();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetPhoneNumber() {
        // Given
        Person person = new Person();
        String expected = "123-456-7890";
        // When
        person.setPhoneNumber(expected);
        // Then
        String actual = person.getPhoneNumber();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetEmailAddress() {
        // Given
        Person person = new Person();
        String expected = "humanperson@ZCW.interwebz";
        // When
        person.setEmailAddress(expected);
        // Then
        String actual = person.getEmailAddress();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetLastFourDigitsSSN() {
        // Given
        Person person = new Person();
        Integer expected = 1234;
        // When
        person.setLastFourDigitsSSN(expected);
        // Then
        Integer actual = person.getLastFourDigitsSSN();
        Assert.assertEquals(expected, actual);
    }
}
