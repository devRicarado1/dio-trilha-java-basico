package main;

public class Candidato {

    double salarioBase = 2000;

    public void triagem(double[] salarioPretendido) {

        // Salario Base Maior que o SalarioPretendido
        if (salarioBase > salarioPretendido.length) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido.length) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
        }
    } // Fechamento da Função selecao

    public void selecionados(double[] salarioPretendido, String[] nomesCandidatos) {
        System.out.println("Candidatos Selecionados");
        int candidatosAprovados = 0;
        int maximoCandidatosSelecionados = 5;

        if (nomesCandidatos.length != salarioPretendido.length) {
            System.out.println("Erro: Array e nome não tem o mesmo tamanho");
            return; // Sai do metodo se os dados estiverem errados
        }

        System.out.println("Candidatos Aprovados para Entrevista");

        for (int i = 0; i < nomesCandidatos.length; i++) {
            // Se o contador atingir o limite maximo de 5, para de listar
            if (candidatosAprovados >= maximoCandidatosSelecionados) {
                break;
            }

            String nomeAtual = nomesCandidatos[i];
            double salarioAtual = salarioPretendido[i];

            // Verifica se o salario pretendido e atende aos criterios
            if (salarioAtual <= salarioBase) {
                System.out.println("ID: " + i + " - Candidato " + nomeAtual + " (Salário Pretendido: R$" + salarioAtual + ")");
                candidatosAprovados++;
            }
        }

        if (candidatosAprovados == 0) {
            System.out.println("Nenhum Candidato Atendendo ao Criterios de Salario Base");
        } else {
            System.out.println("Total de Candidatos Selecionados para entrevista: " + candidatosAprovados);
        }
    }

    public void realizarligacaoCandidato(String[] nomesCandidatosLigar, double[] salarioPretendido, int selecionaCandidato) {
        int tentativas = 0;
        boolean atendeu = false;

        
        if(selecionaCandidato < 0 || selecionaCandidato > nomesCandidatosLigar.length){
            System.out.println("ID INCORRETO!");
        }
        String candidato = nomesCandidatosLigar[selecionaCandidato];
        System.out.println("Ligando para o candidato: " + candidato);

        while (tentativas < 3 && !atendeu) {
            tentativas++; // Contador
            atendeu = new java.util.Random().nextBoolean();

            if (atendeu) {
                System.out.println("Conseguimos Contato com " + candidato + " Após " + tentativas + " Tentativas");
            } else {
                System.out.println("Tentativa " + tentativas + " falhou");
            }
        }

        if (!atendeu) {
            System.out.println("Não Conseguimos Contato com o " + candidato);
        }

    }
}
