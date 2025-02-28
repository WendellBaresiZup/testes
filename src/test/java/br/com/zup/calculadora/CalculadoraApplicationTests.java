package br.com.zup.calculadora;

import br.com.zup.calculadora.services.CalculadoraService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculadoraApplicationTests {
	private CalculadoraService calculadoraService = new CalculadoraService();

	@Test
	void contextLoads() {
	}

	@Test
	public void adicaoTest(){
		assertEquals(5, calculadoraService.adicao(2,3));
	}

}
