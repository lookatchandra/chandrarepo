package com.test.SpringTest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.SpringTest.exception.CustomeException;

@RestController
public class TestController {

	@Autowired
	private CustRepo repo;

	@PostMapping("/create/customer")
	public String createCustomer(@RequestBody CustomerDTO cust) {
		//repo.saveAll(cust.getCust());
		return "Customer Created";
	}

	@GetMapping("/customer/{id}")
	public CustomerEnt getCustomer(@PathVariable Integer id) {

		Optional<CustomerEnt> custOp = repo.findById(id);
		System.out.println("Insise method");
		if (custOp.isPresent()) {
			System.out.println("Customer Present");
			return custOp.get();
		} else {
			System.out.println("Error block");
			throw new CustomeException("E0001","Customer with id " + id + " not found.");
		}
	}

	/*
	 * @GetMapping("/test/date") public ResponseEntity<?> getSingletonDateTest()
	 * throws InterruptedException { String first = tstSingle.getTime();
	 * Thread.sleep(1000); String second = tstSingle.getTime(); return new
	 * ResponseEntity<List<String>>(Arrays.asList(first, second), HttpStatus.OK); }
	 */
}
