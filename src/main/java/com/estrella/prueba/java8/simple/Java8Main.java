package com.estrella.prueba.java8.simple;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import com.estrella.prueba.java8.simple.inter.Calculadora;
import com.estrella.prueba.java8.simple.inter.Edad;
import com.estrella.prueba.java8.simple.inter.Fechas;

public class Java8Main {

	public static void main(String[] args) {
		Java8Main main = new Java8Main();
		main.ordenarCadenas();
		main.calculadoraBasica();
		main.diferenciaFechas();
		main.filtrarLista();
		main.imprimirLista();
		main.transformarLista();
		main.sumaLista();
		main.calcularEdad();
		main.filtroPersonalizado();
		main.agrupadorElementos();
	}

	private void ordenarCadenas() {
		System.out.println("1.Crear un programa que utilice expresiones lambda para ordenar una lista de cadenas.");
		String[] arrayString = { "ROJO", "VERDE", "AZUL", "AMARILLO" };
		Arrays.stream(arrayString).sorted().forEach(System.out::println);
	}

	private void calculadoraBasica() {
		System.out.println(
				"\n2.Desarrollar un programa que utilice la interfaz de funciones para realizar operaciones matemáticas básicas.");
		Calculadora suma = (x, y) -> x + y;
		Calculadora resta = (x, y) -> x - y;
		Calculadora multiplicacion = (x, y) -> x * y;
		Calculadora division = (x, y) -> x / y;
		int n1 = 2, n2 = 6;
		System.out.println(suma.operacion(n1, n2));
		System.out.println(resta.operacion(n1, n2));
		System.out.println(multiplicacion.operacion(n1, n2));
		System.out.println(division.operacion(n1, n2));
	}

	private void diferenciaFechas() {
		System.out.println(
				"\n3.Implementar un programa que utilice el nuevo API de fecha y hora para calcular la diferencia entre dos fechas.");
		Fechas fechas = (x, y) -> java.time.Duration.between(x, y).toHours();
		System.out.println("La diferencia en horas es: " + fechas.diferenciaFechas(
				LocalDateTime.of(2022, 05, 12, 7, 32, 57, 60), LocalDateTime.of(2024, 05, 4, 9, 12, 32, 15)));
	}

	private void filtrarLista() {
		System.out.println("\n4.Escribir un programa que utilice streams para filtrar una lista de objetos.");
		List<String> listString = new ArrayList<>();
		listString.add("ROJO");
		listString.add("AZUL");
		listString.add("AMARILLO");
		listString.add("VERDE");
		listString.stream().filter(x -> x.startsWith("A")).forEach(System.out::println);
	}

	private void imprimirLista() {
		System.out.println(
				"\n5.Desarrollar un programa que utilice el método forEach para imprimir los elementos de una lista.");
		List<String> listString = new ArrayList<>();
		listString.add("ROJO");
		listString.add("AZUL");
		listString.add("AMARILLO");
		listString.add("VERDE");
		listString.forEach(System.out::println);
	}

	private void transformarLista() {
		System.out.println(
				"\n6.Crear un programa que utilice el método map para transformar los elementos de una lista.");
		List<String> listString = new ArrayList<>();
		listString.add("ROJO");
		listString.add("AZUL");
		listString.add("AMARILLO");
		listString.add("VERDE");
		listString.stream().map(String::toLowerCase).forEach(System.out::println);
	}

	private void sumaLista() {
		System.out.println(
				"\n7.Implementar un programa que utilice el método reduce para calcular la suma de una lista de números.");
		List<Integer> listInteger = new ArrayList<>();
		listInteger.add(9);
		listInteger.add(2);
		listInteger.add(6);
		listInteger.add(4);
		System.out.println(listInteger.stream().reduce(Integer::sum).get());
	}

	private void calcularEdad() {
		System.out.println(
				"\n8.Escribir un programa que utilice el nuevo API de fecha y hora para calcular la edad de una persona.");
		Edad edad = (x) -> Period.between(x, LocalDate.now()).getYears();
		System.out.println("La edad es: " + edad.obtenerEdad(LocalDate.of(1993, 10, 1)));
	}

	private void filtroPersonalizado() {
		System.out.println(
				"\n9.Desarrollar un programa que utilice expresiones lambda para implementar un filtro personalizado.");
		List<Integer> listInteger = new ArrayList<>();
		listInteger.add(5);
		listInteger.add(2);
		listInteger.add(6);
		listInteger.add(7);
		listInteger.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
	}

	private void agrupadorElementos() {
		System.out.println(
				"\n10.Implementar un programa que utilice el método collect para agrupar elementos de una lista.");
		List<String> listString = new ArrayList<>();
		listString.add("ROJO");
		listString.add("AZUL");
		listString.add("AMARILLO");
		listString.add("VERDE");
		listString.stream().collect(Collectors.groupingBy(String::length))
				.forEach((x, y) -> System.out.println("Longitud " + x + ": " + y));
	}
}
