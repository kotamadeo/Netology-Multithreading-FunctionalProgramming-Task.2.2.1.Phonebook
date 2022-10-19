package com.gmail.at.kotamadeo;

import com.gmail.at.kotamadeo.phonebook.Phonebook;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook("Моя телефонная книга");
        phonebook.putNumberToPhoneBook("Жанна", "89205050550");
        phonebook.putNumberToPhoneBook("Алексей", "89125205403");
        phonebook.putNumberToPhoneBook("Жанна", "+79515555555");
        System.out.println(phonebook.getNumbers().size() == 2);
        System.out.println(phonebook.findByName("Жанна"));
        System.out.println(phonebook.findByNumber("89125205403"));
        System.out.println(phonebook.printAllNames());

    }
}