package com.example.springh2dbsandbox.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "Location")
public class LocationEntity {

    @Id
    @GeneratedValue
    private Integer idLocation;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("state")
    private Integer state;

    @OneToMany(mappedBy="location", targetEntity=GameEntity.class)
    @JsonIgnore
    private Set<GameEntity> gameEntities = new HashSet<>();

    public LocationEntity() {

    }

    public LocationEntity(String name, String description, Integer state, Set<GameEntity> gameEntities) {
        this.name = name;
        this.description = description;
        this.state = state;
        this.gameEntities = gameEntities;
    }

    public Integer getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(Integer idLocation) {
        this.idLocation = idLocation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Set<GameEntity> getGameEntities() {
        return gameEntities;
    }

    public void setGameEntities(Set<GameEntity> gameEntities) {
        this.gameEntities = gameEntities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocationEntity that = (LocationEntity) o;
        return Objects.equals(idLocation, that.idLocation) &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description) &&
                Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLocation, name, description, state);
    }

    @Override
    public String toString() {
        return "LocationEntity{" +
                "idLocation=" + idLocation +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", state=" + state +
                '}';
    }
}
