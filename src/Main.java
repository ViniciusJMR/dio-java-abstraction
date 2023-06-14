import dev.dio.desafio.dominio.Curso;
import dev.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java", "Curso de Java", 80);
        System.out.println(curso1);

        Mentoria mentoria1 = new Mentoria("Mentoria de Java", "Descrição para mentoria de java", LocalDate.now());
        System.out.println(mentoria1);
    }

}