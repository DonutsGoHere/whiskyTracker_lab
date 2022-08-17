package com.codeclan.example.WhiskyTracker.repositories;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WhiskyRepository extends JpaRepository<Whisky, Long> {

//    find all whiskys for a particular year
    List<Whisky> findWhiskysByYear (int year);


    List<Whisky> findWhiskysByDistilleryIdAndAge (Long id, int age);

    List<Whisky> findWhiskysByDistilleryRegion (String region);

}
