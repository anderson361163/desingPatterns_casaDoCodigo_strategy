package br.com.casaCodigo.algoritmo;

import br.com.casaCodigo.UtilHorarios;
import br.com.casaCodigo.interfaces.CalculoValor;
import br.com.casaCodigo.model.Veiculo;

public class CalculoDiaria implements CalculoValor {
	
	private double valorDiaria;
	
	/*
	 * Parametro que o estacionamento está utilizando
	 * O valor da diaria em cidades brasileiras:
	 * 
	 *   - São Paulo (Avenida Paulista) : R$ 70,00
     *   - Rio de Janeiro (Avenida Rio Branco): R$ 60,00
     *   - Salvador	(Avenida Tancredo Neves): R$ 55,00
     *   - Brasília	(Eixo Monumental): R$ 50,00
     *   
	 */
	public CalculoDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	@Override
	public double calcular(long periodo, Veiculo veiculo) {
		return valorDiaria * Math.ceil(periodo / UtilHorarios.HORA);
	}

}
