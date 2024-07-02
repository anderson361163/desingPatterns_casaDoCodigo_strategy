package br.com.casaCodigo;

import br.com.casaCodigo.algoritmo.CalculoDiaria;
import br.com.casaCodigo.model.Veiculo;

public class Principal {

	public static void main(String[] args) {
		ContaEstacionamento estacionamento = new ContaEstacionamento();

		System.out.println("----------------------------------");
		
		System.out.println(" >> Estacionamento Casa do Código << ");
		
		System.out.println("1. Carro estacionando...");
		
		Veiculo carro = new Veiculo("ABC-123","Fusca");
		
		estacionamento.setVeiculo(carro);
		
		//DATA DE INICIO E FIM
		long inicio = System.currentTimeMillis();
        long fim = inicio + 2 * UtilHorarios.HORA;
		
        estacionamento.setInicio(inicio);
        estacionamento.setFim(fim);
        
        CalculoDiaria calculoDiaria = new CalculoDiaria(70.0);
        
        estacionamento.setCalculo(calculoDiaria);
        
        double valorConta = estacionamento.valorConta();
		
		System.out.println(" >> Por favor operador cobre R$ "+valorConta);
		System.out.println("1. Carro saindo...");
		
		
		System.out.println("----------------------------------");
		
	}

}
