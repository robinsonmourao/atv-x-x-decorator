package main.java.com.example;

public class CalculoPrecoComum implements CalcularPreco{

    double imposto = 0.10;

    @Override
    public double valorFinal(Produto produto) {

        double valorUnitario = produto.getValorUnitario();
        double valorFinal = valorUnitario + (valorUnitario*imposto);

        return valorFinal;
        
    }

    
}
