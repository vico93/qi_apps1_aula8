package E4;

import java.util.Scanner;

public class Decaimento
{
    public static void main(String[] args)
    {
        // Entrada
        Scanner stdin = new Scanner(System.in);
        
        double massaInicial;
        int segundos = 0;
        
        System.out.println("Informe a massa inicial, em g: ");
        massaInicial = stdin.nextDouble();
        
        do
        {
            segundos += 50;
            massaInicial -= (massaInicial / 2);
        }
        while (massaInicial > 0.5);
        
        // Recebe a parte inteira da divisão
        int horas = segundos / 3600;
        // Recebe o resto decimal pra seguir calculando
        segundos %= 3600;
        // Recebe a divisão inteira
        int minutos = segundos / 60;
        // Recebe o resto da divisão
        segundos %= 60;
        
        System.out.print("Tempo total de decaimento:");
        
        if (horas > 0)
        {
            System.out.printf(" %d horas", horas);
        }
        if (minutos > 0)
        {
            System.out.printf(" %d minutos", minutos);
        }
        if (segundos > 0)
        {
            System.out.printf(" %d segundos", segundos);
        }
        System.out.println("");
    }
}
