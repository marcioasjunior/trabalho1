package application;


import java.time.LocalDate;

import entities.Evento;
import entities.EventoPeriodico;
import entities.EventoRecorrente;
import entities.EventoUnico;
import entities.Participante;
import enums.DiaSemana;
import exceptions.DataInvalidaException;

public class Program {

	public static void main(String[] args) {
		
		try {
            Evento oficina = new EventoUnico("Oficina de Tecnologia", "Exposição de linguagens e técnicas de programação", LocalDate.of(2024, 3, 10), 
            		LocalDate.of(2024, 3, 12), "Estacionamento Passeio das Águas Shopping");
            Evento reuniao = new EventoRecorrente("Reuniao dos amigos ", "Reunião dos amigos da faculdade", LocalDate.of(2022, 4, 20), LocalDate.of(2022, 4, 21), "Barzinho do Zé");
            Evento festival = new EventoPeriodico("Festival de cinema", "Festival semanal de filmes clássicos", LocalDate.of(2023, 10, 12), LocalDate.of(2023, 10, 15), "Rua 8", DiaSemana.SEXTA);

            Participante participante1 = new Participante("Felipe Bueno");
            Participante participante2 = new Participante("Marcio Junior"); 

            oficina.adicionarParticipante(participante1);
            reuniao .adicionarParticipante(participante2);
            festival.adicionarParticipante(participante1);
            festival.adicionarParticipante(participante2);

            oficina.imprimirDetalhes();
            oficina.imprimirListaParticipantes();

           reuniao.imprimirDetalhes();
           reuniao.imprimirListaParticipantes();

           festival.imprimirDetalhes();
           festival.removerParticipante(participante2);
           festival.imprimirListaParticipantes();

            System.out.println("Tentando criar um evento com data de fim anterior à data de início...");
            Evento eventoDataInvalida = new EventoUnico("Evento Data Inválida", "Este evento não será criado", LocalDate.of(2024, 12, 1), LocalDate.of(2024, 11, 30), "Local Fantasma");

        } catch (DataInvalidaException e) {
            System.err.println("Erro ao criar evento: " + e.getMessage());
        }
 }	
	}	

