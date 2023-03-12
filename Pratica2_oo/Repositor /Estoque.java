public class Estoque {

    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public Estoque() {
    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public void darBaixa(int qtde) {
        int novaQtd = this.qtdAtual - qtde;
        if (novaQtd < 0) {
            System.out.println("Não é possível dar baixa, quantidade insuficiente em estoque.");
        }
        else {
            this.qtdAtual = novaQtd;
        }
    }

    public String mostra() {
        return "Nome: " + this.nome + "\nQuantidade atual: " + this.qtdAtual + "\nQuantidade mínima: " + this.qtdMinima;
    }

    public boolean precisaRepor() {
        return this.qtdAtual <= this.qtdMinima;
    }
}
