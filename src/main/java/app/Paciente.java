package app;

public class Paciente {
    private String nome;
    private String cep;
    private String endereco;

    public Paciente(String nome, String cep) {
        this.nome = nome;
        this.cep = cep;
        this.endereco = ViaCepService.buscarCep(cep);
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CEP: " + cep);
        System.out.println("Endereço: " + endereco);
    }
}
