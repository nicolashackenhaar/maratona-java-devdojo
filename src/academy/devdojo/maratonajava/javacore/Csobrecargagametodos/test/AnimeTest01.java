package academy.devdojo.maratonajava.javacore.Csobrecargagametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargagametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Globo", "TV", 12, "Noticias");
        anime.imprime();


    }
}
