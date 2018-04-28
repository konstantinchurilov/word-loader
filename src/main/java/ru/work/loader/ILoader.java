package ru.work.loader;

import java.util.List;

public interface ILoader<T> {
    void addWord(T t);
    List<T> getWords();
}
