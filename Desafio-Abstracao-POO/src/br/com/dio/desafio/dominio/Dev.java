package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }
    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }else {
            System.out.println("Voce nao esta matriculado em nenhum conteudo");
        }
    }
     //inicio metodo implementado
    public void desfazerProgresso(Conteudo conteudo) {
        if (this.conteudosConcluidos.contains(conteudo)) {
            this.conteudosConcluidos.remove(conteudo);
            this.conteudosInscritos.add(conteudo);
        } else {
            System.out.println("Este conteúdo não está concluído, portanto não pode ser desfeito.");
        }
    }

    public Set<Conteudo> listarConteudosDisponiveis(Bootcamp bootcamp) {
        Set<Conteudo> conteudosDisponiveis = new LinkedHashSet<>(bootcamp.getConteudos());
        conteudosDisponiveis.removeAll(this.conteudosInscritos);
        conteudosDisponiveis.removeAll(this.conteudosConcluidos);
        return conteudosDisponiveis;
    }
    public void removerCursoInscrito(Curso curso) {
        if (this.conteudosInscritos.contains(curso)) {
            this.conteudosInscritos.remove(curso);
            System.out.println("Curso removido dos conteúdos inscritos.");
        } else {
            System.out.println("Curso não encontrado nos conteúdos inscritos.");
        }
    }

    public void removerCursoConcluido(Curso curso) {
        if (this.conteudosConcluidos.contains(curso)) {
            this.conteudosConcluidos.remove(curso);
            System.out.println("Curso removido dos conteúdos concluídos.");
        } else {
            System.out.println("Curso não encontrado nos conteúdos concluídos.");
        }
    }
    //fim metodo listarConteudosDisponiveis
    public double calcularTotalXp(){
       return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }
    

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
