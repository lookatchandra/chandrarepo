package com.test.json;

import java.io.File;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.codehaus.jackson.map.DeserializationConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.type.TypeReference;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.test.singleton.TestSingletonService;

@RestController
public class TestJsonController {

	@Autowired
	private TestJson tstSingle;

	@GetMapping("/test/json")
	public ResponseEntity<?> getJsonTest() throws InterruptedException, Exception {

		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
		objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

		// String json = "{ \"Name\": \"MME\", \"VNFD\": \"MME1111\" }";
		String json = "{\"vnflist\": [{ \"name\": \"MME\",\"vnfd\": \"MME1111\"	}, {\"name\": \"EPG\",\"vnfd\": \"EPG22222\"}]}";
		//String json = mainjson.substring("\"vnflist\":".length());
		System.out.println("json Value :: " + json);
		ConfList con = objectMapper.readValue(new File("C:\\Users\\echibhi\\TMUS_CODE_BASE\\TMUS_CODE_BASE_PI6\\tmo-cm-ccm\\SpringTest\\src\\main\\java\\com\\test\\json\\config.json"),
		ConfList.class);
		// Config con = objectMapper.readValue(json, Config.class);
		//ConfList con = objectMapper.readValue(json, ConfList.class);
		//List<Config> con= objectMapper.readValue(json, new TypeReference<List<Config>>(){});
		// Gson gson = new
		// GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		// Response response = gson.fromJson(yourJsonString, Response.class);
		// ConfList con = gson.fromJson(json, ConfList.class);
		System.out.println("Config Value :: " + con);
		// return new ResponseEntity<Config>(con, HttpStatus.OK);
		return new ResponseEntity<ConfList>(con, HttpStatus.OK);
	}
}
