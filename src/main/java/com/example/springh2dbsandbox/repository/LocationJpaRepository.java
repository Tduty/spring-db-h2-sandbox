package com.example.springh2dbsandbox.repository;

import com.example.springh2dbsandbox.model.LocationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationJpaRepository extends CrudRepository<LocationEntity, Integer> {
}
