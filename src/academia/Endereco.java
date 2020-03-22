package academia;

/**
 *
 * @author Ander Robson - 17/12/2018
 */
public class Endereco {
    //Atributos:
    private String rua;
    private String bairro;
    private String numero;
    private String cep;
    private String cidade;
    private String estado;

    //Métodos:
    //Método construtor:
    public Endereco (){

    }

    //Getter e Setter:
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    //Método toString:
    @Override
    public String toString() {
        return "\nRua: " + rua + " - " + numero +
                "\nBairro: " + bairro  +
                "\nCEP: " + cep +
                "\nCidade: " + cidade +
                "\nEstado: " + estado;
    }
}//Fim da classe Endereco.
