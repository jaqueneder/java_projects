//Atributos do Aluno:
public class Aluno {
    private String matricula;
    private String nome;
    private double nota1;
    private double nota2;
    private double notaTrab;


    //Métodos:
    public Aluno (String matricula, String nome, double nota1, double nota2, double notaTrab){
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaTrab = notaTrab;
    }

    public double mediaAluno (){
        double mediaAluno;
        mediaAluno = (this.nota1 * 0.25) + (this.nota2 * 0.25) + (this.notaTrab * 0.2);
        return mediaAluno;
    }

    public double provaFinal(){
        if (mediaAluno() > 6){
            return 0;
        }
        else{
            double notaFalta = 6 - mediaAluno();
            if (notaFalta > 3){
                System.out.println("Você já reprovou!");
            }
            notaFalta = notaFalta / 0.3;
            return notaFalta;
        }

    }

    public void mostrarAluno (){
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Média: " + mediaAluno());
    }
}