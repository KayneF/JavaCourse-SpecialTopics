package application;
// ============== Convertendo data/hora global/local ============== \\


import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {

		/**
		 * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		 */
		
		LocalDate d01 = LocalDate.parse("2022-10-09");
		LocalDateTime d02 = LocalDateTime.parse("2022-10-09T01:34:32");
		Instant d03 = Instant.parse("2022-10-09T01:34:32Z");
		
		// Converte a data/hora local para global
		LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
		
		/**
		 * Note que no primeiro exemplo, a data volta para um dia anterior,
		 * isso se deve ao fato de que no horário mencionado do fuso (Portugal),
		 * o dia ainda não tinha passado para o horário local.
		 */
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println();
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
		// Métodos para isolar os valores de data
		System.out.println();
		System.out.println("Dia do mês (d01): " + d01.getDayOfMonth());
		System.out.println("Dia do ano (d01): " + d01.getDayOfYear());
		System.out.println("Dia da semana (d01): " + d01.getDayOfWeek());
		System.out.println("Mês (d01): " + d01.getMonth());
		System.out.println("Mês número (d01):  = " + d01.getMonthValue());
		System.out.println("Ano (d01): " + d01.getYear());
		System.out.println("Horas (d02): " + d02.getHour());
		System.out.println("Minutos (d02): " + d02.getMinute());
		System.out.println("Segundos (d02): " + d02.getSecond());
		
		
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
