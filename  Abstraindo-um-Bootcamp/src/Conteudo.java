
import java.time.LocalDate;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public Conteudo(String titulo, String descricao, int cargaHoraria, LocalDate data) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public Conteudo() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract double calcularXP();

}