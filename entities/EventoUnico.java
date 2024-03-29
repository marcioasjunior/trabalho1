package entities;

import java.time.LocalDate;

public class EventoUnico extends Evento {
	
	public EventoUnico(String titulo, String descricao, LocalDate dataInicio, LocalDate dataFinal, String localizacao){
        super(titulo, descricao, dataInicio, dataFinal, localizacao);
        }
	
        @Override
        public void imprimirDetalhes() {
            System.out.println("Evento Único: " + titulo + " - " + descricao); 
        }
}
