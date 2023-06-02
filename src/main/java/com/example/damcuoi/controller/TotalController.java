package com.example.damcuoi.controller;


import com.example.damcuoi.response.TotalResponse;
import com.example.damcuoi.service.ITotalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/wedding/total")
public class TotalController {

    @Autowired
    private ITotalService totalService;

    @GetMapping()
    public ResponseEntity<?> total(){
        TotalResponse response = totalService.getTotal();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
