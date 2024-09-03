public class PessoaFisica extends Pessoa {
    private int cpf;

    public PessoaFisica(String nome, int cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public PessoaFisica(String nome) {
        super(nome);
    }

    public int getCpf(){
        return cpf;
    }

    public void setCpf(int cpf){
        this.cpf = cpf;
    }

    public void mostrar(){
        System.out.println("Nome = " + this.getNome() + "\nCPF = " + this.getCpf());
    }
}
