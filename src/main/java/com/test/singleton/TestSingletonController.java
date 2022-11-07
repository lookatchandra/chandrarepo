package com.test.singleton;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSingletonController {

	@Autowired
	private TestSingletonService tstSingle;

	@GetMapping("/test/date")
	public ResponseEntity<?> getSingletonDateTest() throws InterruptedException, Exception {
		System.out.println("Current datetime :: " + LocalDateTime.now());
		String first = tstSingle.getTime();
		System.out.println("Current datetime method call ####### ");
		Thread.sleep(2000);
		String second = tstSingle.getTime();
		System.out.println("Current datetime method call &&&&&& ");
		return new ResponseEntity<List<String>>(Arrays.asList(first, second), HttpStatus.OK);
	}
}
