package org.example.sandbox.comparable;

public class Person implements Comparable<Person> {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public int compareTo(Person person) {

        if (this.firstName.compareTo(person.firstName) == 0) {
            if (this.lastName.compareTo(person.lastName) == 0) {
                return this.age - person.age;
            }
            return this.lastName.compareTo(person.lastName);
        }

        return this.age - person.age;
    }
}