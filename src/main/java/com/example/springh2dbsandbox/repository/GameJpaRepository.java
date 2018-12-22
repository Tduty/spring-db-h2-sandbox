package com.example.springh2dbsandbox.repository;

import com.example.springh2dbsandbox.model.GameEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameJpaRepository extends CrudRepository<GameEntity, Integer> {
}
