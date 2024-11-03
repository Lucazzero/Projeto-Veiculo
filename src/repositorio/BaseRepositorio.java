package repositorio;

import java.util.ArrayList;

public abstract class BaseRepositorio<Tdominio> {
    protected ArrayList<Tdominio> dados;

    public ArrayList<Tdominio> Browse(){
        return this.dados;
    }
    
    public abstract Tdominio Read(int chave);
    public abstract Tdominio Edit(Tdominio instancia);
    public abstract Tdominio Add(Tdominio instancia);
    public abstract Tdominio Delete(int chave);
}
