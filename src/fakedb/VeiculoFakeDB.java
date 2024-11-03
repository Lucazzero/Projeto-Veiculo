package fakedb;

import java.util.ArrayList;

import dominio.Veiculo;

public class VeiculoFakeDB extends BaseFakeDB<Veiculo> {

    @Override
    protected void preencherDados() {
        this.tabela = new ArrayList<Veiculo>();

        this.tabela.add(new Veiculo(1,"Toyota","Corolla",2020,8000.00));
        this.tabela.add(new Veiculo(2,"Honda","Civic",2019,8500.00));
        this.tabela.add(new Veiculo(3,"Ford","Fiesta",2021,6500.00));
        this.tabela.add(new Veiculo(4,"Chevrolet","Onix",2022,7000.00));
        this.tabela.add(new Veiculo(5,"Volkswagen","Gol",2020,6200.00));
    }

    public VeiculoFakeDB(){
        super();
    }
    
}
 