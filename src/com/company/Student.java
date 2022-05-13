package com.company;

public class Student {
    public Integer EnrollID;
    public String FirstName;
    public String LastName;
    public Integer Age;

    public Student(Integer enrollID, String firstName, String lastName, Integer age) {
        EnrollID = enrollID;
        FirstName = firstName;
        LastName = lastName;
        Age = age;
    }

    public Integer getEnrollID() {
        return EnrollID;
    }

    public void setEnrollID(Integer enrollID) {
        EnrollID = enrollID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }
}
