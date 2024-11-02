//Exercício 01 - Lista 09
//Escreva uma classe chamada Contador, que tem um atributo estático que é incrementado
//sempre que a classe for instanciada. Crie métodos para zerar, incrementar e retornar
//o valor do contador. Desenvolva um programa para testar essa classe.
//Autor: Flávio Alencar - 30OUT24 - 10h36 AM

package exercicios.Lista09;

public class Contador {
     //                      DECLARAÇÃO DE VARIAVEIS GLOBAIS
    //--------------------------------------------------------------------------
    static int cont;    
    //--------------------------------------------------------------------------
    
    static int incrementar(int cont){
        cont++;
        return cont;
    }
    
    static int decrementar(int cont){
        cont--;
        return cont;
    }
    
    static int zerar(int cont){
        while(cont != 0){
            if(cont < 0){
                cont++;
            }
            else if(cont > 0){
            cont--;
            }
            else if(cont == 0){
            cont = 0;
            }
        }
    return cont;    
    }
}
