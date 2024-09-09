//Example 02 - Class 16
//Loiane Training - Java Basic Course
//Edited by Flávio Alencar
//Date: 09SET24 - 10h14 AM


public class LoopDoWhile
{
    public static void main(String[] args) 
    {
    //Variables
        //----------------------------------------------------------------------
        int i = 01;          //Variable counter.
        int max = 10;        //Variable maximum of count.
        //----------------------------------------------------------------------
        
        //counting 01 until max
        
        System.out.println("Counting until: " +max);
        
        while (i <= max)
        {
            System.out.println("Value of i: " +i);
            i = ++i;            
        }
        
        System.out.println("Value of i: " +i);
        
        do
        {
            i = ++i;
            System.out.println("Value of i: " +i);
        } while (i < 11);
        
        System.out.println(i);
    
    }
    
}
