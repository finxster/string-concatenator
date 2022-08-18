package com.finxster.stringconcatenator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringConcatenatorServiceTest {

    @Test
    void testConcatenate() {
        StringConcatenatorService service = new StringConcatenatorService();
        String result = service.concatenate("a", "b");
        assertEquals("ab", result);
    }

}