package Pratica.teste01;

public class Metodos {

    private String palavrafinal;

    // Inverter a palavra
    public void palavrainvertida(String palavrateste){
        this.palavrafinal = new StringBuilder(palavrateste).reverse().toString();
    }

    public void mostrarpalavrar(){
        System.out.println(palavrafinal);
    }
}
