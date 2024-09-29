//Aula 13 - Operadores Aritiméticos


public class OperadoresAritimeticos {

    public static void main(String[] args) {
        
        int r1 = 1+2;        
        System.out.println("O valor da Soma: " +r1);
        
        r1 = r1 - 1;
        System.out.println("O valor da Subtração: " +r1);
        
        r1 = r1*2;
        System.out.println("O valor da Multiplicação: " +r1);
        
        r1 = r1/2;
        System.out.println("O valor da Divisão: " +r1);
        
        r1 = r1 + 8;
        System.out.println("O valor da Soma: " +r1);
        
        r1 = r1%7;
        System.out.println("O valor do Resto: " +r1);
        
        String primeiroNome = "Esta é";
        String segundoNome = " uma String Concatenada.";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);
        
        r1 = r1 + 1;
        System.out.println(r1);
        
        r1++;
        System.out.println(r1);
        System.out.println(r1++); //Primeiro imprime o valor e depois adiciona 1
        System.out.println(++r1);
        
        r1--;
        System.out.println(r1);
        System.out.println(r1--);
        System.out.println(--r1);
                
        
        
        
        
        
        
        
    }
}
