package ModelagemIphone;

// Funcionalidades a Modelar Aparelho Telefônico Métodos: ligar(String numero), atender(), iniciarCorreioVoz()
public class AparelhoTelefonico {

    public void ligar(String numero) {
        System.out.println("Tentando Ligar para: " + numero);

        if (numero == null || numero.trim().isEmpty()) {
            System.out.println("Numero não pode ser Vazio");
        } else if (numero.trim().length() < 8 || numero.trim().length() > 12) {
            System.out.println("Numero " + numero + " incorreto. Verifique e tente Novamente");
        } else {
            System.out.println("Ligando para " + numero);
        }
    }

    public void atender(boolean aceitar) {
        System.out.println("Deseja Atender Ligação?");
        System.out.println("1 - SIM");
        System.out.println("2 - NÃO");

        if (aceitar) {
            System.out.println("Ligação Atendida");
        } else {
            System.out.println("Ligação Recusada");
        }
    }

    public void iniciarCorreioVoz(String numeroDestino, String mensagem) {
        System.out.println("Iniciando Correio de Voz");

        if (numeroDestino == null || numeroDestino.length() > 12) {
            System.out.println("Numero de Destino não pode ser vazio");
            return; // Sai do Metodo Caso numero for invalido
        } 
        if (numeroDestino.length() < 8 || numeroDestino.length() > 12) {
            System.out.println("Numero de destino (" + numeroDestino + ") invalido.");
            System.out.println("Mensagem não enviada!");            
        } else {
            System.out.println("Mensagem para o Correio de Voz de " + numeroDestino);
            if(mensagem != null && !mensagem.trim().isEmpty()) {
                System.out.println(">> \"" + mensagem + "\"");
                System.out.println("Mensagem de correio de voz enviada com sucesso!");
            } else {
                System.out.println("Nenhuma Mensagem para Enviar.");
            }

            // Apos Digita a mensagem aparecer uma mensagem informado que a mensagem foi enviada. As mensagem vão se digitas atraves da Class Iphone
        }
    }

}
