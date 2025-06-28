package ModelagemIphone;

// Funcionalidades a Modelar Reprodutor Musical Métodos: tocar(), pausar(), selecionarMusica(String musica)
public class ReprodutorMusical {

    private String musicaAtual;
    private Boolean musicaTocando = false;

    public void tocar() {

        if (musicaAtual == null || musicaAtual.trim().isEmpty()) {
            System.out.println("Nenhuma música sendo Reproduzida. Por favor, selecione uma música para tocar");
            this.musicaTocando = false;
        } else {
            if (this.musicaTocando) {
                System.out.println("A musica " + this.musicaAtual + "já está sendo Reproduzida");
            } else {
                this.musicaTocando = true;
                System.out.println("Tocando música: " + this.musicaAtual);
            }
        }
    }

    public void pausar() {
        if (this.musicaAtual == null || this.musicaAtual.trim().isEmpty()) {
            System.out.println("Nenhuma musica para pausar");
        }
        else if (!this.musicaTocando) {
            System.out.println("A musica " + this.musicaAtual + "já está pausada");
        } else {
            this.musicaTocando = false;
            System.out.print("Musica " + this.musicaAtual + " Pausada");
        }
    }

    public void selecionaMusica(String musica) {
        if(musica == null || musica.trim().isEmpty()) {
            System.out.println("Nome de musica invalido. Nenhuma musica selecionada");
        } else {
            this.musicaAtual = musica;
            System.out.println("Musica selecionada: " + this.musicaAtual);
        }     
    }

}
