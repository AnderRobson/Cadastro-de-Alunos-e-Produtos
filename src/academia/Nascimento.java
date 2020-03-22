package academia;

/**
 *
 * @author Ander Robson - 17/12/2018
 */
public class Nascimento {
    //Atributos
    private byte dia;
    private byte mes;
    private int ano;

    //Métodos
    //Método construtor:
    public Nascimento(){

    }

    //Getter e Setter:
    public byte getDia() {
        return dia;
    }

    public void setDia(byte dia) {
        this.dia = dia;
    }

    public byte getMes() {
        return mes;
    }

    public void setMes(byte mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    //Método para validar:
    public boolean verificarErro(){
        boolean erro;
        erro = dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 0 || (dia == 31 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) || (dia == 29 && mes == 2 && ano %4 != 0) || (dia >29 && mes == 2);
        if(erro){
            return true;
        }else{
            return false;
        }
    }

    //Método toString:
    @Override
    public String toString() {
        return "Nascimento: " +dia + "/" + mes + "/" + ano;
    }
}//Fim da classe Nascimento.

