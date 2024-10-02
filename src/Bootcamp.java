import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String descricao;
    private LocalDate dataInicio=LocalDate.now();
    private LocalDate datafinal=dataInicio.plusDays(45);
    private Set<Dev> devIncritos=new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDatafinal() {
        return datafinal;
    }

    public void setDatafinal(LocalDate datafinal) {
        this.datafinal = datafinal;
    }

    public Set<Dev> getDevIncritos() {
        return devIncritos;
    }

    public void setDevIncritos(Set<Dev> devIncritos) {
        this.devIncritos = devIncritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    private Set<Conteudo> conteudos=new LinkedHashSet<>();


}
