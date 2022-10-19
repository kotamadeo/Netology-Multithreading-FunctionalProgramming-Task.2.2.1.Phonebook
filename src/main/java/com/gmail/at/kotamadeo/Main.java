package com.gmail.at.kotamadeo;

import com.gmail.at.kotamadeo.phonebook.Phonebook;

public class Main {
    private static final int EXPECTED_VALUE = 3;

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook("Моя телефонная книга");
        phonebook.putContactToPhonebook("Жанна", "89205050550");
        phonebook.putContactToPhonebook("Алексей", "89125205403");
        phonebook.putContactToPhonebook("Жанна", "+79515555555");
        phonebook.putContactToPhonebook("Иван", "+795155520304");
        System.out.println(phonebook.getNumbers().size() == EXPECTED_VALUE);
        System.out.println(phonebook.findByName("Жанна"));
        System.out.println(phonebook.findByNumber("89125205403"));
        System.out.println(phonebook);
    }
}