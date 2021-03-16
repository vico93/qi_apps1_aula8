package E5;

public class Item
{
    public String nome;
    public int qtde;
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Construtor vazio
    public Item()
    {
    }

    @Override
    public String toString()
    {
        return "- " + nome + " (x" + qtde + "): R$ " + preco;
    }
}
