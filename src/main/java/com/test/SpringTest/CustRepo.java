package com.test.SpringTest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustRepo extends JpaRepository<CustomerEnt, Integer>{

}
