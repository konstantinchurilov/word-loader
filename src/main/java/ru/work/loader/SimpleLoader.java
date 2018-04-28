package ru.work.loader;

import java.util.ArrayList;
import java.util.List;

public class SimpleLoader<T> implements ILoader<T> {
    private List<T> words = new ArrayList<>();
    @Override
    public void addWord(T t) {
        words.add(t);
    }

    @Override
    public List<T> getWords() {
        return words;
    }
}
