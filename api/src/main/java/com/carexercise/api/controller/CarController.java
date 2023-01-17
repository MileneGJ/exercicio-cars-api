package com.carexercise.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carexercise.api.dto.CarDTO;

@RestController
@RequestMapping("/cars")
public class CarController {

    @GetMapping
    public String helloSpring(){
        return "Welcome to cars api!";
    }
    
    @PostMapping
    public void createCar(@RequestBody CarDTO req) {
        System.out.println("Você inseriu o carro "+
        req.modelo()+
        " do ano "+
        req.anoModelo()+
        " fabricado por "+
        req.fabricante()+
        " em "+
        req.dataFabricacao());
    }
}
