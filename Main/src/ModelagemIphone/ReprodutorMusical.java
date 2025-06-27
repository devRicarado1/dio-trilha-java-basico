package ModelagemIphone;

// Funcionalidades a Modelar Reprodutor Musical Métodos: tocar(), pausar(), selecionarMusica(String musica)
public class ReprodutorMusical {
    
    String musica;
    boolean tocando = false;
    int opcaoMusica;

    public void tocar() {
        tocando = false;
        
        if (musica == null) {
            System.out.println("Selecione uma musica Primeiro");
        } else {
            tocando = true;
            System.out.print("Tocando musica " + musica);
        }
    }

    public void pausar() {
        tocando = false;
        
        if(musica == null) {
            System.out.println("Nenhuma Musica sendo Reproduzida");
        } else {
            System.out.print("Musica " + musica + " Pausada");
        }       
    }

    public void selecionaMusica(String musica) {
        System.out.println("Escolha a musica que deseja tocar: ");
        System.out.print("1 Orochi - Antes do Sol Nascer, 2 Matue - Antes, 3 Timaia - Ela Partiu!");

        switch (opcaoMusica) {
            case 1:
                System.out.print("Tocando Musica de Orochi - Antes do Sol Nascer");
                break;
            case 2:
                System.out.print("Tocando Musica de Matue - Antes");
                break;
            case 3:
                System.out.print("Tocando Musica de Tim Maia - Ela Partiu!");
                break;
            default:
                System.out.println("Opcao invalida. Nenhuma Musica Selecionada.");
                break;
        }
    }

}
