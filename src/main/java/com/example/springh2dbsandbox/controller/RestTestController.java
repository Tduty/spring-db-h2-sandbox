package com.example.springh2dbsandbox.controller;

import com.example.springh2dbsandbox.model.GameEntity;
import com.example.springh2dbsandbox.model.LocationEntity;
import com.example.springh2dbsandbox.repository.GameJpaRepository;
import com.example.springh2dbsandbox.repository.LocationJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@RestController
public class RestTestController {

    private GameJpaRepository gameRepository;
    private LocationJpaRepository locationRepository;

    @Autowired
    public RestTestController(GameJpaRepository gameRepository, LocationJpaRepository locationRepository) {
        this.gameRepository = gameRepository;
        this.locationRepository = locationRepository;
    }

    @GetMapping("/game")
    @Transactional
    public List<GameEntity> getGame() {
        List<GameEntity> list = new ArrayList<>();
        gameRepository.findAll().forEach(testEntity -> list.add(testEntity));
        return list;
    }

    @GetMapping("/loaction")
    @Transactional
    public List<LocationEntity> getLocation() {
        List<LocationEntity> list = new ArrayList<>();
        locationRepository.findAll().forEach(testEntity -> list.add(testEntity));
        return list;
    }

    @PostMapping("/game")
    public void addGame(@RequestBody GameEntity object) {
        gameRepository.save(object);
    }
}
