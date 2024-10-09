public class ProjetoLP {
    public static void main (String[]args){
        LinguagemProgramacao1 lp1 = new LinguagemProgramacao1();

        lp1.setCodigo(123);
        lp1.setLaboratorio("Inf-2");

        System.out.println(lp1.obterLaboratorio());
        System.out.println("Média = " + lp1.calcularMedia());
    }
}
