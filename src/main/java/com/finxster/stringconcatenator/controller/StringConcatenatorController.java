package com.finxster.stringconcatenator.controller;

import com.finxster.stringconcatenator.service.StringConcatenatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringConcatenatorController {

    @Autowired
    private StringConcatenatorService service;

    @PostMapping
    public ResponseEntity<String> concatenateString(@RequestParam("s1") String s1, @RequestParam("s2") String s2) {
        String concatenate = service.concatenate(s1, s2);
        return ResponseEntity.ok(concatenate);
    }

}
