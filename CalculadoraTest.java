import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void diferenca() {

        // preparação
        Calculadora calcula = new Calculadora();
        calcula.setA(10);
        calcula.setB(5);

        //
        int diferenca = calcula.diferenca();

        //validação
        assertEquals(5, diferenca);

    }



    @org.junit.jupiter.api.Test
    void divisao() {
        Calculadora calcula = new Calculadora();
        calcula.setA(10);
        calcula.setB(5);

        int divisao = calcula.divisao();

        //validação
        assertEquals(2, divisao);
    }



    @org.junit.jupiter.api.Test
    void produto() {
        Calculadora calcula = new Calculadora();
        calcula.setA(5);
        calcula.setB(5);

        int produto = calcula.produto();

        //validação
        assertEquals(25, produto);

    }

    @org.junit.jupiter.api.Test
    void soma() {
        Calculadora calcula = new Calculadora();
        calcula.setA(50);
        calcula.setB(50);
        int soma = calcula.soma();

        //validação
        assertEquals(100, soma);


    }
}