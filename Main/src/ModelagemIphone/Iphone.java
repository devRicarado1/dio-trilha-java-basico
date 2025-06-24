package ModelagemIphone;
import java.util.Scanner;
import ModelagemIphone.ReprodutorMusical;


// Modelagem e Diagramação de um Componente iPhone

// Neste desafio, você será responsável por modelar e diagramar a representação UML do componente iPhone, 
// abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

// Funcionalidades a Modelar
// Reprodutor Musical Métodos: tocar(), pausar(), selecionarMusica(String musica)
// Aparelho Telefônico Métodos: ligar(String numero), atender(), iniciarCorreioVoz()
// Navegador na Internet Métodos: exibirPagina(String url), adicionarNovaAba(), atualizarPagina()

// Objetivo
// Criar um diagrama UML que represente as funcionalidades descritas acima.
// Implementar as classes e interfaces correspondentes em Java (Opcional).

public class Iphone {

    public static void main(String[] args) {

        ReprodutorMusical reproduzir = new ReprodutorMusical();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a opcao da musica que deseja tocar: ");
        int opcaoUsuario = scanner.nextInt();
        
        reproduzir.selecionaMusica(opcaoUsuario);
        
        reproduzir.pausar();

    }
    
}
