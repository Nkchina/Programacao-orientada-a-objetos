package br.com.PublicacaoNewton;
import java.util.ArrayList;

public class RedeSocial {
    private String dataCriacao;
    private String nomeUsuario;
    private String dataNascimento;
    private String senha;
    private ArrayList<Publicacao> publicacoes = new ArrayList<>();

    public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
        this.dataCriacao = dataCriacao;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void inserePublicacao(Publicacao publi) {
        publicacoes.add(publi);
    }

    public void imprimePublicacoes() {
        System.out.println("Total de publicações: " + Publicacao.getContadorPublicacao());
        for (Publicacao publi : publicacoes) {
            System.out.println("Data de publicação: " + publi.getDataPublicacao());
            System.out.println("Texto da publicação: " + publi.getTextoPublicacao());
            System.out.println("Link da mídia: " + publi.getLinkMidia());
        }
    }
}
