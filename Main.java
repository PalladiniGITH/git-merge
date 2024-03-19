public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica("Musica 01", 5.0);
        Musica musica2 = new Musica("Musica 02", 4.5);
        Musica musica3 = new Musica("Musica 03", 6.0);
        Musica musica4 = new Musica("Musica 04", 4.2);
        Musica musica5 = new Musica("Musica 05", 5.3);

        Musica[] musicas = {musica1, musica2, musica3, musica4, musica5};

        Album album = new Album("Album 1 1 2024", 2024, musicas);

        System.out.println("Album: " + album.getNome() + " - Ano: " + album.getAnoLancamento());
        System.out.println("Musicas:");
        for (Musica musica : album.getMusicas()) {
            System.out.println("Nome: " + musica.getNome() + " - Duracao: " + musica.getDuracao() + " minutos");
        }
    }
}
