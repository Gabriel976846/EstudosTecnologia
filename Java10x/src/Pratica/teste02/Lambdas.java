package Pratica.teste02;

public class Lambdas {
    public static void main(String[] args) {
//        testecalculo soma = new testecalculo() {
//            @Override
//            public int calculadora(int a, int b) {
//                return a + b;
//            }
//        };
//        System.out.println(soma.calculadora(5,2));
// TUDO EM COMETARIOS ACIMA, SÃO COISAS ANTIGA DO JAVA, ANTES DA IMPLEMENTAÇÃO DE LAMBDAS (JAVA 8)
// DEIXADO O JAVA BASTANTE VERBOSO, DIFICULTANDO O ENTENDIMENTO DO CODIGO

        // MESMO COMPORTAMENNTO DA FUÇÃO ACIMA, MAS NO LAMBDA
        // DEIXANDO O CODIGO LIMPO, E DE FACIL LEITURA
//        testecalculo somaFL = (a, b) -> a + b;
//        System.out.println(somaFL.calculadora(5, 2));

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Ola Mundo!");
//            }
//        }).start();

        Thread valor = new Thread(new teste01("Gabriel"));

        valor.start();


    }
}
