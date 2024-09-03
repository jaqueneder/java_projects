public class Professor extends PessoaFisica {
    public Professor(String nome, int cpf) {
        super(nome, cpf);
    }
    public void mostrar(){
        System.out.println("Nome = " + this.getNome() + "\nCPF = " + this.getCpf());
    }
}
