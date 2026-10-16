package br.com.daniel.estoque.classes.filhas;

import br.com.daniel.estoque.classes.pais.Produto;
import br.com.daniel.estoque.contratos.GerenciaAcoes;

public class Peca extends Produto {

    public Peca (String codigo, String nome, double valorUnitarioCompra){
        super(codigo, nome, valorUnitarioCompra );
    }

    @Override
    public String informacoes(){
        return super.informacoes();
    }

}
