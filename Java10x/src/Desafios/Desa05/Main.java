package Desafios.Desa05;

import Desafios.Desa05.ContaCorrente;
import Desafios.Desa05.ContaPoupanca;

import java.util.Scanner;

// Exerrcicio Feito para adquirir os conhecimento que tenho atualmente

public class Main {
    public static void main(String[] args) {
        Scanner caixadeentrada = new Scanner(System.in);

        // Objetos utlizados
        ContaCorrente contaCorrente = new ContaCorrente(0);
        ContaPoupanca contaPoupanca = new ContaPoupanca(0);

        while (true) {
            // Menu Interativo
            System.out.println("==== Banco Javeiro ====");
            System.out.println("1 - Deposito");
            System.out.println("2 - Consultar saldo");
            System.out.println("3 - Tranferência");
            System.out.println("4 - Sair do banco");
            System.out.print("Escolha: ");
            int escolha = caixadeentrada.nextInt();

            switch (escolha) {
                // Realização do Opção de deposito
                case 1:
                    System.out.println("Em qual conta você quer Depositar?");
                    System.out.println("1 - Corrente");
                    System.out.println("2 - Poupança");
                    System.out.print("Opção: ");
                    int opcaodeposito = caixadeentrada.nextInt();

                    if (opcaodeposito == 1) {
                        System.out.println("Digite O valor a ser depositado");
                        System.out.print("Valor: R$");
                        long valordepositocorrente = caixadeentrada.nextLong();
                        contaCorrente.deposito(valordepositocorrente);

                    } else if (opcaodeposito == 2) {
                        System.out.println("Digite O valor a ser depositado");
                        System.out.print("Valor: R$");
                        long valordepositopoupanca = caixadeentrada.nextLong();
                        contaPoupanca.deposito(valordepositopoupanca);

                    } else {
                        System.out.println("Opção não encontrada. Tente Novamente");
                    }
                    break;

                // Realização da opção de Ver o saldo da conta
                case 2:
                    System.out.println("Deseja Ver Saldo de qual conta?");
                    System.out.println("1 - Corrente");
                    System.out.println("2 - Poupança");
                    System.out.print("Opção: ");
                    int opcaosaldo = caixadeentrada.nextInt();

                    if (opcaosaldo == 1) {
                        contaCorrente.consultarsaldo(contaCorrente.getSaldocontacorrente());
                    } else if (opcaosaldo == 2) {
                        contaPoupanca.consultarsaldo(contaPoupanca.getSaldocontapoupanca());
                    } else {
                        System.out.println("Opção não encontrada. Tente Novamente");
                    }
                    break;

                // Funcionamento da opção de tranferencia
                // Correte -> Poupança
                // Poupança -> Corrente
                case 3:
                    System.out.println("Escolha qual conta recebera o dinheiro.");
                    System.out.println("1 - Corrente");
                    System.out.println("2 - Poupança");
                    System.out.print("Escolha: ");
                    int escolhatranferencia = caixadeentrada.nextInt();

                // metodo contruido necessitando referencia o objeto para poder ser possivel a tranferencia de valores
                    if (escolhatranferencia == 1){
                        System.out.println("Digite o valor a ser tranferido.");
                        System.out.print("Valor: ");
                        long valorpoupancaparacorrente = caixadeentrada.nextLong();

                        contaCorrente.tranferencia(valorpoupancaparacorrente, contaPoupanca);

                    } else if (escolhatranferencia == 2) {
                        System.out.println("Digite o valor a ser tranferido.");
                        System.out.print("Valor: ");

                        long valorcorrenteparapoupanca = caixadeentrada.nextLong();

                        contaPoupanca.tranferencia(valorcorrenteparapoupanca, contaCorrente);
                    } else {
                        System.out.println("Digite uma opção valida. Tente Novamente");

                    }
                    break;

                case 4:
                    System.out.println("Volte Sempre");
                    break;

                default:
                    System.out.println("Digite uma opção valida pro sistema.");
                    break;
            }

            // encerramento do programa
            if (escolha == 4){
                System.out.println("Saindo do Banco");
                caixadeentrada.close();
            }
        }
    }
}
