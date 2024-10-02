import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private  String nome;
    private Set<Conteudo> conteudoInscrito = new LinkedHashSet<>();
    private Set<Conteudo> conteudosFinalizados = new LinkedHashSet<>();



    public void inscreverBootcamp(Bootcamp bootcamp){
        bootcamp.getDevIncritos().add(this);
    this.conteudoInscrito.addAll(bootcamp.getConteudos());

    }
public void progredir(){

    Optional<Conteudo> conteudo=this.conteudoInscrito.stream().findFirst();
    if(conteudo.isPresent()){
this.conteudosFinalizados.add(conteudo.get());
this.conteudoInscrito.remove(conteudo.get());
    }else {
        System.out.println("Você não está inscrito em nenhum conteudo");
    }

}



    public int calcularXp(){
        return  this.conteudosFinalizados
                .stream()
                .mapToInt(conteudos->conteudos.calcularXp())
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscrito() {
        return conteudoInscrito;
    }

    public void setConteudoInscrito(Set<Conteudo> conteudoInscrito) {
        this.conteudoInscrito = conteudoInscrito;
    }

    public Set<Conteudo> getConteudosFinalizados() {
        return conteudosFinalizados;
    }

    public void setConteudosFinalizados(Set<Conteudo> conteudosFinalizados) {
        this.conteudosFinalizados = conteudosFinalizados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudoInscrito, dev.conteudoInscrito) && Objects.equals(conteudosFinalizados, dev.conteudosFinalizados);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoInscrito, conteudosFinalizados);
    }
}
