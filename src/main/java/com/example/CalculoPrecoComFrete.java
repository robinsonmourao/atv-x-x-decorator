package main.java.com.example;

public class CalculoPrecoComFrete implements CalcularPreco{

    private double distancia = 10;
    private double frete = 0.10;

    @Override
    public double valorFinal(Produto produto) {

        double valorUnitario = produto.getValorUnitario();
        double calculoFrete = frete*distancia;
        double valorFinal = valorUnitario + calculoFrete;

        return valorFinal;
        
    }
    
}
