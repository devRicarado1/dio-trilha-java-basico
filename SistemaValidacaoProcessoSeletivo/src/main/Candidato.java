package main;

// Case 1: Vamos imaginar que em um processo seletivo existe o valor base salarial de R$ 2.000,00
// e o salário pretentido pelo candidado. Vamos elaborar um controle de fluxo onde
// Se o valor salario base for maior que valor salario pretendido, imprima LIGAR PARA O CANDIDATO
// Senão se o valor salario base for igual ao valor salario pretendido, imprima: LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA
// Senão imprima: AGUARDANDO RESULTADO DEMAIS CANDIDATOS
// Case 2: Foi solictado que nosso sistema garanta que diante das inumeras candidaturas sejam selecionados apenas no maximo 5
// Candidados para entrevista onde o salário pretendido seja menor ou igual ao salario base
// Ultilizar Array de String
// Case 3: Agora é hora imprimir a lista dos candidados selecionados para disponibilizar para o RH entrar em contato
// Case 4: O RH deverá realizar uma ligação com no máximo 03 tentativas para cada candidato selecionado e caso o candidato atenda,
// deve-se imprimir: "CONSEGUIMOS CONTATO COM [CANDIDATO] APÓS [TENTATIVA] TENTATIVAS(S)"
// do contrario imprima: "NÃO CONSEGUIMOS CONTATO COM O [CANDIDATO]"
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
            if(candidatosAprovados >= maximoCandidatosSelecionados){               
                break;               
            }
            
            String nomeAtual = nomesCandidatos[i];
            double salarioAtual = salarioPretendido[i];
            
            // Verifica se o salario pretendido e atende aos criterios
            if(salarioAtual <= salarioBase){
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
    
    public void realizarligacaoCandidato(double[] salarioPretendidoLigar, String[] nomesCandidatosLigar){
        int tentativas = 1;
        int maximoTentaivasCandidatos = 3;
        
        System.out.println("Inciando Ligação para Candidatos Selecionados: ");
        selecionados(salarioPretendidoLigar, nomesCandidatosLigar);
        
        for(int i = 0; i < nomesCandidatosLigar.length; i++){
            System.out.println(nomesCandidatosLigar[i]);
        }     
        
        
        
    }
    
    
}