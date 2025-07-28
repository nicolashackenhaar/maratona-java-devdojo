package academy.devdojo.maratonajava.javacore.Csobrecargagametodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodeos;
    private String genero;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodeos);
        System.out.println(this.genero);
    }


    public void init(String nome, String tipo, int episodeos){
        this.nome = nome;
        this.tipo = tipo;
        this.episodeos = episodeos;
    }
    public void init(String nome, String tipo, int episodeos, String genero){
        this.init(nome, tipo, episodeos);
        this.genero = genero;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodeos(int episodeos) {
        this.episodeos = episodeos;
    }

    public int getEpisodeos() {
        return this.episodeos;
    }
}
