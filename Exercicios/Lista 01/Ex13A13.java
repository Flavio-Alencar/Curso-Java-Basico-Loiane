//Exercício 13 - AUla 13

import java.util.Scanner;

public class Ex13A13 {
    public static void main (String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Verificação do Peso");
        System.out.println("                   ");
        System.out.println("Digite a sua altura (m): ");
        double alt = scan.nextDouble();
        System.out.println("Digite seu Peso (kg): ");
        double peso = scan.nextDouble();
        System.out.println("Digite seu Sexo (1 para Maculino ou 2 para Feminino): ");
        int sex = scan.nextInt();
       
        if (sex == 1){
            double pim = ((72.7*alt)-58);
            
            if (peso < pim){
                System.out.println("Você Está Abaixo do Peso");
                
            }
            else if (peso > pim){
                System.out.println("Você Está Acima do Peso");
            }
            else if (peso == pim){
                System.out.println("Você está com o Peso Ideal - PARABÉNS");
            }
            System.out.println("Seu Peso Ideal: " +pim +"kg");
            
        }
        else{
            double pif = ((62.1*alt)-44.7);
            
            if (peso < pif){
                System.out.println("Você Está Abaixo do Peso");
            }
            else if (peso > pif){
                System.out.println("Você Está Acima do Peso");
            }
            else if (peso == pif){
                System.out.println("Você Esta com o Peso Ideal - Parabéns");
            }
            
            System.out.println("Seu Peso Ideal: " +pif +"kg");
        }
        
        
    }
}
        
      
        
        
               
            
            
            
            
        
            
            

        
        
        
        
       

    
