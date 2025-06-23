package com.thiagodeas.qrcodegenerator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiagodeas.qrcodegenerator.dto.qrcode.QrCodeGenerateRequest;
import com.thiagodeas.qrcodegenerator.dto.qrcode.QrCodeGenerateResponse;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {

    @PostMapping
    public ResponseEntity<QrCodeGenerateResponse> generate(@RequestBody QrCodeGenerateRequest request) {
        return null;
    }
}
