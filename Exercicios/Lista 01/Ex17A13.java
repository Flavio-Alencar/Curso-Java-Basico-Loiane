//Exercício 17 - Aula 13

import java.util.Scanner;

public class Ex17A13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite em metros quadrados a Área a ser Pintada: ");
        double area = scan.nextDouble();
        double areaTotal = area*1.1;
        double latas = (areaTotal/108)+1;
        double galao = (areaTotal/21.6)+1;    
        int qntLatas = (int)latas;
        int qntGalao = (int)galao;
        double valorLatas = 80.0*qntLatas;
        double valorGalao = 25.0*qntGalao; 
        System.out.println("                                              ");
        
      if (qntLatas <= 1){
        System.out.println("Quantidade de Latas: " +qntLatas);
        System.out.println("Valor Total de Latas: " +"R$" +valorLatas);
      }
      else {
        System.out.println("Quantidade de Latas: " +qntLatas);
        System.out.println("Valor Total de Latas: " +"R$" +valorLatas);
      }
      
      if (qntGalao <= 1){
        System.out.println("Quantidade de Galões: " +qntGalao);
        System.out.println("Valor Total: " +"R$" +valorGalao);
      }
      else{
        System.out.println("Quantidade de Galões: " +qntGalao);
        System.out.println("Valor Total de Galões: " +"R$" +valorGalao);
      }
      
        System.out.println("                                         ");
        System.out.println("SUGESTÃO");
      
      if (valorLatas < valorGalao){
        System.out.println("Quantidade de Latas: " +qntLatas);
        System.out.println("Valor Total de Latas: " +"R$" +valorLatas); 
        }
      else{
        System.out.println(" Quantidade de Galões: " +qntGalao);
        System.out.println(" Valor Total de Latas: " +"R$" +valorGalao);   
         }
      }
          
      }
      
        
        
        
        

    
