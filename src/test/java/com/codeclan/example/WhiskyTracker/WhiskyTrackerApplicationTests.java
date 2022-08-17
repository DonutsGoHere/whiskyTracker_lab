package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.DataInput;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {

	@Autowired
	WhiskyRepository whiskyRepository;

	@Autowired
	DistilleryRepository distilleryRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void	canFindWhiskysByYear() {
		List<Whisky> foundWhiskys = whiskyRepository.findWhiskysByYear(2014);
		System.out.println(foundWhiskys);
		assertEquals(4,foundWhiskys.size());
	}

	@Test
	public void canFindDistillerysByRegion() {
		List<Distillery> foundDistillerys = distilleryRepository.findByRegion("Speyside");
		System.out.println(foundDistillerys);
		assertEquals(3, foundDistillerys.size());
	}

	@Test
	public void	canFindWhiskysByAge() {
		List<Whisky> foundWhiskysByAge = whiskyRepository.findWhiskysByDistilleryIdAndAge(1L,12);
		System.out.println(foundWhiskysByAge);
		assertEquals(1, foundWhiskysByAge.size());
	}

}
