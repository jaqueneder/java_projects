// Jaqueline Neder Maiorino - RA: 2760482321031

public class ProjetoEquipamento {
    public static void main(String[] args) {
        EquipamentoCorrigido PCs = new EquipamentoCorrigido(4);
        System.out.println("Numero de elementos: " + PCs.getNumeroEquipamentos());

        for (int i = 0; i < 4; i++){
            PCs.setValor(i, i + 10);
        }

        for (int i = 0; i < 4; i++){
            PCs.setMesCompra(i, i + 1);
        }

        for (int i = 0; i < 4; i++){
            System.out.println("Definindo : Equipamento numero " + i + " Valor = " + PCs.getValor(i) + " Mes de compra = " + PCs.getMesCompra(i) + "\n");
        }

        PCs.corrige(10);
        System.out.println("Corrige: Equipamento numero " + 0 + " Valor = " + PCs.getValor(0) + " Mes de compra = " + PCs.getMesCompra(0) + "\n");

        EquipamentoCorrigido EquipamentoNovo = new EquipamentoCorrigido(4);
        for (int i = 0; i < 4; i++){
            EquipamentoNovo.setValor(i, i + 1000);
        }

        for (int i = 0; i < 4; i++){
            EquipamentoNovo.setMesCompra(i, i + 2);
        }

        PCs.substitui(EquipamentoNovo);
        for (int i = 0; i < PCs.getNumeroEquipamentos(); i++) {
            System.out.println("Substitui : Equipamento numero " + i + " Valor = " + PCs.getValor(i) + " Mes de compra = " + PCs.getMesCompra(i) + "\n");
        }
    }
}
