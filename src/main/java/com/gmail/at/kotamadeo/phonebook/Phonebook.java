package com.gmail.at.kotamadeo.phonebook;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Getter
public class Phonebook {
    @NonNull
    private String name;
    private final Map<String, String> numbers = new HashMap<>();

    public int putNumberToPhoneBook(String name, String number) {
        return 0;
    }

    public String findByNumber(String number) {
        return null;
    }

    public String findByName(String name) {
        return null;
    }

    public String printAllNames() {
        return null;
    }


}
