package com.test.singleton;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class TestSingletonService {

	/*
	 * @Autowired private ProtoTypeService proSrv;
	 */

	// @Autowired
	// ApplicationContext app;

	@Async
	public String getTime() throws Exception{
		// return proSrv.getTime();
		// return app.getBean(ProtoTypeService.class).getTime();
		Thread.sleep(2000);
        System.out.println("Inside service method of get time @@@@@@");
		return getService().getTime();
	}

	@Lookup
	public ProtoTypeService getService() {

		return null;
	}
}
