public class ProjetoAluno {
    public static void main (String[] args) {

        Aluno aluno1 = new Aluno("123456", "Kakau", 4.2, 8, 6);
        aluno1.mostrarAluno();
        System.out.println("Você precisa tirar " + aluno1.provaFinal() + " na prova final!");

        Aluno aluno2 = new Aluno("789101112", "Jaquinha", 2.5, 7, 5.4);
        aluno2.mostrarAluno();
        System.out.println("Você precisa tirar " + aluno2.provaFinal() + " na prova final!");
    }
}
