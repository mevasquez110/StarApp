package com.estrella.prueba.java8.simple.inter;

import java.time.LocalDateTime;

@FunctionalInterface
public interface Fechas {
	
	public long diferenciaFechas(LocalDateTime d1, LocalDateTime d2);
	
}
