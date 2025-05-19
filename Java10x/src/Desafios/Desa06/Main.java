package Desafios.Desa06;
//SIMULADOR DE URNA ELEITORAL - TENTAR INSERIR UM GRAFICO QUE REPRESENTE DO MAIS A MENOS VOTADO

import Desafios.Desa06.Candidatos;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            LinkedList<Candidatos> listacandidatos = new LinkedList<>();

            Scanner entradadeDados = new Scanner(System.in);
            int[] numerovotos;

            // INICIO DO CODIGO

            System.out.println("Digite a quantidade de Candidatos que irão participar.");
            System.out.print("Quantidade: ");
            int numerocandidatos = entradadeDados.nextInt();
            numerovotos = new int[numerocandidatos];

            System.out.println("====== Inscrição de Candidatos ======");
            entradadeDados.nextLine();

            // INSCRIÇÃO CANDIDATOS - NOME E NUMEROELEITORAL
            for (int i = 0; i < numerocandidatos; i++) {
                System.out.print("Candidato: ");
                String nomecandidato = entradadeDados.nextLine();

                System.out.print("Digite o numero do candidato " + nomecandidato + ": ");
                int numerocandidato = entradadeDados.nextInt();
                entradadeDados.nextLine();

                listacandidatos.add(new Candidatos(nomecandidato, numerocandidato));
            }

            // SISTEMA DE VOTAÇÃO - VERIFICAÇÃO SE ESTÁ VAZIA OU NÃO
            while (true) {
                System.out.println("===== Votação Candidatos =====");
                System.out.println("Escolha o candidato");
                System.out.println(listacandidatos);
                System.out.print("Digite o numero eleitoral do candidato de sua escolha: ");
                int escolhavoto = entradadeDados.nextInt();

                
            }

        }
    }
}
