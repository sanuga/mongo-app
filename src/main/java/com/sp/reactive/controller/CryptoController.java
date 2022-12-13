package com.sp.reactive.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sp.reactive.service.CryptoSync;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/crypto")
public class CryptoController {

    @Autowired
    private CryptoSync cryptoSync;

    @GetMapping
    public void getAllUsers() throws JsonProcessingException {
        cryptoSync.syncCrypto();
    }

}