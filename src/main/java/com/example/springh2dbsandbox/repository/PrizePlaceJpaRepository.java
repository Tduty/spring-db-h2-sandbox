package com.example.springh2dbsandbox.repository;

import com.example.springh2dbsandbox.model.PrizePlaceEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrizePlaceJpaRepository extends CrudRepository<PrizePlaceEntity, Integer> {
}
