package Avancado.Streams;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<usuario> conjuntodeusuarios = new ArrayList<>();

        conjuntodeusuarios.add(new usuario("Naruto", "Konoha", 17));
        conjuntodeusuarios.add(new usuario("Tsunade", "Konoha", 17));
        conjuntodeusuarios.add(new usuario("Sasuke", "Konoha", 55));
        conjuntodeusuarios.add(new usuario("Sakura", "Konoha", 14));
        conjuntodeusuarios.add(new usuario("Jiraya", "Konoha", 37));
        conjuntodeusuarios.add(new usuario("Zabuza", "nevoa", 18));
        conjuntodeusuarios.add(new usuario("gaara", "suna", 97));
        conjuntodeusuarios.add(new usuario("kaguya", "suna", 257));


        conjuntodeusuarios.stream()
                .sorted((n2, n1) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .forEach(System.out::println);


    }
}
