package fakedb;

import java.util.ArrayList;

public abstract class BaseFakeDB<Tdominio> {

    protected ArrayList<Tdominio> tabela;
    
    public ArrayList<Tdominio>getTabela(){
        return tabela;
    }

    protected abstract void preencherDados();

    public BaseFakeDB(){
        this.preencherDados();
    }
}
