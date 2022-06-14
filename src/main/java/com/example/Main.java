package main.java.com.example;

public class Main {
    public static void main (String [] args){

        Produto produto1= new Produto();

        produto1.setNome("Amplificador classe AB");
        produto1.setValorUnitario(150.00);
        produto1.setQuantidade(2);

        CalcularPreco calculo = new CalculoPrecoComFrete();

        System.out.println(produto1.toString());
    }
}
