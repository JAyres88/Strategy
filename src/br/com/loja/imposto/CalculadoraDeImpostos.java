package br.com.loja.imposto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		
		return imposto.calcular(orcamento);
	
		/*
		 * método abaixo para calculo de imposto será substituido pelas classes
		 * implementando strategy para  
		 *
		/*
		switch (TipoImposto) {
		case ICMS:
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		case ISS:
			return orcamento.getValor().multiply(new BigDecimal("0.06"));		
		default:
				return BigDecimal.ZERO;
				*/
	}			
		
}
