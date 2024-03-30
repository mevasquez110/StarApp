package com.estrella.prueba.java8.proyecto.api.consumoRest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class FlavorsDto {

	@JsonProperty("potency")
	private Integer potency;

	@JsonProperty("flavor")
	private UrlDto flavor;
}
