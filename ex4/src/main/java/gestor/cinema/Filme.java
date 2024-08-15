package gestor.cinema;


import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String titulo;
    private int ano;
    private String produtora;
    private String paisOrigem;
    private int duracao;
    private Genero genero;
    private List<Papel> papeis;

    public Filme(String titulo, int ano, String produtora, String paisOrigem, int duracao, Genero genero) {
        this.titulo = titulo;
        this.ano = ano;
        this.produtora = produtora;
        this.paisOrigem = paisOrigem;
        this.duracao = duracao;
        this.genero = genero;
        this.papeis = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public List<Papel> getPapeis() {
        return papeis;
    }

    public void adicionarPapel(Papel papel) {
        this.papeis.add(papel);
    }
}
