package com.miage.altea.tp.trainer_api.controller;

import com.miage.altea.tp.trainer_api.bo.Trainer;
import com.miage.altea.tp.trainer_api.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/trainers")
public class TrainerController {
    private final TrainerService trainerService;

    @Autowired
    TrainerController(TrainerService trainerService){
        this.trainerService = trainerService;
    }

    @GetMapping(value = "/")
    Iterable<Trainer> getAllTrainers(){
         return trainerService.getAllTrainers();

    }
    @GetMapping(value = "/{name}")
    Trainer getTrainer(@PathVariable("name") String name){
        return  trainerService.getTrainer(name);

    }

}
