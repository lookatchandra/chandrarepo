package com.test.json;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConfList {

	 
	private List<Config> vnflist;

	public List<Config> getVnflist() {
		return vnflist;
	}

	public void setVnflist(List<Config> vnflist) {
		this.vnflist = vnflist;
	}

	@Override
	public String toString() {
		return "ConfList [vnflist=" + vnflist + "]";
	}

	
	
	
	
	
}
