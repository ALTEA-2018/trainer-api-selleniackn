package com.miage.altea.tp.trainer_api.controller;

import com.miage.altea.tp.trainer_api.bo.Trainer;
import com.miage.altea.tp.trainer_api.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "http://localhost:8081/")
public class TrainerController {
    private final TrainerService trainerService;

    @Autowired
    TrainerController(TrainerService trainerService){
        this.trainerService = trainerService;
    }

    @GetMapping(value = "trainers/")
    Iterable<Trainer> getAllTrainers(){
        Iterable<Trainer> listTrainer = trainerService.getAllTrainers();
        return listTrainer;
    }
    @GetMapping(value = "trainers/{name}")
    Trainer getTrainer(String name){
        Trainer tr = trainerService.getTrainer(name);
        return  tr;
    }

}
