package main;

import java.util.Scanner;
import java.util.Arrays;

import main.Candidato;


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

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Candidato candidato = new Candidato();
        String[] nomesCandidatos = new String[] {"Ricardo", "João", "Thayla", "Gelson", "Maria", "Renilda", "Priscila"};
        double[] salarioPretendido = new double[] {1500.0, 7000.0 , 2000.0  , 1000.0 , 1500.0 , 2000.0 , 5000.0};
                                
        candidato.triagem(salarioPretendido);
        candidato.selecionados(salarioPretendido, nomesCandidatos);      
        candidato.realizarligacaoCandidato(salarioPretendido, nomesCandidatos);
    }
    
}
