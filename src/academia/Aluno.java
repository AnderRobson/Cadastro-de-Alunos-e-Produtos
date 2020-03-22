package academia;

/**
*
* @author Ander Robson - 17/12/2018
*/
public class Aluno {
    //Atributos:
    private int codigo;
    private String nome;
    private String graduacao;
    private String cpf;
    private byte tipoSanguineo;
    private Nascimento nascimento;
    private Endereco endereco;
    private byte genero;

    //Métodos:
    //Método construtor:
    public Aluno(){
        this.nascimento = new Nascimento();
        this.endereco = new Endereco();
        this.tipoSanguineo = 0;
        this.genero = 0;
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

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public byte getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(byte tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public Nascimento getNascimento() {
        return nascimento;
    }

    public void setNascimento(Nascimento nascimento) {
        this.nascimento = nascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public byte getGenero() {
        return genero;
    }

    public void setGenero(byte genero) {
        this.genero = genero;
    }

    //Método toString:
    @Override
    public String toString() {
        if(this.tipoSanguineo == 1 && this.genero ==1){
            //Tipo Sanguíneo O+ e do sexo Masculino:
            return "\n-----Aluno:-----" +
                    "\nCodigo: " + codigo +
                    "\nNome: " + nome +
                    "\nGraduação: " + graduacao +
                    "\nCPF: " + cpf +
                    "\nTipo Sanguíneo: O+" +
                    "\nGênero: Masculino" +
                    "\nNascimento: " + nascimento +
                    "\nEndereço: " + endereco;
        }else if(this.tipoSanguineo == 1 && this.genero ==2){
            //Tipo Sanguíneo O+ e do sexo Feminino:
            return "\n-----Aluno:-----" +
                    "\nCodigo: " + codigo +
                    "\nNome: " + nome +
                    "\nGraduação: " + graduacao +
                    "\nCPF: " + cpf +
                    "\nTipo Sanguíneo: O+" +
                    "\nGênero: Feminino" +
                    "\nNascimento: " + nascimento +
                    "\nEndereço: " + endereco;
        }else if(this.tipoSanguineo == 2 && this.genero ==1){
            //Tipo Sanguíneo A+ e do sexo Masculino:
            return "\n-----Aluno:-----" +
                    "\nCodigo: " + codigo +
                    "\nNome: " + nome +
                    "\nGraduação: " + graduacao +
                    "\nCPF: " + cpf +
                    "\nTipo Sanguíneo: A+" +
                    "\nGênero: Masculino" +
                    "\nNascimento: " + nascimento +
                    "\nEndereço: " + endereco;
        }else if(this.tipoSanguineo == 2 && this.genero ==2){
            //Tipo Sanguíneo A+ e do sexo Feminino:
            return "\n-----Aluno:-----" +
                    "\nCodigo: " + codigo +
                    "\nNome: " + nome +
                    "\nGraduação: " + graduacao +
                    "\nCPF: " + cpf +
                    "\nTipo Sanguíneo: A+" +
                    "\nGênero: Feminino" +
                    "\nNascimento: " + nascimento +
                    "\nEndereço: " + endereco;
        }else if(this.tipoSanguineo == 3 && this.genero ==1){
            //Tipo Sanguíneo B+ e do sexo Masculino:
            return "\n-----Aluno:-----" +
                    "\nCodigo: " + codigo +
                    "\nNome: " + nome +
                    "\nGraduação: " + graduacao +
                    "\nCPF: " + cpf +
                    "\nTipo Sanguíneo: B+" +
                    "\nGênero: Masculino" +
                    "\nNascimento: " + nascimento +
                    "\nEndereço: " + endereco;
        }else if(this.tipoSanguineo == 3 && this.genero ==2){
            //Tipo Sanguíneo B+ e do sexo Feminino:
            return "\n-----Aluno:-----" +
                    "\nCodigo: " + codigo +
                    "\nNome: " + nome +
                    "\nGraduação: " + graduacao +
                    "\nCPF: " + cpf +
                    "\nTipo Sanguíneo: B+" +
                    "\nGênero: Feminino" +
                    "\nNascimento: " + nascimento +
                    "\nEndereço: " + endereco;
        }else if(this.tipoSanguineo == 4 && this.genero ==1){
            //Tipo Sanguíneo AB+ e do sexo Masculino:
            return "\n-----Aluno:-----" +
                    "\nCodigo: " + codigo +
                    "\nNome: " + nome +
                    "\nGraduação: " + graduacao +
                    "\nCPF: " + cpf +
                    "\nTipo Sanguíneo: AB+" +
                    "\nGênero: Masculino" +
                    "\nNascimento: " + nascimento +
                    "\nEndereço: " + endereco;
        }else if(this.tipoSanguineo == 4 && this.genero ==2){
            //Tipo Sanguíneo AB+ e do sexo Feminino:
            return "\n-----Aluno:-----" +
                    "\nCodigo: " + codigo +
                    "\nNome: " + nome +
                    "\nGraduação: " + graduacao +
                    "\nCPF: " + cpf +
                    "\nTipo Sanguíneo: AB+" +
                    "\nGênero: Feminino" +
                    "\nNascimento: " + nascimento +
                    "\nEndereço: " + endereco;
        }else if(this.tipoSanguineo == 5 && this.genero ==1){
            //Tipo Sanguíneo O- e do sexo Masculino:
            return "\n-----Aluno:-----" +
                    "\nCodigo: " + codigo +
                    "\nNome: " + nome +
                    "\nGraduação: " + graduacao +
                    "\nCPF: " + cpf +
                    "\nTipo Sanguíneo: O-" +
                    "\nGênero: Masculino" +
                    "\nNascimento: " + nascimento +
                    "\nEndereço: " + endereco;
        }else if(this.tipoSanguineo == 5 && this.genero ==2){
            //Tipo Sanguíneo O- e do sexo Feminino:
            return "\n-----Aluno:-----" +
                    "\nCodigo: " + codigo +
                    "\nNome: " + nome +
                    "\nGraduação: " + graduacao +
                    "\nCPF: " + cpf +
                    "\nTipo Sanguíneo: O-" +
                    "\nGênero: Feminino" +
                    "\nNascimento: " + nascimento +
                    "\nEndereço: " + endereco;
        }else if(this.tipoSanguineo == 6 && this.genero ==1){
            //Tipo Sanguíneo A- e do sexo Masculino:
            return "\n-----Aluno:-----" +
                    "\nCodigo: " + codigo +
                    "\nNome: " + nome +
                    "\nGraduação: " + graduacao +
                    "\nCPF: " + cpf +
                    "\nTipo Sanguíneo: A-" +
                    "\nGênero: Masculino" +
                    "\nNascimento: " + nascimento +
                    "\nEndereço: " + endereco;
        }else if(this.tipoSanguineo == 6 && this.genero ==2){
            //Tipo Sanguíneo A- e do sexo Feminino:
            return "\n-----Aluno:-----" +
                    "\nCodigo: " + codigo +
                    "\nNome: " + nome +
                    "\nGraduação: " + graduacao +
                    "\nCPF: " + cpf +
                    "\nTipo Sanguíneo: A-" +
                    "\nGênero: Feminino" +
                    "\nNascimento: " + nascimento +
                    "\nEndereço: " + endereco;
        }else if(this.tipoSanguineo == 7 && this.genero ==1){
            //Tipo Sanguíneo B- e do sexo Masculino:
            return "\n-----Aluno:-----" +
                    "\nCodigo: " + codigo +
                    "\nNome: " + nome +
                    "\nGraduação: " + graduacao +
                    "\nCPF: " + cpf +
                    "\nTipo Sanguíneo: B-" +
                    "\nGênero: Masculino" +
                    "\nNascimento: " + nascimento +
                    "\nEndereço: " + endereco;
        }else if(this.tipoSanguineo == 7 && this.genero ==2){
            //Tipo Sanguíneo B- e do sexo Feminino:
            return "\n-----Aluno:-----" +
                    "\nCodigo: " + codigo +
                    "\nNome: " + nome +
                    "\nGraduação: " + graduacao +
                    "\nCPF: " + cpf +
                    "\nTipo Sanguíneo: B-" +
                    "\nGênero: Feminino" +
                    "\nNascimento: " + nascimento +
                    "\nEndereço: " + endereco;

        }else if(this.tipoSanguineo == 8 && this.genero ==1){
            //Tipo Sanguíneo AB- e do sexo Masculino:
            return "\n-----Aluno:-----" +
                    "\nCodigo: " + codigo +
                    "\nNome: " + nome +
                    "\nGraduação: " + graduacao +
                    "\nCPF: " + cpf +
                    "\nTipo Sanguíneo: AB-" +
                    "\nGênero: Masculino" +
                    "\nNascimento: " + nascimento +
                    "\nEndereço: " + endereco;
        }else{
            //Tipo Sanguíneo AB- e do sexo Feminino:
            return "\n-----Aluno:-----" +
                    "\nCodigo: " + codigo +
                    "\nNome: " + nome +
                    "\nGraduação: " + graduacao +
                    "\nCPF: " + cpf +
                    "\nTipo Sanguíneo: AB-" +
                    "\nGênero: Feminino" +
                    "\nNascimento: " + nascimento +
                    "\nEndereço: " + endereco;
        }
    }//Fim método toString().
}//Fim da classe Aluno.

