package com.example.springh2dbsandbox.repository;

import com.example.springh2dbsandbox.model.TournamentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TournamentJpaRepository extends CrudRepository<TournamentEntity, Integer> {
}
