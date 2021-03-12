/*
 * Exercício 1
 */
package E1;

import java.util.ArrayList;
import java.util.Scanner;

public class Positivos
{
    public static void main(String[] args)
    {
        // Entrada
        Scanner stdin = new Scanner(System.in);
        // Lista de números
        ArrayList <Integer> listaNumeros = new ArrayList<Integer>();
        // Inteiro auxiliar
        int x;
        // Opção para o segundo menu
        byte opcao;
        
        System.out.println("Início da lista de positivos!");
        
        while (true)
        {
            System.out.print("Digite um número maior que zero, ou -1 para encerrar: ");
            x = stdin.nextInt();
            
            if (x == -1)
            {
                System.out.println("Paramos de adicionar então...");
                break;
            }
            else if (x < 0)
            {
                System.out.println("Número inválido! Tente novamente...");
            }
            else
            {
                listaNumeros.add(x);
            }
        }
        
        do
        {
            System.out.println("--------------------------------------------\n");
            System.out.println("Digite agora a opção desejada:"
                    + "\n1 - Exibir a lista completa;"
                    + "\n2 - Exibir a soma dos números digitados"
                    + "\n3 - Exibir a quantidade de números digitados"
                    + "\n4 - Exibir a média dos números digitados"
                    + "\n0 - Sair\n");
            opcao = stdin.nextByte();        

            switch (opcao)
            {
                case 1:
                    System.out.println("Lista: " + listaNumeros);
                    break;
                case 2:
                    int soma = 0;
                    for (Integer i: listaNumeros)
                    {
                        soma += i;
                    }
                    System.out.println("Soma dos números: " + soma);
                    break;
                case 3:
                    System.out.println("Quantidade de items digitados: " + listaNumeros.size());
                    break;
                case 4:
                    int soma2 = 0;
                    for (Integer i: listaNumeros)
                    {
                        soma2 += i;
                    }
                    System.out.println("Média dos números: " + (soma2 / listaNumeros.size()) );
                    break;
                case 0:
                    System.out.println("Saindo, obrigado pela atenção!");
                    break;
                default:
                    System.out.println("Opção Inválida! Tente novamente!");
            }
        }
        while (opcao != 0);
        
    }
}
