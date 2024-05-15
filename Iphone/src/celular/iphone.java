package celular;

public class iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private ReprodutorMusical reprodutorMusical;

    //reprodutorMusical
    @Override
    public void tocar() {
        reprodutorMusical.selecionarMusica(new Musica("Radio Bla Bla", "Lobao"));
        reprodutorMusical.tocar();
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(Musica musica) {
        System.out.println("Selecionando a música: " + musica.getNome());
    }
    
    @Override
    public void exibirPagina() {
        System.out.println("https://www.exemplo.com");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    //aparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para ...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo..");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz ...");
    } 
    

}
