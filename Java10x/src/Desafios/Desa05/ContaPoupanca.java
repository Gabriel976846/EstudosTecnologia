package Desafios.Desa05;

import Desafios.Desa05.ContaBancaria;
import Desafios.Desa05.ContaCorrente;

public class ContaPoupanca extends ContaBancaria {

    private long saldocontapoupanca;

    // Construtor
    public ContaPoupanca(long saldocontapoupanca) {
        this.saldocontapoupanca = saldocontapoupanca;
    }

    // Get e setter do meu atributo
    public long getSaldocontapoupanca() {
        return saldocontapoupanca;
    }

    public void setSaldocontapoupanca(long saldocontapoupanca) {
        this.saldocontapoupanca = saldocontapoupanca;
    }

    @Override
    public void deposito(long valordeposito) {
        if (valordeposito > 0){
            taxadeservico(valordeposito);
            this.setSaldocontapoupanca(getSaldoconta() + getSaldocontapoupanca());;
            System.out.println("Deposito Feito com Sucesso");
        } else {
            System.out.println("O deposito não tem valor");
        }
    }

    @Override
    public void consultarsaldo(long valornaconta) {
        if (valornaconta > 0){
            taxadeservico(valornaconta);
            System.out.println("Seu saldo Atual.");
            System.out.println("Saldo: R$" + getSaldocontapoupanca());
        } else {
            System.out.println("Sua Conta está Zerada");
        }
    }

    public void tranferencia(long valorasertranferido, ContaCorrente contaCorrente){
        if (valorasertranferido > 0){
            if (valorasertranferido <= contaCorrente.getSaldocontacorrente()){
                taxadeservico(valorasertranferido);
                setSaldocontapoupanca(getSaldocontapoupanca() + getSaldoconta());
                contaCorrente.setSaldocontacorrente(contaCorrente.getSaldocontacorrente() - valorasertranferido);
                System.out.println("Tranferencia relizada com sucesso");
            } else {
                System.out.println("O valor que deseja tranferir, é maior que o valor na conta poupança");
            }
        } else {
            System.out.println("Digite um valor acima do minimo");
        }
    }

}
