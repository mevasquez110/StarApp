package com.estrella.prueba.java8.simple;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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
		main.calcularPromedio();
		main.calcularFactorial();
		main.esPar();
		main.obtenerMayor();
		main.obtenerMenor();
		main.obtenerRepeat();
	}

	private void ordenarCadenas() {
		System.out.println("1.Crear un programa que utilice expresiones lambda para ordenar una lista de cadenas.");
		String[] arrayString = { "ROJO", "VERDE", "AZUL", "AMARILLO" };
		Arrays.stream(arrayString).sorted().forEach(System.out::println);
	}

	private void calculadoraBasica() {
		System.out.println(
				"\n2.Desarrollar un programa que utilice la interfaz de funciones para realizar operaciones matemáticas básicas.");
		Double n1 = 2d, n2 = 6d;
		BinaryOperator<Double> suma = (x, y) -> x + y;
		BinaryOperator<Double> resta = (x, y) -> x - y;
		BinaryOperator<Double> multiplicacion = (x, y) -> x * y;
		BinaryOperator<Double> division = (x, y) -> x / y;
		System.out.println(suma.apply(n1, n2));
		System.out.println(resta.apply(n1, n2));
		System.out.println(multiplicacion.apply(n1, n2));
		System.out.println(division.apply(n1, n2));
	}

	private void diferenciaFechas() {
		System.out.println(
				"\n3.Implementar un programa que utilice el nuevo API de fecha y hora para calcular la diferencia entre dos fechas.");
		Fechas fechas = (x, y) -> java.time.Duration.between(x, y).toHours();
		LocalDateTime d1 = LocalDateTime.of(2022, 05, 12, 7, 32, 57, 60);
		LocalDateTime d2 = LocalDateTime.of(2024, 05, 4, 9, 12, 32, 15);
		System.out.println("La diferencia en horas es: " + fechas.diferenciaFechas(d1, d2));
	}

	private void filtrarLista() {
		System.out.println("\n4.Escribir un programa que utilice streams para filtrar una lista de objetos.");
		List<String> listString = List.of("ROJO", "AZUL", "AMARILLO", "VERDE");
		listString.stream().filter(x -> x.startsWith("A")).forEach(System.out::println);
	}

	private void imprimirLista() {
		System.out.println(
				"\n5.Desarrollar un programa que utilice el método forEach para imprimir los elementos de una lista.");
		List<String> listString = List.of("ROJO", "AZUL", "AMARILLO", "VERDE");
		listString.forEach(System.out::println);
	}

	private void transformarLista() {
		System.out.println(
				"\n6.Crear un programa que utilice el método map para transformar los elementos de una lista.");
		List<String> listString = List.of("ROJO", "AZUL", "AMARILLO", "VERDE");
		listString.stream().map(String::toLowerCase).forEach(System.out::println);
	}

	private void sumaLista() {
		System.out.println(
				"\n7.Implementar un programa que utilice el método reduce para calcular la suma de una lista de números.");
		List<Integer> listInteger = List.of(5, 2, 6, 7);
		System.out.println(listInteger.stream().reduce(Integer::sum).get());
	}

	private void calcularEdad() {
		System.out.println(
				"\n8.Escribir un programa que utilice el nuevo API de fecha y hora para calcular la edad de una persona.");
		Function<LocalDate, Integer> edad = (x) -> Period.between(x, LocalDate.now()).getYears();
		System.out.println("La edad es: " + edad.apply(LocalDate.of(1993, 10, 1)));
	}

	private void filtroPersonalizado() {
		System.out.println(
				"\n9.Desarrollar un programa que utilice expresiones lambda para implementar un filtro personalizado.");
		List<Integer> listInteger = List.of(5, 2, 6, 7);
		listInteger.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
	}

	private void agrupadorElementos() {
		System.out.println(
				"\n10.Implementar un programa que utilice el método collect para agrupar elementos de una lista.");
		List<String> listString = List.of("ROJO", "AZUL", "AMARILLO", "VERDE");
		listString.stream().collect(Collectors.groupingBy(String::length))
				.forEach((x, y) -> System.out.println("Longitud " + x + ": " + y));
	}

	private void calcularPromedio() {
		System.out.println(
				"\n11.Crear una función anónima que nos permita calcular el promedio de un arreglo de números enteros.");
		Integer[] arrayNumeros = { 1, 5, 7, 3, 4, 9 };
		System.out.println(
				"El promedio es: " + Arrays.stream(arrayNumeros).reduce(Integer::sum).get() / arrayNumeros.length);
	}

	private void calcularFactorial() {
		System.out.println("\n12.Crear una función anónima que calcule el factorial dado un número entero.");
		Integer numero = 3;
		System.out.println("El factorial es: " + IntStream.rangeClosed(1, numero).reduce((x, y) -> x * (y)).getAsInt());
	}

	private void esPar() {
		System.out.println("\n13.Crear una función anónima que permita conocer si un número es par.");
		Integer numero = 6;
		Predicate<Integer> esPar = (x) -> x % 2 == 0;
		System.out.println("El numero " + numero + " es: " + ((esPar.test(numero)) ? "Par" : "Impar"));
	}

	private void obtenerMayor() {
		System.out.println(
				"\n14.Dado un arreglo de números enteros, crear una función anónima que retorne el número mayor.");
		Integer[] arrayNumeros = { 1, 5, 7, 3, 4, 9 };
		System.out.println("El numero mayor es: " + Arrays.stream(arrayNumeros).reduce(Integer::max).get());
	}

	private void obtenerMenor() {
		System.out.println(
				"\n15.Dado un arreglo de números enteros, crear una función anónima que retorne el número menor.");
		Integer[] arrayNumeros = { 1, 5, 7, 3, 4, 9 };
		System.out.println("El numero menor es: " + Arrays.stream(arrayNumeros).reduce(Integer::min).get());
	}

	private void obtenerRepeat() {
		System.out.println(
				"\n16.Dado un arreglo de números enteros, crear una función anónima que retorne el número que más se repite.");
		Integer[] arrayNumeros = { 1, 5, 3, 3, 4, 9 };
		System.out.println("El numero que mas se repite es: "
				+ Arrays.stream(arrayNumeros).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
						.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null));
	}

}
