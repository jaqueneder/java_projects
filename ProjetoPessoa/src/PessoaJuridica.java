public class PessoaJuridica extends Pessoa {
    private int cnpj;
    private int ie;

    public PessoaJuridica(String nome){
        super(nome);
    }

    public int getCnpj(){
        return cnpj;
    }

    public void setCnpj(int cnpj){
        this.cnpj = cnpj;
    }

}
