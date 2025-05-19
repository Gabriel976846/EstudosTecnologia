package Pratica.teste02;

public class teste01 implements Runnable {
    String nome;

    public teste01(String nome) {
        this.nome = nome;
    }

    @Override
    public void run(){
        int contador = 11;
        for (int i = 0; i < contador; i++) {
            System.out.println("Ola " + nome);
        }
    }
}
