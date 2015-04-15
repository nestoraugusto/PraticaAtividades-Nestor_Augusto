package br.senai.sc.util;

import org.junit.Test;

import junit.framework.TestCase;

public class ValidadorCPFTest extends TestCase{
		
	@Test
		public static void testRetiraCaracteresInvalidosSomentePontoHifen(){
				String cpfParaValidar ="592.764.436-81";
				String cpfApenasNumeros = ValidadorCPF.retiraCaracteresInvalidos(cpfParaValidar);
				assertEquals("59276443681", cpfApenasNumeros);
		}
	@Test
	public static void testRetiraCaracteresInvalidosSomenteLetras(){
		String cpfParaValidar ="59276443681hkhkdhfkj";
		String cpfApenasNumeros = ValidadorCPF.retiraCaracteresInvalidos(cpfParaValidar);
		assertEquals("59276443681", cpfApenasNumeros);
	}
	@Test
	public static void testRetiraCaracteresInvalidosSomenteSimbolosEspeciais(){
		String cpfParaValidar ="59276443681%^%#^&*(&(^$%#";
		String cpfApenasNumeros = ValidadorCPF.retiraCaracteresInvalidos(cpfParaValidar);
		assertEquals("59276443681", cpfApenasNumeros);
	}
	
	
	
	@Test
	public static void testIsCPFPadraoT1(){
		String cpfParaValidar = "11111111111";
		boolean cpfPadrao = ValidadorCPF.isCPFPadrao(cpfParaValidar);
		assertEquals(true, cpfPadrao);
	}
	
	@Test
	public static void testIsCPFPadraoT2(){
		String cpfParaValidar = "22222222222";
		boolean cpfPadrao = ValidadorCPF.isCPFPadrao(cpfParaValidar);
		assertEquals(true, cpfPadrao);
	}
	
	@Test
	public static void testIsCPFPadraoT3(){
		String cpfParaValidar = "33333333333";
		boolean cpfPadrao = ValidadorCPF.isCPFPadrao(cpfParaValidar);
		assertEquals(true, cpfPadrao);
	}

	
	@Test
	public static void testIsCPFPadraoT4(){
		String cpfParaValidar = "44444444444";
		boolean cpfPadrao = ValidadorCPF.isCPFPadrao(cpfParaValidar);
		assertEquals(true, cpfPadrao);
	}
	
	@Test
	public static void testvalidaCPFNulo(){
		String cpfParaValidar = "";
		boolean cpfPadrao = ValidadorCPF.validaCPF(cpfParaValidar);
		assertEquals(false, cpfPadrao);
	}
	
	@Test
	public static void testvalidaCPFCOMCARACTER(){
		String cpfParaValidar = "123.456.789-2";
		boolean cpfPadrao = ValidadorCPF.validaCPF(cpfParaValidar);
		assertEquals(false, cpfPadrao);
	}
	

	@Test
	public static void testvalidaCPFCOMMAIS(){
		String cpfParaValidar = "12345678921";
		boolean cpfPadrao = ValidadorCPF.validaCPF(cpfParaValidar);
		assertEquals(false, cpfPadrao);
	}
	@Test
	public static void testvalidaCPFCOMMENOS(){
		String cpfParaValidar = "123456789";
		boolean cpfPadrao = ValidadorCPF.validaCPF(cpfParaValidar);
		assertEquals(false, cpfPadrao);
	}
	
	@Test
	public static void testcalculaDigitoVerificador(){
		String cpfParaValidar = "088388833";
		String cpfPadrao = ValidadorCPF.calculaDigitoVerificador(cpfParaValidar);
		assertEquals("51", cpfPadrao);
	}
	@Test
	public static void testcalculaDigitoVerificado1(){
		String cpfParaValidar = "960039142";
		String cpfPadrao = ValidadorCPF.calculaDigitoVerificador(cpfParaValidar);
		assertEquals("46", cpfPadrao);
	}
	
	@Test
	public static void testcalculaDigitoVerificado2(){
		String cpfParaValidar = "831815805";
		String cpfPadrao = ValidadorCPF.calculaDigitoVerificador(cpfParaValidar);
		assertEquals("97", cpfPadrao);
	}
	@Test
	public static void testcalculaDigitoVerificado3(){
		String cpfParaValidar = "733217172";
		String cpfPadrao = ValidadorCPF.calculaDigitoVerificador(cpfParaValidar);
		assertEquals("47", cpfPadrao);
	}
	
	
	
}
