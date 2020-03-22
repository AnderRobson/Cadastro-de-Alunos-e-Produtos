package academia;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Ander Robson - 17/12/2018
 */
public class Main {
    public static void main(String[] args) {
        //Instanciamos a classe:
        CadastrarAlunos ca1 = new CadastrarAlunos();
        CadastrarProdutos cp1 = new CadastrarProdutos();

        //Menu:
        byte menu;
        do{
            menu = Byte.parseByte(JOptionPane.showInputDialog("Menu"+
                    "\n1 - Cadastrar Novo Aluno" +
                    "\n2 - Cadastrar Novo Produto" +
                    "\n3 - Mostrar Alunos no Sistema" +
                    "\n4 - Mostrar Produtos no Sistema" +
                    "\n5 - Ver Quantidade de Alunos" +
                    "\n6 - Ver Quantidade de Produtos" +
                    "\n7 - Remover Algum Aluno" +
                    "\n8 - Remover Algum Produto" +
                    "\n9 - Pesquisar Aluno" +
                    "\n10 - Pesquisar Produto" +
                    "\n0 - Sair"));
            switch(menu){
                case 1:
                    JOptionPane.showMessageDialog(null, "CADASTRANDO ALUNO...");
                    //Chamando classe Aluno:
                    Aluno a1 = new Aluno();
                    JOptionPane.showMessageDialog(null, "-INFORMAÇÕES DO ALUNO-");
                    //Gerando código:
                    if(ca1.getLista().isEmpty()){
                        a1.setCodigo(1);
                    }else{
                        a1.setCodigo(ca1.getLista().size() + 1);
                    }
                    do{
                        a1.setNome(JOptionPane.showInputDialog("Digite o Nome do Aluno:"));
                        if(a1.getNome().length()<2){
                            JOptionPane.showMessageDialog(null, "Erro! Nome do Aluno Mínimo 2 Digitos!");
                        }
                    }while(a1.getNome().length()<2);
                    do{
                        a1.setGraduacao(JOptionPane.showInputDialog("Digite a Graduação do Aluno:"));
                        if(a1.getGraduacao().length()<2){
                            JOptionPane.showMessageDialog(null, "Erro! Graduação do Aluno Mínimo 2 Digitos!");
                        }
                    }while(a1.getGraduacao().length()<2);
                    do{
                        a1.setCpf(JOptionPane.showInputDialog("Digite o CPF do Aluno:"));
                        if(a1.getCpf().length()!=11){
                            JOptionPane.showMessageDialog(null, "Erro! CPF do Aluno Diferente de 11 Digitos!");
                        }
                    }while(a1.getCpf().length()!=11);
                    do{
                        a1.setTipoSanguineo(Byte.parseByte(JOptionPane.showInputDialog("Digite o Tipo Sanguíneo:" + "\n1 - O+" + "\n2 - A+" + "\n3 - B+" + "\n4 - AB+" + "\n5 - O-" + "\n6 - A-" + "\n7 - B-" + "\n8 - AB-")));
                        if(a1.getTipoSanguineo()<1 || a1.getTipoSanguineo()>8){
                            JOptionPane.showMessageDialog(null, "Erro! Opção Inválida!");
                        }
                    }while(a1.getTipoSanguineo()<1 || a1.getTipoSanguineo()>8);
                    do{
                        a1.setGenero(Byte.parseByte(JOptionPane.showInputDialog("Digite o Gênero do Aluno:" + "\n1 - Masculino" + "\n2 - Feminino")));
                        if(a1.getGenero()<1 || a1.getGenero()>2){
                            JOptionPane.showMessageDialog(null, "Erro! Opção Inválida!");
                        }
                    }while(a1.getGenero()<1 || a1.getGenero()>2);
                    //Chamando classe Nascimento:
                    Nascimento n1 = new Nascimento();
                    do{
                        JOptionPane.showMessageDialog(null, "-INFORMANDO DATA DE NASCIMENTO-");
                        n1.setDia(Byte.parseByte(JOptionPane.showInputDialog("Digite o Dia:")));
                        n1.setMes(Byte.parseByte(JOptionPane.showInputDialog("Digite o Mês:")));
                        n1.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano:")));
                        if(n1.verificarErro()){
                            JOptionPane.showMessageDialog(null, "Erro! Data de Nascimento Inválida!");
                        }
                    }while(n1.verificarErro());
                    //Colocando dados de  Nascimento no Aluno:
                    a1.setNascimento(n1);
                    //Chamando classe Endereço:
                    Endereco e1 = new Endereco();
                    JOptionPane.showMessageDialog(null, "-INFORMANDO ENDEREÇO-");
                    do{
                        e1.setRua(JOptionPane.showInputDialog("Digite a Rua:"));
                        if(e1.getRua().length()<2){
                            JOptionPane.showMessageDialog(null, "Erro! Rua do Endereço Mínimo 2 Digitos!");
                        }
                    }while(e1.getRua().length()<2);
                    do{
                        e1.setNumero(JOptionPane.showInputDialog("Digite o Nº da Casa:"));
                        if(e1.getNumero().length()<2){
                            JOptionPane.showMessageDialog(null, "Erro! Nº do Endereço Mínimo 2 Digitos!");
                        }
                    }while(e1.getNumero().length()<2);
                    do{
                        e1.setBairro(JOptionPane.showInputDialog("Digite o Bairro:"));
                        if(e1.getBairro().length()<2){
                            JOptionPane.showMessageDialog(null, "Erro! Bairro do Endereço Mínimo 2 Digitos!");
                        }
                    }while(e1.getBairro().length()<2);
                    do{
                        e1.setCep(JOptionPane.showInputDialog("Digite a CEP:"));
                        if(e1.getCep().length()!=8){
                            JOptionPane.showMessageDialog(null, "Erro! CEP do Endereço Diferente de 11 Digitos!");
                        }
                    }while(e1.getCep().length()!=8);
                    do{
                        e1.setCidade(JOptionPane.showInputDialog("Digite a Cidade:"));
                        if(e1.getCidade().length()<2){
                            JOptionPane.showMessageDialog(null, "Erro! Cidade do Endereço Mínimo 2 Digitos!");
                        }
                    }while(e1.getCidade().length()<2);
                    do{
                        e1.setEstado(JOptionPane.showInputDialog("Digite o Estado:"));
                        if(e1.getEstado().length()!=2){
                            JOptionPane.showMessageDialog(null, "Erro! Estado do Endereço Diferente de 2 Digitos!");
                        }
                    }while(e1.getEstado().length()!=2);
                    //Colocando dados de Endereço no Aluno:
                    a1.setEndereco(e1);
                    ca1.cadastrar(a1);
                    JOptionPane.showMessageDialog(null, "-Cadastrado Com Sucesso!-");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "CADASTRANDO PRODUTO...");
                    //Chamando classe Produto:
                    JOptionPane.showMessageDialog(null, "-INFORMAÇOES DO PRODUTO-");
                    Produto p1 = new Produto();
                    //Gerando código:
                    if(cp1.getLista().isEmpty()){
                        p1.setCodigo(1);
                    }else{
                        p1.setCodigo(cp1.getLista().size() + 1);
                    }
                    do{
                        p1.setNome(JOptionPane.showInputDialog("Digite o Nome do Produto:"));
                        if(p1.getNome().length()<2){
                            JOptionPane.showMessageDialog(null, "Erro! Nome do Produto Mínimo 2 Digitos!");
                        }
                    }while(p1.getNome().length()<2);
                    do{
                        p1.setTamanho(JOptionPane.showInputDialog("Digite o Tamanho do Produto:"));
                        if(p1.getTamanho().length()<1){
                            JOptionPane.showMessageDialog(null, "Erro! Tamanho do Produto Mínimo 1 Digito!");
                        }
                    }while(p1.getTamanho().length()<1);
                    do{
                        p1.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do Produto:")));
                        if(p1.getValor()<0){
                            JOptionPane.showMessageDialog(null, "Erro! Valor do Produto Não Pode ser Negativo!");
                        }
                    }while(p1.getValor()<0);
                    do{
                        p1.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade do Produto:")));
                        if(p1.getQuantidade()<0){
                            JOptionPane.showMessageDialog(null, "Erro! Quantidade do Produto Não Pode ser Negativo!");
                        }
                    }while(p1.getQuantidade()<0);
                    //Chamando classe Fornecedor:
                    JOptionPane.showMessageDialog(null, "-INFORMAÇOES DO FORNECEDOR-");
                    Fornecedor f1 = new Fornecedor();
                    do{
                        f1.setNome(JOptionPane.showInputDialog("Digite o Nome do Fornecedor:"));
                        if(f1.getNome().length()<2){
                            JOptionPane.showMessageDialog(null, "Erro! Nome do Fornecedor Mínimo 2 Digitos!");
                        }
                    }while(f1.getNome().length()<2);
                    do{
                        f1.setCnpj(JOptionPane.showInputDialog("\nDigite o CNPJ do Fornecedor:"));
                        if(f1.getCnpj().length()!=14){
                            JOptionPane.showMessageDialog(null, "Erro! CNPJ do Fornecedor Diferente de 14 Digitos!");
                        }
                    }while(f1.getCnpj().length()!=14);
                    do{
                        f1.setTelefone(JOptionPane.showInputDialog("\nDigite o Telefone do Fornecedor:"));
                        if(f1.getTelefone().length()<10){
                            JOptionPane.showMessageDialog(null, "Erro! Telefone do Fornecedor Mínimo 10 Digitos!");
                        }
                    }while(f1.getTelefone().length()<10);
                    //Chamando classe Endereço:
                    JOptionPane.showMessageDialog(null, "-INFORMANDO ENDEREÇO-");
                    Endereco e2 = new Endereco();
                    do{
                        e2.setRua(JOptionPane.showInputDialog("\nDigite a rua:"));
                        if(e2.getRua().length()<2){
                            JOptionPane.showMessageDialog(null, "Erro! Rua do Endereço Mínimo 2 Digitos!");
                        }
                    }while(e2.getRua().length()<2);
                    do{
                        e2.setNumero(JOptionPane.showInputDialog("Digite o nº:"));
                        if(e2.getNumero().length()<2){
                            JOptionPane.showMessageDialog(null, "Erro! Nº do Endereço Mínimo 2 Digitos!");
                        }
                    }while(e2.getNumero().length()<2);
                    do{
                        e2.setBairro(JOptionPane.showInputDialog("Digite o Bairro:"));
                        if(e2.getBairro().length()<2){
                            JOptionPane.showMessageDialog(null, "Erro! Bairro do Endereço Mínimo 2 Digitos!");
                        }
                    }while(e2.getBairro().length()<2);
                    do{
                        e2.setCep(JOptionPane.showInputDialog("Digite a CEP:"));
                        if(e2.getCep().length()!=8){
                            JOptionPane.showMessageDialog(null, "Erro! CEP do Endereço Diferente de 11 Digitos!");
                        }
                    }while(e2.getCep().length()!=8);
                    do{
                        e2.setCidade(JOptionPane.showInputDialog("Digite a Cidade:"));
                        if(e2.getCidade().length()<2){
                            JOptionPane.showMessageDialog(null, "Erro! Cidade do Endereço Mínimo 2 Digitos!");
                        }
                    }while(e2.getCidade().length()<2);
                    do{
                        e2.setEstado(JOptionPane.showInputDialog("Digite o Estado:"));
                        if(e2.getEstado().length()!=2){
                            JOptionPane.showMessageDialog(null, "Erro! Estado do Endereço Diferente de 2 Digitos!");
                        }
                    }while(e2.getEstado().length()!=2);
                    //Colocando dados de Endereço no Produtoo:
                    f1.setEndereco(e2);
                    p1.setFornecedor(f1);
                    cp1.cadastrar(p1);
                    JOptionPane.showMessageDialog(null, "-Cadastrado Com Sucesso!-");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "\nMOSTRANDO ALUNOS DO SISTEMA...");
                    if(ca1.getLista().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Não há Alunos Cadastrado.");
                    }else{
                        JOptionPane.showMessageDialog(null,ca1);
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "\nMOSTRANDO PRODUTOS DO SISTEMA...");
                    if(cp1.getLista().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Não há Produtos Cadastrado.");
                    }else{
                        JOptionPane.showMessageDialog(null, cp1);
                    }
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "\nMOSTRANDO QUANTIDADE DE ALUNOS DO SISTEMA...");
                    int qtd = ca1.verQuantidade();
                    if(ca1.getLista().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Não há Alunos Cadastrado.");
                    }else if(qtd==1){
                        JOptionPane.showMessageDialog(null, "Há Um Aluno Cadastrado.");
                    }else{
                        JOptionPane.showMessageDialog(null, "Há " + qtd + " Alunos Cadastrado.");
                    }
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "\nMOSTRANDO QUANTIDADE DE PRODUTOS DO SISTEMA...");
                    qtd = cp1.verQuantidade();
                    if(cp1.getLista().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Não há Produtos Cadastrado.");
                    }else if(qtd==1){
                        JOptionPane.showMessageDialog(null, "Há Um Produto Cadastrado.");
                    }else{
                        JOptionPane.showMessageDialog(null, "Há " + qtd + " Produtos Cadastrado.");
                    }
                    break;
                case 7:
                    if(ca1.getLista().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Não há Aluno Cadastrado para Remover.");
                    }else{
                        JOptionPane.showMessageDialog(null, "\nREMOVENDO ALUNO...");
                        byte codigo;
                        do{
                            codigo = Byte.parseByte(JOptionPane.showInputDialog("Digite o Código do Aluno Que Deseja Remover."));
                            if(codigo<1 && codigo > ca1.getLista().size()){
                                JOptionPane.showMessageDialog(null, "Erro! Código Inválido!");
                            }
                        }while(codigo<1 && codigo > ca1.getLista().size());
                        Aluno achei = ca1.pesquisandoPorCodigo(codigo);
                        if(achei == null){
                            JOptionPane.showMessageDialog(null, "Não há Alunos para Remover.");
                        }else{
                            byte confirmar;
                            do{
                                confirmar = Byte.parseByte(JOptionPane.showInputDialog("Tem Certeza que Deseja Remover o Aluno: "+ achei.getNome() + "?" + "\n1 - REMOVER" + "\n0 - CANCELAR"));
                                if(confirmar <0 && confirmar >1){
                                    JOptionPane.showMessageDialog(null, "Erro! Opção Inválido!");
                                }
                            }while(confirmar <0 && confirmar >1);
                            switch(confirmar){
                                case 1:
                                    ca1.remover(achei);
                                    JOptionPane.showMessageDialog(null, "Aluno Removido com Sucesso!");
                                    break;
                                case 0:
                                    JOptionPane.showMessageDialog(null, "Operação Cancelada!");
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Opção Inválida!");
                            }//Fim do switch.
                        }//Fim do else.
                    }//Fim do primeiro else.
                    break;
                case 8:
                    if(cp1.getLista().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Não há Produtos Cadastrado para Remover.");
                    }else{
                        JOptionPane.showMessageDialog(null, "\nREMOVENDO PRODUTO...");
                        int codigo;
                        do{
                            codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o Código do Produto Que Deseja Remover."));
                            if(codigo<1 && codigo > cp1.getLista().size()){
                                JOptionPane.showMessageDialog(null, "Erro! Código Inválido!");
                            }
                        }while(codigo<1 && codigo > cp1.getLista().size());
                        Produto achei = cp1.pesquisandoPorCodigo(codigo);
                        if(achei == null){
                            JOptionPane.showMessageDialog(null, "Não há Produtos para Remover.");
                        }else{
                            byte confirmar;
                            do{
                                confirmar = Byte.parseByte(JOptionPane.showInputDialog("Tem Certeza que Deseja Remover o Produto: " + achei.getNome() + "?" + "\n1 - REMOVER" + "\n0 - CANCELAR"));
                                if(confirmar <0 && confirmar >1){
                                    JOptionPane.showMessageDialog(null, "Erro! Opção Inválido!");
                                }
                            }while(confirmar <0 && confirmar >1);
                            switch(confirmar){
                                case 1:
                                    cp1.remover(achei);
                                    JOptionPane.showMessageDialog(null, "Produto Removido com Sucesso!");
                                    break;
                                case 0:
                                    JOptionPane.showMessageDialog(null, "Operação Cancelada!");
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Opção Inválida!");
                            }//Fim do switch.
                        }//Fim do else.
                    }//Fim do primeiro else.
                    break;
                case 9:
                    if(ca1.getLista().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Não há Alunos para Pesquisar.");
                    }else{
                        byte menuAluno;
                        do{
                            do{
                                menuAluno= Byte.parseByte(JOptionPane.showInputDialog("1 - Pesquisar Aluno por Código." +
                                        "\n2 - Pesquisar Aluno por CPF." +
                                        "\n3 - Pesquisar Aluno por Graduação." +
                                        "\n4 - Pesquisando Aluno por Cidade." +
                                        "\n0 - Voltar a Menu Anterior"));
                                if(menuAluno<0 && menuAluno>4){
                                    JOptionPane.showMessageDialog(null, "Erro! Opção Inválido!");
                                }
                            }while(menuAluno<0 && menuAluno>4);
                            switch(menuAluno){
                                case 1:
                                    int codigo;
                                    do{
                                        codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o Código do Aluno que Deseja Pesquisar."));
                                        if(codigo<1 && codigo > ca1.getLista().size()){
                                            JOptionPane.showMessageDialog(null, "Erro! Código Inválido!");
                                        }
                                    }while(codigo<1 && codigo > ca1.getLista().size());
                                    Aluno achei = ca1.pesquisandoPorCodigo(codigo);
                                    if(achei == null){
                                        JOptionPane.showMessageDialog(null, "Não há Aluno com Este Código.");
                                    }else{
                                        JOptionPane.showMessageDialog(null, achei);
                                    }
                                    break;
                                case 2:
                                    String cpf;
                                    do{
                                        cpf = JOptionPane.showInputDialog("Digite o CPF do Aluno que Deseja Pesquisar.");
                                        if(cpf.length()!=11){
                                            JOptionPane.showMessageDialog(null, "Erro! CPF do Aluno Diferente de 11 Digitos!");
                                        }
                                    }while(cpf.length()!=11);
                                    Aluno achado = ca1.pesquisandoPorCPF(cpf);
                                    if(achado == null){
                                        JOptionPane.showMessageDialog(null, "Não há Aluno com Este CPF.");
                                    }else{
                                        JOptionPane.showMessageDialog(null, achado);
                                    }
                                    break;
                                case 3:
                                    String graduacao;
                                    do{
                                        graduacao = JOptionPane.showInputDialog("Digite o Graduação do Aluno que Deseja Pesquisar.");
                                        if(graduacao.length()<2){
                                            JOptionPane.showMessageDialog(null, "Erro! Graduação do Aluno Mínimo 2 Digitos!");
                                        }
                                    }while(graduacao.length()<2);
                                    ArrayList<Aluno> achados = ca1.pesquisandoPorGraducao(graduacao);
                                    if(achados == null){
                                        JOptionPane.showMessageDialog(null, "Não há Aluno com Esta Graduação.");
                                    }else{
                                        JOptionPane.showMessageDialog(null, achados);
                                    }
                                    break;
                                case 4:
                                    String cidade;
                                    do{
                                        cidade = JOptionPane.showInputDialog("Digite a Cidade do Aluno que Deseja Pesquisar.");
                                        if(cidade.length()<2){
                                            JOptionPane.showMessageDialog(null, "Erro! Cidade do Endereço Mínimo 2 Digitos!");
                                        }
                                    }while(cidade.length()<2);
                                    ArrayList<Aluno> achados2 = ca1.pesquisandoPorCidade(cidade);
                                    if(achados2 == null){
                                        JOptionPane.showMessageDialog(null, "Não há Aluno Nesta Cidade.");
                                    }else{
                                        JOptionPane.showMessageDialog(null, achados2);
                                    }
                                    break;
                                case 0:
                                    JOptionPane.showMessageDialog(null, "Operação cancelada.");
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Opção Invalída!");
                            }//Fim switch menuAluno.
                        }while(menuAluno !=0);
                    }
                    break;
                case 10:
                    if(cp1.getLista().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Não há Produtos para Pesquisar.");
                    }else{
                        byte menuFornecedor;
                        do{
                            do{
                                menuFornecedor = Byte.parseByte(JOptionPane.showInputDialog("1 - Pesquisando Produto por Código." + "\n2 - Pesquisar Produto por Estado." + "\n0 - Voltar a Menu Anterior."));
                                if(menuFornecedor<0 && menuFornecedor>2){
                                    JOptionPane.showMessageDialog(null, "Erro! Opção Inválido!");
                                }
                            }while(menuFornecedor<0 && menuFornecedor>2);
                            switch(menuFornecedor){
                                case 1:
                                    System.out.println();
                                    int codigo;
                                    do{
                                        codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o Código do Produto que Deseja Pesquisar."));
                                        if(codigo<1 && codigo > ca1.getLista().size()){
                                            JOptionPane.showMessageDialog(null, "Erro! Código Inválido!");
                                        }
                                    }while(codigo<1 && codigo > ca1.getLista().size());
                                    Produto achei = cp1.pesquisandoPorCodigo(codigo);
                                    if(achei == null){
                                        JOptionPane.showMessageDialog(null, "Não há Produtos com Este Código.");
                                    }else{
                                        JOptionPane.showMessageDialog(null, achei);
                                    }
                                    break;
                                case 2:
                                    if(cp1.getLista().isEmpty()){
                                        JOptionPane.showMessageDialog(null, "Não há Produtos para Pesquisar.");
                                    }else{
                                        System.out.println();
                                        String estado;
                                        do{
                                            estado = JOptionPane.showInputDialog("Digite o Estado do Produto que Deseja Pesquisar.");
                                            if(estado.length()!=2){
                                                JOptionPane.showMessageDialog(null, "Erro! Estado do Endereço Diferente de 2 Digitos!");
                                            }
                                        }while(estado.length()!=2);
                                        ArrayList<Produto> achados = cp1.pesquisandoPorEstado(estado);
                                        if(achados.isEmpty()){
                                            JOptionPane.showMessageDialog(null, "Não há Produtos com Este Estado.");
                                        }else{
                                            JOptionPane.showMessageDialog(null, achados);
                                        }
                                    }
                                    break;
                                case 0:
                                    JOptionPane.showMessageDialog(null, "Operação cancelada.");
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Opção Invalída!");
                            }//Fim switch menuFornecedor.
                        }while(menuFornecedor !=0);
                    }
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Obrigado, volte sempre!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Invalída!");
            }//Fim switch menu.
        }while (menu !=0);
    }//Fim static void main.
    //Método para limpar tela:
}//Fim classe Main.

