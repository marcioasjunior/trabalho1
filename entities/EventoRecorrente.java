package entities;

import java.time.LocalDate;

public class EventoRecorrente extends Evento {
	
    public EventoRecorrente(String titulo, String descricao, LocalDate dataInicio, LocalDate dataFinal, String localizacao){
        super(titulo, descricao, dataInicio, dataFinal, localizacao);
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Evento Recorrente: " + titulo + " - " + descricao); 
    }
}
