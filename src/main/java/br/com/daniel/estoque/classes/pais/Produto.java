package br.com.daniel.estoque.classes.pais;

import br.com.daniel.estoque.contratos.GerenciaAcoes;

public class Produto implements GerenciaAcoes {
    private String codigo;
    private String nome;
    private double valorUnitarioCompra;
    private double valorVenda;
    private int quantidade;
    private int estoqueMin;
    private static final double MARGEM_LUCRO = 0.30;

    public Produto(String codigo, String nome, double valorUnitarioCompra, int quantidade, int estoqueMin) {
        setCodigo(codigo);
        setNome(nome);
        setValorUnitarioCompra(valorUnitarioCompra);
        setValorVenda();
        setQuantidade(quantidade);
        setEstoqueMin(estoqueMin);
    }

    public Produto(String codigo, String nome, double valorUnitarioCompra) {
        this(codigo, nome, valorUnitarioCompra, 0, 2);
    }

    public String informacoes() {
        return "Peca{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", valorUnitarioCompra=" + valorUnitarioCompra +
                ", valorVenda=" + valorVenda +
                ", quantidade=" + quantidade +
                ", estoqueMin=" + estoqueMin;
    }

    @Override
    public void registraEntrada(int qtd){
        this.quantidade += qtd;
    }

    @Override
    public void registraSaida(int qtd){
        this.quantidade -= qtd;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("O código do produto não pode ser vazio.");
        }
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O produto precisa ter um nome.");
        }
        this.nome = nome;
    }

    public double getValorUnitarioCompra() {
        return valorUnitarioCompra;
    }

    public void setValorUnitarioCompra(double valorUnitarioCompra) {
        if (valorUnitarioCompra <= 0){
            throw new IllegalArgumentException("O preço do produto não poder ser menor ou igual a 0.");
        }
        this.valorUnitarioCompra = valorUnitarioCompra;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda() {
        this.valorVenda = this.valorUnitarioCompra + (this.valorUnitarioCompra * MARGEM_LUCRO);
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("A quantidade registrada não pode ser menor do que 0.");
        }
        this.quantidade = quantidade;
    }

    public int getEstoqueMin() {
        return estoqueMin;
    }

    public void setEstoqueMin(int estoqueMin) {
        if (estoqueMin < 0) {
            throw new IllegalArgumentException("A quantidade mínima não pode ser menor do que 0.");
        }
        this.estoqueMin = estoqueMin;
    }
}
