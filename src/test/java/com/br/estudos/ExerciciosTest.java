package com.br.estudos;

import com.br.estudos.exercicios.Exercicios;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class ExerciciosTest {

	@Test
	void testeSoma() {
		Exercicios exercicios = new Exercicios();
		Integer resultado = exercicios.soma(1, 2);
		Assert.isTrue(resultado == 3, "Valor da soma incorreto");
	}

}