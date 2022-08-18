package com.finxster.stringconcatenator.service;

import org.springframework.stereotype.Service;

@Service
public class StringConcatenatorService {

    public String concatenate(String s1, String s2) {
        return s1 + s2;
    }

}
