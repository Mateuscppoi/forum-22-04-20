package br.com.uniceumar.aula.calculadora;

import java.math.BigDecimal;

public class Subtracao implements Operacao {

    @Override
    public BigDecimal executar(BigDecimal n1, BigDecimal n2) {
        return n1.subtract(n2);
    }
}
