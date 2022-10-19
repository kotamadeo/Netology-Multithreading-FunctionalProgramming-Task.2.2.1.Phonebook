package com.gmail.at.kotamadeo.phonebook;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class PhonebookTest {
    private static final Phonebook PHONEBOOK = new Phonebook("Тестовая телефонная книга");
    private static final int SIZE = 2;

    @BeforeAll
    static void init() {
        PHONEBOOK.putContactToPhonebook("Ivan", "12345678910");
        PHONEBOOK.putContactToPhonebook("Anna", "54544554545");
        PHONEBOOK.putContactToPhonebook("Ivan", "10203040505");
    }

    @Test
    void putContactToPhonebook() {
        assertEquals(SIZE, PHONEBOOK.getNumbers().size(), "Произошла ошибка добавления номера в телефонную книгу");
    }

    @Test
    void findByNumber() {
        String result = PHONEBOOK.findByNumber("12345678910");
        assertNotNull(result, "Произошла ошибка поиска контакта по номеру!");
    }

    @Test
    void findByName() {
        String result = PHONEBOOK.findByName("Ivan");
        assertNotNull(result, "Произошла ошибка поиска контакта по имени!");
    }

    @Test
    void printAllNames() {
        String result = PHONEBOOK.printAllNames();
        assertNotNull(result, "Произошла ошибка - список контактов пуст");
    }
}