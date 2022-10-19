package com.gmail.at.kotamadeo.phonebook;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

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

    public String findByNumber(String number) {
        return numbers.entrySet()
                .stream()
                .filter(entry -> number.equals(entry.getValue()))
                .map(Map.Entry::getKey)
                .findFirst().orElse(null);
    }

    public String findByName(String name) {
        return numbers.entrySet()
                .stream()
                .filter(entry -> name.equals(entry.getKey()))
                .map(Map.Entry::getValue)
                .findFirst().orElse(null);
    }

    public String printAllNames() {
        return numbers.entrySet()
                .stream()
                .map(Objects::toString)
                .collect(Collectors.joining(", "));
    }

    @Override
    public String toString() {
       return String.format("%s:%n%s", name, printAllNames());
    }
}
