import java.math.BigDecimal;

import br.com.loja.imposto.CalculadoraDeImpostos;
import br.com.loja.imposto.ISS;
import br.com.loja.orcamento.Orcamento;

public class TesteImpostos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Orcamento orcamento = new Orcamento(new BigDecimal("100"));		
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();		
		System.out.println(calculadora.calcular(orcamento, new ISS()));						
	}
}
