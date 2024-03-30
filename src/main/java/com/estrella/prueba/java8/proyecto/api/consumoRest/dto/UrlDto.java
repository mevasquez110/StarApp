package com.estrella.prueba.java8.proyecto.api.consumoRest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UrlDto {

	@JsonProperty("name")
	private String name;

	@JsonProperty("url")
	private String url;
}
