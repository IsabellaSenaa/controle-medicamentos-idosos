package app;

public class Medicamento {
    private String nome;
    private String horario;
    private boolean tomado;

    public Medicamento(String nome, String horario) {
        this.nome = nome;
        this.horario = horario;
        this.tomado = false;
    }

    public String getNome() {
        return nome;
    }

    public String getHorario() {
        return horario;
    }

    public boolean isTomado() {
        return tomado;
    }

    public void marcarComoTomado() {
        this.tomado = true;
    }
}

