package br.com.daniel.estoque.modelo;

public class Produto {
    private int codigo;
    private String nome;
    private double preco;
    private int quantidade;
    private int estoqueMin;

    public Produto(int codigo, String nome, double preco, int quantidade, int estoqueMin) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.estoqueMin = estoqueMin;
    }

    public Produto(int codigo, String nome, double preco) {
        this(codigo, nome, preco, 0, 1);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getEstoqueMin() {
        return estoqueMin;
    }

    public void setEstoqueMin(int estoqueMin) {
        this.estoqueMin = estoqueMin;
    }
}
