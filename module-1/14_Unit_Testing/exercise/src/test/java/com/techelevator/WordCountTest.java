package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class WordCountTest {

    @Test
    public void testGetCount() {
        Map<String, Integer> resultMap = new HashMap<>();
        resultMap.put("ba", 2);
        resultMap.put("black", 1);
        resultMap.put("sheep", 1);

        String[] wordsPass = new String[4];
        wordsPass[0] = "ba";
        wordsPass[1] = "ba";
        wordsPass[2] = "black";
        wordsPass[3] = "sheep";

        WordCount test1 = new WordCount();
        Map<String, Integer> result = test1.getCount(wordsPass);

        Assert.assertEquals(resultMap, result);


    }
}