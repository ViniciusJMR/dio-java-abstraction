import dev.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java", "Curso de Java", 80);
        Conteudo curso2 = new Curso("Javascript", "Curso de Javascript", 50);

        Mentoria mentoria1 = new Mentoria("Mentoria de Java", "Descrição para mentoria de java", LocalDate.now());

//        List<Conteudo> list = Arrays.asList(curso1, curso2, mentoria1);
//        list.forEach(System.out::println);

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Bootcamp para a criação de java developer");
        bootcamp.getConteudos().addAll(Arrays.asList(curso1, curso2, mentoria1));

        Dev devVini= new Dev("Vinicius");
        devVini.inscreverBootcamp(bootcamp);
        Dev devJoao = new Dev("Joao");
        devJoao.inscreverBootcamp(bootcamp);

        System.out.println("Vinicius");
        System.out.println("Conteudos inscritos: " + devVini.getConteudosInscritos());
        System.out.println("Conteudos Concluídos: " + devVini.getConteudosConcluidos());
        System.out.println("XP: " + devVini.calcularTotalXp());
        devVini.progredir();
        System.out.println("Progressão");
        System.out.println("Conteudos inscritos: " + devVini.getConteudosInscritos());
        System.out.println("Conteudos Concluídos: " + devVini.getConteudosConcluidos());
        System.out.println("XP: " + devVini.calcularTotalXp());

        System.out.println();

        System.out.println("Joao");
        System.out.println("Conteudos inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluídos: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Progressão");
        System.out.println("Conteudos inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluídos: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
    }

}