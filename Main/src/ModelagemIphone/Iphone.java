package ModelagemIphone;

import java.util.Scanner;

import ModelagemIphone.ReprodutorMusical;
import ModelagemIphone.AparelhoTelefonico;
import ModelagemIphone.NavegadorIntenet;

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

        AparelhoTelefonico telefone = new AparelhoTelefonico();
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        NavegadorIntenet navegador = new NavegadorIntenet();
        Scanner scanner = new Scanner(System.in);

        int opcaoPrincipal = -1; // Variavel Global para o menu Principal

        while (opcaoPrincipal != 0) {
            System.out.println("\n--- iPhone Menu Principal ---");
            System.out.println("1. Reprodutor Musical");
            System.out.println("2. Aparelho Telefônico");
            System.out.println("3. Navegador na Internet");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcaoPrincipal = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opcao invalida. Por favor, digite um número");
                continue;
            }

            // Verifica qual opção o usuário escolheu no menu principal
            switch (opcaoPrincipal) {
                // --- REPRODUTOR MUSICAL ---
                case 1:
                    int opcaoMusica = -1;
                    while (opcaoMusica != 0) {
                        System.out.println("\n--- Reprodutor Musical ---");
                        System.out.println("1. Tocar Música");
                        System.out.println("2. Pausar Música");
                        System.out.println("3. Selecionar Música");
                        System.out.println("0. Voltar ao Menu Principal");
                        System.out.print("Escolha uma opção: ");

                        try {
                            opcaoMusica = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Opcao invalida. Por favor, digite um número");
                            continue;
                        }

                        switch (opcaoMusica) {
                            case 1:
                                reprodutor.tocar();
                                break;
                            case 2:
                                reprodutor.pausar();
                                break;
                            case 3:
                                System.out.println("Digite o nome da música que deseja tocar: ");
                                String nomeMusica = scanner.nextLine();
                                reprodutor.selecionaMusica(nomeMusica);
                                break;
                            case 0:
                                System.out.println("Voltando ao Menu Principal");
                                break;
                            default:
                                System.out.println("Opcao invalida tente novamente");
                        }
                    }
                    break; // Volta ao Menu Principal

                case 2:
                    // --- APARELHO TELEFÔNICO ---
                    int opcaoTelefone = -1;
                    while (opcaoTelefone != 0) {
                        System.out.println("\n--- Aparelho Telefônico ---");
                        System.out.println("1. Ligar");
                        System.out.println("2. Atender");
                        System.out.println("3. Iniciar Correio de Voz");
                        System.out.println("0. Voltar ao Menu Principal");
                        System.out.print("Escolha uma opção: ");

                        try {
                            opcaoTelefone = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Opcao invalida. Por favor, digite um número");
                            continue;
                        }

                        switch (opcaoTelefone) {
                            case 1:
                                System.out.print("Digite o número para ligar: ");
                                String numeroLigar = scanner.nextLine();
                                telefone.ligar(numeroLigar);
                                break;
                            case 2:
                                telefone.atender(true);
                                break;
                            case 3:
                                System.out.print("Digite o número para o correio de voz: ");
                                String numCorreioVoz = scanner.nextLine();
                                System.out.print("Digite a mensagem de correio de voz: ");
                                String msgCorreioVoz = scanner.nextLine();
                                telefone.iniciarCorreioVoz(numCorreioVoz, msgCorreioVoz);
                                break;
                            case 0:
                                System.out.println("Voltando ao menu principal...");
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                        }
                    }
                    break; // Volta ao Menu Principal

                case 3:
                    // --- NAVEGADOR NA INTERNET ---
                    int opcaoNavegador = -1; // Opção específica para o menu do navegador
                    while (opcaoNavegador != 0) { // Loop para o menu do navegador
                        System.out.println("\n--- Navegador na Internet ---");
                        System.out.println("1. Exibir Página");
                        System.out.println("2. Adicionar Nova Aba");
                        System.out.println("3. Atualizar Página");
                        System.out.println("0. Voltar ao Menu Principal");
                        System.out.print("Escolha uma opção: ");

                        try {
                            opcaoNavegador = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Opção inválida. Por favor, digite um número.");
                            continue;
                        }

                        switch (opcaoNavegador) {
                            case 1:
                                System.out.print("Digite a URL para exibir: ");
                                String urlExibir = scanner.nextLine();
                                navegador.exibirPagina(urlExibir);
                                break;
                            case 2:
                                System.out.print("Digite a URL da nova aba: ");
                                String urlNovaAba = scanner.nextLine();
                                navegador.adicionarNovaAba(urlNovaAba);
                                break;
                            case 3:
                                navegador.atualizarPagina();
                                break;
                            case 0:
                                System.out.println("Voltando ao menu principal...");
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                        }
                    }
                    break; // Volta ao Menu Principal

                case 0:
                    System.out.println("Saindo do iPhone. Até mais!");
                    break; // Sai do switch principal para o loop while principal encerrar
                default:
                    System.out.println("Opção principal inválida. Tente novamente.");
            }
        }
        scanner.close();
    }

}
