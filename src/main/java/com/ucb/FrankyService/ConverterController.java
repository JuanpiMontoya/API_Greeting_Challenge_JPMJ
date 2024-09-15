package com.ucb.FrankyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConverterController {
    ConverterService converterService;

    public ConverterController(ConverterService converterService) {
        this.converterService = converterService;
    }


//    Converter Service converterService;
//    @Autowired

    @GetMapping("/status")
    public String getStatus() {
        return "OK";
    }

    @PostMapping("/converter/celsius-to-fahrenheit")
    public ResponseEntity<ConverterResponseDto> celsiusToFahrenheit(@RequestBody ConverterRequestDto converterRequestDto) {
        ConverterResponseDto response= new ConverterResponseDto(
                converterService.celsiusToFahrenheit(converterRequestDto.value()),
                "F"
        );
        return ResponseEntity.ok(response);
    }

    @PostMapping("/converter/bolivian-to-dollar")
    public ResponseEntity<ConverterResponseDto> bolivianToDollar(@RequestBody ConverterRequestDto converterRequestDto) {
        ConverterResponseDto response= new ConverterResponseDto(
                converterService.bolivianToDollar(converterRequestDto.value()),
                "Dollar"
        );
        return ResponseEntity.ok(response);
    }
}
