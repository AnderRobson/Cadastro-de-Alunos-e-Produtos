package academia;

/**
 *
 * @author Ander Robson - 17/12/2018
 */
public class Produto {
    //Atributos:
    private int codigo;
    private String nome;
    private String tamanho;
    private double valor;
    private int quantidade;
    private Fornecedor fornecedor;

    //Métodos:
    //Método construtor:
    public Produto(){
        this.fornecedor = new Fornecedor();
    }

    //Getter e Setter:
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    //Método toString:
    @Override
    public String toString() {
        return "\n-----Produto:-----" +
                "\nCódigo: " + codigo +
                "\nNome:" + nome +
                "\nTamanho:" + tamanho +
                "\nValor: " + valor +
                "\nQuantidade: " + quantidade +
                "\n" + fornecedor;
    }
}//Fim da classe Produtos.

