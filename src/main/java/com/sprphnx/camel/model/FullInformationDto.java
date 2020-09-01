package com.sprphnx.camel.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FullInformationDto {
	
	String fName;
	String lName;
	String city;
	String state;
	String country;

}
