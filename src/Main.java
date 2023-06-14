import dev.dio.desafio.dominio.Conteudo;
import dev.dio.desafio.dominio.Curso;
import dev.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java", "Curso de Java", 80);

        Conteudo curso2 = new Curso("Javascript", "Curso de Javascript", 50);

        Mentoria mentoria1 = new Mentoria("Mentoria de Java", "Descrição para mentoria de java", LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);

        List<Conteudo> list = Arrays.asList(curso1, curso2, mentoria1);

        list.forEach(System.out::println);

    }

}