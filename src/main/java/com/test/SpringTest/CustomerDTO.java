package com.test.SpringTest;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {

	private List<CustomerEnt> cust;

	/*public List<CustomerEnt> getCust() {
		return cust;
	}

	public void setCust(List<CustomerEnt> cust) {
		this.cust = cust;
	}*/

}
