package br.com.casaCodigo;

import br.com.casaCodigo.interfaces.CalculoValor;
import br.com.casaCodigo.model.Veiculo;

public class ContaEstacionamento {
	
	private CalculoValor calculo;
	
	private Veiculo veiculo;
	private long inicio;
	private long fim;
	
	//----------------------------------------------
	//----------------------------------------------
	
	public double valorConta() {
		return calculo.calcular(fim-inicio, veiculo);
	}
	
	//----------------------------------------------
	//----------------------------------------------
	
	public void setCalculo(CalculoValor calculo) {
		this.calculo=calculo;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public long getInicio() {
		return inicio;
	}

	public void setInicio(long inicio) {
		this.inicio = inicio;
	}

	public long getFim() {
		return fim;
	}

	public void setFim(long fim) {
		this.fim = fim;
	}
	
}
