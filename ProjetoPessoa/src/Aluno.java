public class Aluno extends PessoaFisica {
    private int ra;

    public Aluno(String nome, int ra){
        super(nome);
        this.ra = ra;
    }

    public int getRa(){
        return ra;
    }

    public void setRa(int ra){
        this.ra = ra;
    }

    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("\nRA = " + this.getRa());
    }
}
