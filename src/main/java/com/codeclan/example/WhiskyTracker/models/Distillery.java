package com.codeclan.example.WhiskyTracker.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "distillerys")
public class Distillery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "region")
    private String region;

    @JsonIgnoreProperties({"distillerys"})
    @OneToMany(mappedBy = "distillery")
    private List<Whisky> whiskys;

    public Distillery(String name, String region) {
        this.name = name;
        this.region = region;
        this.whiskys = new ArrayList<>();
    }

    public Distillery() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<Whisky> getWhiskys() {
        return whiskys;
    }

    public void setWhiskys(List<Whisky> whiskys) {
        this.whiskys = whiskys;
    }
}

