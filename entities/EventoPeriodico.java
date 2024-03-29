package entities;

import java.time.LocalDate;
import enums.DiaSemana;

public class EventoPeriodico extends Evento {
	
	private DiaSemana diaSemana;

    public EventoPeriodico(String titulo, String descricao, LocalDate dataInicio, LocalDate dataFinal, String localizacao, DiaSemana diaSemana){
        super(titulo, descricao, dataInicio, dataFinal, localizacao);  
        this.diaSemana = diaSemana;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Evento Periódico: " + titulo + " - " + descricao + " - Dia da semana: " + diaSemana);
    }
	
}
