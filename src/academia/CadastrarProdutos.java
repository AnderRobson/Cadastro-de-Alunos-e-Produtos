package academia;

import java.util.ArrayList;
/**
 *
 * @author Ander Robson - 17/12/2018
 */
public class CadastrarProdutos {
    //Atributos:
    private ArrayList<Produto> lista;

    //Métodos:
    //Método construtor:
    public CadastrarProdutos(){
        this.lista = new ArrayList <>();
    }

    //Método para cadastrar:
    //Mudar o nome da classe que será cadastrada:
    public void cadastrar(Produto p1){
        this.lista.add(p1);
    }
    //Método ver quantidade:
    //Sempre igual:
    public int verQuantidade(){
        return this.lista.size();
    }

    //Método para apagar cadastro:
    //Muda apenas a classe:
    public void remover(Produto p1){
        this.lista.remove(p1);
    }

    //Método para pesquisando Produtos:
    //Pesquisando Prdouto por Código:
    public Produto pesquisandoPorCodigo(int codigo){
        Produto encontrado = null;
        for(int i=0; i<this.lista.size() && encontrado == null; i++){
            if(this.lista.get(i).getCodigo() ==codigo){
                encontrado = this.lista.get(i);
            }
        }
        return encontrado;
    }

    //Método para pesquisando Produto(Pesquisa Abrangente):
    //Pesquisando Produto por Estado:
    public ArrayList<Produto> pesquisandoPorEstado(String estado){
        ArrayList<Produto> encontrados = new ArrayList<>();
        for(int i=0; i<this.lista.size(); i++){
            if(this.lista.get(i).getFornecedor().getEndereco().getEstado().equalsIgnoreCase(estado)){
                encontrados.add(this.lista.get(i));
            }
        }
        return encontrados;
    }

    //Getter e Setter:

    public ArrayList<Produto> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Produto> lista) {
        this.lista = lista;
    }

    //Método toString:
    @Override
    public String toString() {
        return "Lista de Produtos: " + lista;
    }
}//Fim da classe CadastrarProdutos.
