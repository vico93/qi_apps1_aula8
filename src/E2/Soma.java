package E2;

import java.util.ArrayList;
import java.util.Scanner;

public class Soma
{
    public static void main(String[] args)
    {
        // Entrada
        Scanner stdin = new Scanner(System.in);
        // Lista de números
        ArrayList <Integer> listaNumeros = new ArrayList<Integer>();
        // Inteiro auxiliar
        int x;
        
        // Splash
        System.out.println("Início da lista de números!");
        
        while (true)
        {
            System.out.print("Digite um número inteiro ou 0 para encerrar: ");
            x = stdin.nextInt();
            
            if (x == 0)
            {
                System.out.println("Paramos de adicionar então...");
                break;
            }
            else
            {
                listaNumeros.add(x);
            }
        }
        
        // Somatório
        int soma = 0;
        for (Integer i: listaNumeros)
        {
            soma += i;
        }
        System.out.println("Soma dos números: " + soma);
    }
}
