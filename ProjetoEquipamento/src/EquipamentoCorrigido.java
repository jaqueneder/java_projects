// Jaqueline Neder Maiorino - RA: 2760482321031

public class EquipamentoCorrigido extends Equipamento {
    public int mesCorrente;
    public int[] mesCompra;

    public EquipamentoCorrigido (int numeroEquipamentos){
        super(numeroEquipamentos);
        this.mesCompra = new int[numeroEquipamentos];
        this.mesCorrente =1;
    }

    public int getMesCompra(int numero) {
        return this.mesCompra[numero];
    }

    public void setMesCompra(int numero, int mesCompra) {
        this.mesCompra[numero] = mesCompra;
    }

    public void corrige(int percentual){
        for (int i = 0; i < super.getNumeroEquipamentos(); i++){
            if (mesCompra[i] == mesCorrente){
                int valorAtual = super.getValor(i);
                if (valorAtual != -1) {
                    int valorCorrigido = valorAtual + (valorAtual * percentual / 100);
                    setValor(i, valorCorrigido);
                }
            }
        }
        mesCorrente++;
        if (mesCorrente > 12) {
            mesCorrente = 1;
        }
    }

    public void substitui(EquipamentoCorrigido EquipamentoNovo) {
        if (EquipamentoNovo.getNumeroEquipamentos() == this.getNumeroEquipamentos()) {
            for (int i = 0; i < this.getNumeroEquipamentos(); i++) {
                this.setValor(i, EquipamentoNovo.getValor(i));
                this.setMesCompra(i, EquipamentoNovo.getMesCompra(i));
            }
        }

    }
}
