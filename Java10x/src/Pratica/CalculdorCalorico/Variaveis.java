package Pratica.CalculdorCalorico;

public class Variaveis {
    private float massa;
    private float altura;
    private int idade;

    public Variaveis(float massa, float altura, int idade) {
        this.massa = massa;
        this.altura = altura;
        this.idade = idade;
    }

    public void formula(float peso, float altura, int idade){
        float calorias = (float) (655 + (9.6 * peso) + (1.9 * altura) - (4.7 * idade));
        System.out.println("Seu gasto calorico sem atividade fisica é: " + calorias);
        System.out.println("Com atividade fisica é: " + calorias * 1.7);
    }
}
