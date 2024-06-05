import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descricao curso javascript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria");
        //mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Pedro: " + devPedro.getConteudosInscritos());
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Pedro: " + devPedro.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Pedro: " + devPedro.getConteudosConcluidos());
        System.out.println("XP: " + devPedro.calcularTotalXp());

        System.out.println("==================");

        Dev devIsabela = new Dev();
        devIsabela.setNome("Isabela");
        devIsabela.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Isabela: " + devIsabela.getConteudosInscritos());
        devIsabela.progredir();
        devIsabela.progredir();
        devIsabela.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Isabela: " + devIsabela.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Isabela: " + devIsabela.getConteudosConcluidos());
        System.out.println("XP: " + devIsabela.calcularTotalXp());

        // Demonstrando o método desfazerProgresso
        devIsabela.desfazerProgresso(curso1);
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Isabela após desfazer progresso: " + devIsabela.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Isabela após desfazer progresso: " + devIsabela.getConteudosConcluidos());

        // Demonstrando o método listarConteudosDisponiveis
        System.out.println("Conteúdos disponíveis para inscrição de Isabela: " + devIsabela.listarConteudosDisponiveis(bootcamp));

        // Demonstrando o método removerCursoInscrito
        devIsabela.removerCursoInscrito(curso2);
        System.out.println("Conteúdos Inscritos de Isabela após remover curso inscrito: " + devIsabela.getConteudosInscritos());

        // Demonstrando o método removerCursoConcluido
        devIsabela.progredir(); // Progredir novamente para ter curso concluído
        devIsabela.removerCursoConcluido(curso1);
        System.out.println("Conteúdos Concluídos de Isabela após remover curso concluído: " + devIsabela.getConteudosConcluidos());
   
        // Curso curso1 = new Curso();
        // curso1.setTitulo("curso java");
        // curso1.setDescricao("descricao curso java");
        // curso1.setCargaHoraria(8);


        // Curso curso2 = new Curso();
        // curso2.setTitulo("curso javascript");
        // curso2.setDescricao("descricao curso javascript");
        // curso2.setCargaHoraria(8);



        // Mentoria mentoria = new Mentoria();
        // mentoria.setTitulo("mentoria java");
        // mentoria.setDescricao("descricao mentoria");
        // mentoria.setDate(LocalDate.now());




        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        // Bootcamp bootcamp = new Bootcamp();
        // bootcamp.setNome("Bootcamp Java Developer");
        // bootcamp.setDescricao("Descricao Java Developer");
        // bootcamp.getConteudos().add(curso1);
        // bootcamp.getConteudos().add(curso2);
        // bootcamp.getConteudos().add(mentoria);
        

        // // Dev devPedro = new Dev();
        // // devPedro.setNome("Pedro");
        // // devPedro.increverBootcamp(bootcamp);
        // // System.out.println("Conteudo Inscritos de Pedro "+devPedro.getConteudosInscritos());
        // // devPedro.progredir();devPedro.progredir();
        // // System.out.println("-");
        // // System.out.println("Conteudo Inscritos Pedro "+devPedro.getConteudosInscritos());
        // // System.out.println("Conteudo Concluidos Pedro "+devPedro.getConteudosConcluidos());
        // // System.out.println("XP:" + devPedro.calcuparTotalXp());

        // System.out.println("==================");

        // Dev devIsabela = new Dev();
        // devIsabela.setNome("Isabela");
        // devIsabela.increverBootcamp(bootcamp);
        // System.out.println("Conteudo Inscritos de Isabela"+devIsabela.getConteudosInscritos());
        // devIsabela.progredir();devIsabela.progredir();devIsabela.progredir();
        // System.out.println("-");
        // System.out.println("Conteudo Inscritos de Isabela"+devIsabela.getConteudosInscritos());
        // System.out.println("Conteudo Concluidos de Isabela"+devIsabela.getConteudosConcluidos());
        // System.out.println("XP:" + devIsabela.calcuparTotalXp());
        // devIsabela.desfazerProgresso(curso1);
        // System.out.println("Conteudo Inscritos de Isabela"+devIsabela.getConteudosInscritos());
        // System.out.println("XP:" + devIsabela.calcuparTotalXp());
        
        
    

    }
}
