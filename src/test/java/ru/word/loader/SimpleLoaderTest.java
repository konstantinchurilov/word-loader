package ru.word.loader;

import org.junit.Test;
import ru.work.loader.ILoader;
import ru.work.loader.SimpleLoader;

import static org.junit.Assert.*;

public class SimpleLoaderTest {
    @Test
    public void addWord(){
        ILoader<String> loader = new SimpleLoader<>();
        loader.addWord("Cat");
        assertEquals("Word is ","Cat",loader.getWords().get(0));
    }


}
