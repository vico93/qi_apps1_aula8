package E3;

import java.util.Scanner;

public class Crescimento
{
    public static void main(String[] args)
    {
        // Entrada
        Scanner stdin = new Scanner(System.in);
        
        double mariazinha = 1.50;
        double maricota = 1.10;
        int anos = 0;
        
        do
        {
            maricota += 0.03;
            mariazinha += 0.02;
            
            anos++;            
        }
        while (maricota <= mariazinha);
        
        System.out.println("Em " + anos + " anos Maricota será maior que Mariazinha.");
        // System.out.println(maricota + " > " + mariazinha);
    }
}
