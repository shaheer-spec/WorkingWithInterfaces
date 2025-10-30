package com.pluralsight;

public class Person implements Comparable<Person>{
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person o) {
        int comparingName = this.lastName.compareTo(o.lastName);

        if (comparingName == 0){
            comparingName = this.firstName.compareTo(o.firstName);
        }

        if (comparingName == 0){
            if (this.age > o.age){
                comparingName = 1;
            } else if (this.age < o.age) {
                comparingName = -1;
            }
        }

        return comparingName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + age;
    }
}
