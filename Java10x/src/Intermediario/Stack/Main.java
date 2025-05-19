package Intermediario.Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        
        // O ultimo a entrar é o primeiro a sair
        Stack<String> ninjastack = new Stack<>();

        ninjastack.push("Gabriel");
        ninjastack.push("Soraya");
        ninjastack.push("Leticia");

        System.out.println(ninjastack);
    }
}
