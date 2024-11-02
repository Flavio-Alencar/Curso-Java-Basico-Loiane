//Exemplo 01 - Aula 34
//Loiane Training - Java Basic Course
//Editado por Flávio Alencar
//Data: 25OUT24 - 16h08
//Assunto: Metodo Static.

package exemplos.Aula34;

public class MinhaCalculadora {

    public static int soma(int n1, int n2) {
        return n1 + n2;
    }
    
    public static double soma(double n1, double n2){
        return n1 + n2;        
    }
    
    public static int soma(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
    
    public static int soma(int[] vetorInteiros){
        int total = 0;
        
        for(int i = 0; i < vetorInteiros.length; i++){
            total += vetorInteiros[i];
        }
        
        return total;
    }
    
}
