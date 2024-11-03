package servico;

import java.util.ArrayList;

import dominio.Veiculo;
import repositorio.VeiculoRepositorio;

public class VeiculoServico extends BaseServico<Veiculo> {
    
    private VeiculoRepositorio repositorio;
    
    public VeiculoServico(){
        this.repositorio = new VeiculoRepositorio();
    }

    @Override
    public ArrayList<Veiculo> Navegar() {
        return repositorio.Browse();
    }

    @Override
    public Veiculo Ler(int chave) {
        return repositorio.Read(chave);
    }

    @Override
    public Veiculo Editar(Veiculo obj) {
        return repositorio.Edit(obj);
    }

    @Override
    public Veiculo Adicionar(Veiculo obj) {
        return repositorio.Add(obj);
    }

    @Override
    public Veiculo Deletar(int chave) {
        return repositorio.Delete(chave);
    }

}
