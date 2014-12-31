package org.codersparks.elite.edsc;

import java.io.IOException;

import org.codersparks.elite.edsc.model.EDSCData;
import org.codersparks.elite.edsc.model.EDSCFilter;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Application {
	
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		System.out.println("Hello world!!!!");
		
		EDSCFilter filter = new EDSCFilter();
		
		filter.setCr(3);
		filter.setSystemname("sol");
		
		EDSCData data = new EDSCData();

		data.setFilter(filter);
		
		ObjectMapper mapper = new ObjectMapper();
		
		mapper.writeValue(System.out, data);
		
	}

}
