package Pratica.CalculdorCalorico;

import java.util.Scanner;

public class PaginaPrincipal {
    public static void main(String[] args) {
        Scanner entradadeinfor = new Scanner(System.in);

        System.out.print("Digite sua Altura");
        float altura = entradadeinfor.nextFloat();
        System.out.print("Digite sua idade");
        int idade = entradadeinfor.nextInt();
        System.out.print("Digite seu peso");
        float peso = entradadeinfor.nextFloat();

        Variaveis objeto = new Variaveis(peso, altura, idade);

        objeto.formula(peso, altura, idade);
    }
}
