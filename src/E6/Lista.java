package E6;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista
{
    public static void main(String[] args)
    {
        // Entrada
        Scanner stdin = new Scanner(System.in);
        
        // Lista
        ArrayList<Integer> lista = new ArrayList<Integer>();
        
        // Popular lista
        for (int i = 1; i < 51; i++)
        {
            lista.add(i);
        }
        
        // Menu
        byte menu;        
        do
        {
            System.out.println("Digite a opção:"
                    + "\n1 - Listar números de 1 a 50;"
                    + "\n2 - Exibir a lista na horizontal e vertical;"
                    + "\n3 - Exibir o tamanho da lista;"
                    + "\n4 - Somar os valores da lista;"
                    + "\n0 - Sair");
            menu = stdin.nextByte();
            switch (menu)
            {
                // Listar
                case 1:
                    System.out.println(lista);
                    break;
                // Não entendi direito
                case 2:
                    System.out.println("Lista na Horizontal: ");
                    for (Integer i : lista)
                    {
                        System.out.print(i + ", ");
                    }
                    System.out.println("\nLista na vertical");
                    for (Integer i : lista)
                    {
                        System.out.print(i + "\n");
                    }
                    break;
                // Tamanho
                case 3:
                    System.out.println("Tamanho da lista: " + lista.size());
                    break;
                // Somatório
                case 4:
                    int soma = 0;
                    for (Integer i : lista)
                    {
                        soma += i;
                    }
                    System.out.println("Somatório é: " + soma);
                    break;
                // Sair
                case 0:
                    System.out.println("Saindo do programa. Até breve!");
                    break;
                // Inválido
                default:
                    System.out.println("Opção inválida! Tente novamente!");
            }
        }
        while (menu != 0);
    }
}
