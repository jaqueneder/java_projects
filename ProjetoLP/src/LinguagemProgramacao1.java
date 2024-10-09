import javax.swing.JOptionPane;

public class LinguagemProgramacao1
        extends Disciplina
        implements Pratica {

    private String laboratorio;

    public LinguagemProgramacao1(){
        System.out.println("Objeto LP1 criado!");
    }

    public void setLaboratorio (String laboratorio){
        this.laboratorio = laboratorio;
    }

    @Override
    public String obterLaboratorio(){
        return "Lab. " + this.laboratorio;
    }

    @Override
    public float calcularMedia(){
        String entrada;
        float nota1, nota2;

        entrada = JOptionPane.showInputDialog("Digite a nota 1: ");
        nota1 = Float.parseFloat(entrada);

        entrada = JOptionPane.showInputDialog("Digite a nota 2: ");
        nota2 = Float.parseFloat(entrada);

        return (nota1 + nota2)/2;
    }
}
