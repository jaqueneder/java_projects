// Jaqueline Neder Maiorino - RA: 2760482321031

public class Equipamento {
    private int[] valor;

    public Equipamento (int numeroEquipamentos){
        this.valor = new int [numeroEquipamentos];
    }

    public int getNumeroEquipamentos (){
        return valor.length;
    }

    public int getValor(int numero) {
        return this.valor[numero];
    }

    public void setValor (int numero, int valorEquipamento){
        this.valor[numero] = valorEquipamento;
    }
}
