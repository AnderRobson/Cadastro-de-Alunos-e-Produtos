package academia;

import java.util.ArrayList;
/**
 *
 * @author Ander Robson - 17/12/2018
 */
public class CadastrarAlunos {
    //Atributos:
    private ArrayList <Aluno> lista;

    //Métodos:
    //Método construtor:
    public CadastrarAlunos (){
        this.lista = new ArrayList <>();
    }

    //Método para cadastrar:
    //Muda o nome da classe que será cadastrar:
    public void cadastrar (Aluno a1){
        this.lista.add(a1);
    }

    //Método ver quantidade:
    //Sempre igual:
    public int verQuantidade(){
        return this.lista.size();
    }

    //Método para apagar cadastro:
    //Muda apenas a classe:
    public void remover(Aluno a1){
        this.lista.remove(a1);
    }

    //Métodos para pesquisar aluno:
    //Pesquisando Aluno por código:
    public Aluno pesquisandoPorCodigo(int codigo){
        Aluno encontrado = null;
        for(int i=0; i<this.lista.size() && encontrado == null; i++){
            if(this.lista.get(i).getCodigo() ==codigo){
                encontrado = this.lista.get(i);
            }
        }
        return encontrado;
    }

    //Pesquisando Aluno por CPF:
    public Aluno pesquisandoPorCPF(String cpf){
        Aluno encontrado = null;
        for(int i=0; i<this.lista.size() && encontrado == null; i++){
            if(this.lista.get(i).getCpf().equals(cpf)){
                encontrado = this.lista.get(i);
            }
        }
        return encontrado;
    }

    //Métodos para pesquisando aluno(Pesquisa Abrangente):
    //Pesquisando Aluno por Graduação:
    public ArrayList<Aluno> pesquisandoPorGraducao(String graduacao){
        ArrayList<Aluno> encontrados = new ArrayList<>();
        for(int i=0; i<this.lista.size(); i++){
            if(this.lista.get(i).getGraduacao().equalsIgnoreCase(graduacao)){
                encontrados.add(this.lista.get(i));
            }
        }
        return encontrados;
    }

    //Pesquisando Aluno por Cidade:
    public ArrayList<Aluno> pesquisandoPorCidade(String cidade){
        ArrayList<Aluno> encontrados = new ArrayList<>();
        for(int i=0; i<this.lista.size(); i++){
            if(this.lista.get(i).getEndereco().getCidade().equalsIgnoreCase(cidade)){
                encontrados.add(this.lista.get(i));
            }
        }
        return encontrados;
    }

    //Getter e Setter:

    public ArrayList<Aluno> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Aluno> lista) {
        this.lista = lista;
    }

    //Método toString:
    @Override
    public String toString() {
        return "Lista de Alunos:" + lista;
    }
}//Fim da classe Cadastrasalunos.
