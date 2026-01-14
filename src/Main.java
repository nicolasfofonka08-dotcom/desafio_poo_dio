import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     Curso curso = new Curso();
     curso.setTitulo("curso java");
     curso.setDescricao("descricao curso java");
     curso.setCargaHoraria(8);

     Curso curso2 = new Curso();
     curso2.setTitulo("curso js");
     curso2.setDescricao("descricao curso js");
     curso2.setCargaHoraria(4);


     Mentoria mentoria = new Mentoria();
     mentoria.setTitulo("mentoria de java");
     mentoria.setDescricao("descricao da mentoria de java");
     mentoria.setDataprivate(LocalDate.now());

     Bootcamp bootcamp = new Bootcamp();
     bootcamp.setNome("bootcamp java developer");
     bootcamp.setDescricao("descricao bootcamp java developer");
     bootcamp.getConteudos().add(curso);
     bootcamp.getConteudos().add(curso2);
     bootcamp.getConteudos().add(mentoria);

     Dev devNico = new Dev();
     devNico.setNome("Nicolas");
     devNico.inscreverBootcamp(bootcamp);
     System.out.println("conteudos inscritos NICOLAS" + devNico.getConteudosInscritos());
     devNico.progredir();
     devNico.progredir();
     System.out.println("-");
     System.out.println("conteudos inscritos NICOLAS" + devNico.getConteudosInscritos());
     System.out.println("conteudos Concluidos NICOLAS" + devNico.getConteudosConcluidos());
     System.out.println("XP" + devNico.calcularTotalXp());

     Dev devJoao = new Dev();
     devJoao.setNome("Joao");
     devJoao.inscreverBootcamp(bootcamp);
     System.out.println("conteudos inscritos JOAO" + devJoao.getConteudosInscritos());
     devJoao.progredir();
     devJoao.progredir();
     devJoao.progredir();
     System.out.println("-");
     System.out.println("conteudos inscritos JOAO" + devJoao.getConteudosInscritos());
     System.out.println("conteudos Concluidos JOAO" + devJoao.getConteudosConcluidos());
     System.out.println("XP" + devJoao.calcularTotalXp());


    }

}