//Example 01 - Class 16
//Loiane Training - Java Basic Course
//Edited by Flávio Alencar
//Date: 09SET24 - 09h56 AM


public class LoopWhile 
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
        
    }
}
