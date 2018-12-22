package com.example.springh2dbsandbox.repository;

import com.example.springh2dbsandbox.model.PlayerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerJpaRepository extends CrudRepository<PlayerEntity, Integer> {
}
