package com.sprphnx.camel;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sprphnx.camel.model.FullInformationDto;

@SpringBootApplication
public class LearnCamelApplication implements CommandLineRunner{
	
    @Produce("direct:primary")
    private ProducerTemplate template;

	public static void main(String[] args) {
		SpringApplication.run(LearnCamelApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<FullInformationDto> fullInformationDtos = populateFullInfos();
		
		template.asyncSendBody(template.getDefaultEndpoint(), fullInformationDtos).get();
		
	}
	
	private List<FullInformationDto> populateFullInfos(){
		List<FullInformationDto> lists = new ArrayList<>();
		lists.add(new FullInformationDto("John", "David", "Tvm", "Kerala", "India"));
		lists.add(new FullInformationDto("Mary", "David", "Kollam", "Kerala", "India"));
		lists.add(new FullInformationDto("Peter", "David", "Ekm", "Kerala", "India"));
		lists.add(new FullInformationDto("Honai", "David", "Kannur", "Kerala", "India"));
		lists.add(new FullInformationDto("Jasmine", "David", "Palakkad", "Kerala", "India"));
		
		return lists ;
	}

}
