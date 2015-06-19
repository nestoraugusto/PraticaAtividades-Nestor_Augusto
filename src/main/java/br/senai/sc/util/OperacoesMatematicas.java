package br.senai.sc.util;

public class OperacoesMatematicas {

	public static Double somaDoisValoresReais(Double num1, Double num2) {
		Double x = num1;
		Double y = num2;
		
		if (x != null && y != null) {
			double soma;
			soma = x+y;
			return soma;
		}
		throw new NumberFormatException(
				"Voce deve passar dois valores para o calculo.");
	}

	public static Double subtraiDoisValoresReais(Double num1, Double num2) {
		Double x = num1;
		Double y = num2;
		if (x != null && y != null) {
			Double subtracao;
			subtracao = x-y;
			return subtracao;
		} 
		throw new NumberFormatException(
				"Voce deve passar dois valores para o calculo.");
	}

	public static Double multiplicaDoisValoresReais(Double num1, Double num2) {
		Double x = num1;
		Double y = num2;
		if (x != null && y != null) {
			Double multiplicacao; 
			multiplicacao = x*y;
			return multiplicacao;
		}
		throw new NumberFormatException(
				"Voce deve passar dois valores para o calculo.");
	}

	public static Double divideDoisValoresReais(Double num1, Double num2) {
		Double x = num1;
		Double y = num2;
		if (y == 0) {
			throw new NumberFormatException(
					"Não é possivel dividir um numero por zero.");
		}
		
		if (x != null && y != null) {
				Double divisao;
				divisao = x/y;
			return divisao; 
		}
		throw new NumberFormatException(
				"Voce deve passar dois valores para o calculo.");
	} 

}
