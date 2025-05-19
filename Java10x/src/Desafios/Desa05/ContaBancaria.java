package Desafios.Desa05;

import Desafios.Desa05.Conta;

public abstract class ContaBancaria implements Conta {

    private long saldoconta;

    // Get e setter do meu atributo
    public long getSaldoconta() {
        return saldoconta;
    }

    public void setSaldoconta(long saldoconta) {
        this.saldoconta = saldoconta;
    }

    @Override
    public abstract void deposito(long valordeposito);

    @Override
    public abstract void consultarsaldo(long valornaconta);

    public void taxadeservico(long valortaxaquevaidescontar){
        double porcentotaxaemdecimal = 0.98;
        setSaldoconta((long) (valortaxaquevaidescontar * porcentotaxaemdecimal));
    }

    @Override
    public void saquedaconta(long valorsaque) {
        if (valorsaque >= 5){
            int cedula = 100;
            
        } else {
            System.out.println("Você quer sacar um valor muito baixo");
        }
    }
}
