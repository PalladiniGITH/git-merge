public class Album {
    private String nome;
    private int anoLancamento;
    private String[] musicas;

    public Album(String nome, int anoLancamento, String[] musicas) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.musicas = musicas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String[] getMusicas() {
        return musicas;
    }

    public void setMusicas(String[] musicas) {
        this.musicas = musicas;
    }
}
