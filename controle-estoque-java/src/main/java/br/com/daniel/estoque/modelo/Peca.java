package br.com.daniel.estoque.modelo;

public class Peca {
    private int codigo;
    private String nome;
    private double valorUnitarioCompra;
    private double valorVenda;
    private int quantidade;
    private int estoqueMin;
    private static final double LUCRO_PECA = 0.30;

    public Peca(int codigo, String nome, double valorUnitarioCompra, int quantidade, int estoqueMin) {
        setCodigo(codigo);
        setNome(nome);
        setValorUnitarioCompra(valorUnitarioCompra);
        setValorVenda();
        setQuantidade(quantidade);
        setEstoqueMin(estoqueMin);
    }

    public Peca(int codigo, String nome, double valorUnitarioCompra) {
        this(codigo, nome, valorUnitarioCompra, 0, 2);
    }

    @Override
    public String toString() {
        return "Peca{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", valorUnitarioCompra=" + valorUnitarioCompra +
                ", valorVenda=" + valorVenda +
                ", quantidade=" + quantidade +
                ", estoqueMin=" + estoqueMin +
                '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo < 10) {
            throw new IllegalArgumentException("O código do produto deve possuir no mínimo 2 números.");
        }
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("A peça precisa ter um nome.");
        }
    }

    public double getValorUnitarioCompra() {
        return valorUnitarioCompra;
    }

    public void setValorUnitarioCompra(double valorUnitarioCompra) {
        if (valorUnitarioCompra <= 0){
            throw new IllegalArgumentException("O preço da peça não poder ser menor ou igual a 0.");
        }
        this.valorUnitarioCompra = valorUnitarioCompra;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda() {
        this.valorVenda = this.valorUnitarioCompra + (this.valorUnitarioCompra * LUCRO_PECA);
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
