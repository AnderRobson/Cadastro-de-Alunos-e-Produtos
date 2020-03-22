package academia;

/**
 *
 * @author Ander Robson - 17/12/2018
 */
public class Fornecedor {
    //Atributos:
    private String nome;
    private String cnpj;
    private String telefone;
    private Endereco endereco;

    //Métodos:
    //Método construtor:
    public Fornecedor(){
        this.endereco = new Endereco();
    }

    //Getter e Setter:
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    //Método toString:
    @Override
    public String toString() {
        return "-----Fornecedor:-----" +
                "\n Nome: " + nome +
                "\n CNPJ: " + cnpj +
                "\n Telefone: " + telefone +
                "\n Endereço: " + endereco;
    }
}//Fim da classe Fornecedor.

