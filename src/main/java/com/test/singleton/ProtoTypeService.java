package com.test.singleton;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ProtoTypeService {

	private String datetime = LocalDateTime.now().toString();

	public String getTime() {
		return datetime;
	}
	
}
