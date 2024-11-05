package visao;

import java.util.ArrayList;

import dominio.Veiculo;
import servico.VeiculoServico;


public class VeiculoMenu extends BaseMenu {

    private VeiculoServico srv;

    public VeiculoMenu(){
        super();
        this.srv = new VeiculoServico();
    }


    
    @Override
    public void ExibirMenu() {
        int opcao = 0;
        while(opcao != 9){
            Util.LimparConsole();
            System.out.println("Cadastro de Classes de Produto");
            System.out.println("1 - Listar");
            System.out.println("2 - Localizar");
            System.out.println("3 - Adicionar");
            System.out.println("4 - Atualizar");
            System.out.println("5 - Remover");
            System.out.println("9 - Sair");
            System.out.print("Selecione uma opção:  ");
            opcao = this.scanner.nextInt();
            switch (opcao) {
                case 1:
                    this.Listar();
                    break;
                case 2:
                    this.Localizar();
                    break;
                    case 3:
                    this.Adicionar();
                    break;
                    case 4:
                    this.Alterar();
                    break;
                    case 5:
                    this.Remover();
                    case 9:
                    System.out.println("Saindo");
                    break;
                    default:
                    System.out.println("Opcao Invalida");
                    break;
            }
            
        }
    }

    @Override
    public void Listar() {
        Util.LimparConsole();
        System.out.println("Listando");

        ArrayList<Veiculo> lista = this.srv.Navegar();
        for (Veiculo vl : lista) {
            this.ImprimirPorLinha(vl);
        }

        System.out.println("Clique <ENTER> para continuar");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    @Override
    public void Localizar() {
        Util.LimparConsole();
        System.out.println("Localizando");

        System.out.print("Informe o codigo da Classe de produto: ");
        int cod = this.scanner.nextInt();

        Veiculo vl = this.srv.Ler(cod);
        if (vl != null){
            this.ImprimirPorLinha(vl);
        }else{
            System.out.println("Problema - Classe de Produto Nao encontrada");
        }
        System.out.println("Clique <ENTER> para continuar");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    @Override
    public void Adicionar() {
        Util.LimparConsole();
        System.out.println("Adicionando");
        System.out.println("Informe a Marca");
        String marca = this.scanner.next();
        System.out.println("Informe o Modelo");
        String modelo = this.scanner.next();
        System.out.println("Informe o Ano de Fabricação");
        int anodefabricacao = this.scanner.nextInt();
        System.out.println("Informe o Valor");
        double valor = this.scanner.nextDouble();
       

        Veiculo vl = new Veiculo();
        vl.setMarca(marca);
        vl.setModelo(modelo);
        vl.setAnoFabricação(anodefabricacao);
        vl.setPreco(valor);

        if(this.srv.Adicionar(vl)!= null){
            System.out.println("Classe de Produto Adicionada com sucesso");
        }
        else{
            System.out.println("Problema - erro ao adicionar classe de produto");
        }
        System.out.println("Clique <ENTER> para continuar");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    @Override
    public void Alterar() {
        Util.LimparConsole();
        System.out.println("Alterando");

        System.out.print("Informe o codigo do veiculo Desejado ");
        int cod = this.scanner.nextInt();

        Veiculo vl = this.srv.Ler(cod);
        if (vl != null){
            System.out.println("Informe o novo Valor: ");
            Double valor = this.scanner.nextDouble();
            vl.setPreco(valor);

            if(this.srv.Editar(vl) != null){
                System.out.println("Alteração realizada com sucesso");
            }
            else{
                System.out.println("Problema - Alteração nao realizada ");
            }
        }else{
            System.out.println("Problema - Classe de Produto Nao encontrada");
        }
        System.out.println("");
        System.out.println("Clique <ENTER> para continuar");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    @Override
    public void Remover() {
        Util.LimparConsole();
        System.out.println("Removendo");
        System.out.print("Informe o codigo do Veiculo: ");
        int cod = this.scanner.nextInt();

        Veiculo vl = this.srv.Ler(cod);
        if (vl != null){
            if(this.srv.Deletar(cod) != null){
                System.out.println("Classe de produto excluida com sucesso");
            }
            else{
                System.out.println("Problema - Classe de produto nao excluida ");
            }
        }else{
            System.out.println("Problema - Classe de Produto Nao encontrada");
        }
        System.out.println("Clique <ENTER> para continuar");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }
        private void ImprimirPorLinha(Veiculo vl){
        String mensagem = "";
        mensagem += "Veiculo: ";
        mensagem += "Código: " + vl.getCodigo() + " | ";
        mensagem += "Marca: " + vl.getMarca() + " | ";
        mensagem += "Modelo: " + vl.getModelo() + " | ";
        mensagem += "Ano de Fabricação: " + vl.getAnoFabricação() + " | ";
        mensagem += "Valor: " + vl.getPreco() + " | ";
        System.out.println(mensagem);
        System.out.println("");
    }
    
}