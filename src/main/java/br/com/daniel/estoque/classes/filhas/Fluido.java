package br.com.daniel.estoque.classes.filhas;

import br.com.daniel.estoque.classes.pais.Produto;
import br.com.daniel.estoque.contratos.GerenciaAcoes;

public class Fluido extends Produto {
    private String tipo;

    public Fluido (String codigo, String nome, double valorUnitarioCompra, String tipo){
        super(codigo, nome, valorUnitarioCompra);
        this.tipo = tipo;
    }

    @Override
    public String informacoes(){
        return super.informacoes() + ", tipo=" + tipo + '}';
    }

}
