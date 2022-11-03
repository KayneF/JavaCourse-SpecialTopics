package application;
// ============== Instanciando data e hora ============== \\


import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {

		/**
		 * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		 */
		// Cria um padrão de formato para data e hora
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		// Instancia a data atual (local)
		LocalDate d01 = LocalDate.now();
		
		// Instancia a data e hora atual (local)
		LocalDateTime d02 = LocalDateTime.now();
		
		// Instancia a data atual (global)
		Instant d03 = Instant.now();
		
		// Converte uma data expecifica
		LocalDate d04 = LocalDate.parse("2022-10-09");
		
		// Converte uma data e hora expecifica
		LocalDateTime d05 = LocalDateTime.parse("2022-10-09T16:34:32");
		
		// Converte uma data e hora expecífica no horário global (UTC/Zulu)
		Instant d06 = Instant.parse("2022-10-09T16:34:32Z");
		
		// Converte uma data e hora expecífica no horário GMT expecificado
		Instant d07 = Instant.parse("2022-10-09T16:34:32-03:00");

		// Converte uma data e hora através de uma formatação
		LocalDate d08 = LocalDate.parse("09/10/2022", format);
		LocalDateTime d09 = LocalDateTime.parse("09/10/2022 16:34", format2);
		
		// Instancia um horario através de argumentos
		LocalDate d10 = LocalDate.of(2022, 10, 9);
		LocalDateTime d11 = LocalDateTime.of(2022, 10, 9, 16, 34);
		
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
		
		/**
		 * Por padrão, data e hora são apresentados no formato ISO8601,
		 * e já possuem o método toString incluso, dispensando a 
		 * necessidade de chamar o método de conversão ".toString()".
		 * Caso seja necessário converter para algum outro tipo de 
		 * padrão, é necessário usar o método de formatação, exibido
		 * na próxima demonstração (.datetimetostring).
		 */
	}

}
