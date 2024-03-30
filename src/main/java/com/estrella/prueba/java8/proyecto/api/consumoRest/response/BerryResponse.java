package com.estrella.prueba.java8.proyecto.api.consumoRest.response;

import java.util.List;
import com.estrella.prueba.java8.proyecto.api.consumoRest.dto.FlavorsDto;
import com.estrella.prueba.java8.proyecto.api.consumoRest.dto.UrlDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BerryResponse {

	@JsonProperty("id")
	private Integer id;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("growth_time")
	private Integer growth_time;
	
	@JsonProperty("max_harvest")
	private Integer max_harvest;
	
	@JsonProperty("natural_gift_power")
	private Integer natural_gift_power;
	
	@JsonProperty("size")
	private Integer size;
	
	@JsonProperty("smoothness")
	private Integer smoothness;
	
	@JsonProperty("soil_dryness")
	private Integer soil_dryness;
	
	@JsonProperty("firmness")
	private UrlDto firmness;
	
	@JsonProperty("flavors")
	private List<FlavorsDto> flavors;
	
	@JsonProperty("item")
	private UrlDto item;
	
	@JsonProperty("natural_gift_type")
	private UrlDto natural_gift_type;
}
