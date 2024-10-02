import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "data=" + data +
                "descrição"+getDescricao()+
                "Titulo"+getTitulo()+
                '}';
    }

    @Override
    public int calcularXp() {
        return XP_PADRAO+10;
    }
}
