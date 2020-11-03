package com.zipcodewilmington;

import java.util.Arrays;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {

    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {

        this.personArray = personArray;
    }

    public String whileLoop() {
        StringBuilder result = new StringBuilder();
        int counter = 0;
        while (counter < personArray.length) {
            result.append((personArray[counter]));
            counter++;
        }
        return result.toString();
    }

    public String forLoop() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= personArray.length-1; i++) {
            result.append(personArray[i]);
        }
        return result.toString();
    }

    public String forEachLoop() {
        StringBuilder result = new StringBuilder();
        for (Person person : personArray) {
            result.append(person.toString());
        }
        return result.toString();
    }

    public Person[] getPersonArray() {
        return personArray;
    }
}
