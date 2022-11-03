package application;
// ============== Cálculos com data e hora ============== \\


import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Program {

	@SuppressWarnings("all")
	public static void main(String[] args) {

		/**
		 * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		 */
		
		LocalDate d01 = LocalDate.parse("2022-10-09");
		LocalDateTime d02 = LocalDateTime.parse("2022-10-09T01:34:32");
		Instant d03 = Instant.parse("2022-10-09T01:34:32Z");
		
		// Reduz ou aumenta o numero de dias/meses/semanas/anos
		LocalDate pastWeekLocalDate = d01.minusDays(7);
		LocalDate nextWeekLocalDate = d01.plusDays(7);
		
		System.out.println("pastWeekLocalDate: " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate: " + nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d02.minusDays(7);
		
		System.out.println("pastWeekLocalDateTime: " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDateTime);
		
		// Para "Instant" é necessário utilizar o método temporal
		Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekInstant: " + pastWeekInstant);
		System.out.println("nextWeekInstant: " + nextWeekInstant);
		
		// "Duration" calcula a diferença entre duas data/hora
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atTime(0, 0));
		Duration t2 = Duration.between(pastWeekLocalDateTime, d02);
		Duration t3 = Duration.between(pastWeekInstant, d03);
		Duration t4 = Duration.between(d03, pastWeekInstant);
		
		System.out.println("t1 dias: " + t1.toDays());
		System.out.println("t2 dias: " + t2.toDays());
		System.out.println("t3 dias: " + t3.toDays());
		System.out.println("t4 dias: " + t4.toDays());
		
		
		listTimeZones("xxx");	// Método com argumento filtrado

	}
	
	public static void listTimeZones(String search) {
		// Método para buscar timezones
		for (String s : ZoneId.getAvailableZoneIds()) {
			if (s.contains(search)) {
				System.out.println(s);
			}
		}
	}

}
