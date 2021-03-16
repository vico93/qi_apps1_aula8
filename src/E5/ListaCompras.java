package E5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ListaCompras
{
    public static void main(String[] args)
    {
        // Entrada
        Scanner stdin = new Scanner(System.in);
        
        // Lista
        ArrayList <Item> lista = new ArrayList<Item>();
        
        // Controle do menu
        byte menu;
        
        do
        {
            System.out.println("MENU"
                    + "\n1 - Exibir lista"
                    + "\n2 - Adicionar"
                    + "\n3 - Remover"
                    + "\n4 - Pesquisar"
                    + "\n5 - Ordenar lista"
                    + "\n6 - Limpar"
                    + "\nOutro - Sair");
            menu = stdin.nextByte();
            
            switch (menu)
            {
                // Exibir lista
                case 1:
                    System.out.println("Lista: " + lista);
                    break;
                // Adicionar
                case 2:
                    Item x = new Item();
                    System.out.print("Digite o nome do item: ");
                    x.nome = stdin.next();
                    System.out.print("Digite a quantidade do item: ");
                    x.qtde = stdin.nextInt();
                    System.out.print("Digite o valor do item: ");
                    x.setPreco(stdin.nextDouble());
                    
                    lista.add(x);
                    
                    System.out.println("Adicionado!");
                    break;
                // Remover
                case 3:
                    Boolean encontrei = false;
                    String nome;
                    System.out.println("Digite o nome do item à apagar: ");
                    nome = stdin.next();
                    
                    for (Item i : lista)
                    {
                        if (i.nome.equals(nome))
                        {
                            lista.remove(i);
                            System.out.println("Removido!");
                            encontrei = true;
                            break;
                        }
                    }
                    
                    if (!encontrei) System.out.println("Nennhum item encontrado!");
                    
                    break;
                // Pesquisar
                case 4:
                    Boolean encontrei2 = false;
                    String nome2;
                    System.out.print("Digite o nome do item desejado: ");
                    nome2 = stdin.next();
                    
                    for (Item i : lista)
                    {
                        if (i.nome.equals(nome2))
                        {
                            System.out.println("Primeiro encontrado: " + i);
                            encontrei2 = true;
                            break;
                        }
                    }
                    
                    if (!encontrei2) System.out.println("Nada encontrado!");
                    
                    break;
                // Ordenar
                case 5:
                    lista.sort(Comparator.comparing(a -> a.nome));
                    System.out.println("Ordenado (ou não...)!");
                    break;
                // Limpar
                case 6:
                    lista.clear();
                    System.out.println("Lista limpa!");
                    break;
                // Sair
                case 0:
                    System.out.println("Saindo do programa. Até breve!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente!");
            }
        }
        while (menu != 0);
    }

}
