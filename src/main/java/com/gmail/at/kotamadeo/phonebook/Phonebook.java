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

    public int putContactToPhonebook(String name, String number) {
        numbers.putIfAbsent(name, number);
        return numbers.size();
    }


}
