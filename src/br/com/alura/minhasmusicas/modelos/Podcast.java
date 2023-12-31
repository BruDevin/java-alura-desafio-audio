package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio {
    private String autor;
    private String descricao;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if(this.getCurtidas() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}
