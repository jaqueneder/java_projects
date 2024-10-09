//Briena Bertoni - RA:2760482321033
//Jaqueline Neder - RA:2760482321031

import java.util.Scanner;
public class ProjetoConstrutora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o nome do projeto: ");
            String nomeProjeto = scanner.nextLine();

            System.out.print("Digite a cidade do projeto: ");
            String cidade = scanner.nextLine();

            System.out.print("Digite o orçamento do projeto: ");
            double orcamento = scanner.nextDouble();

            System.out.print("Digite a duração em meses do projeto: ");
            int duracaoMeses = scanner.nextInt();

            ProjetoConstrucao projeto = new ProjetoConstrucao(nomeProjeto, cidade, orcamento, duracaoMeses);

            System.out.println("\nProjeto cadastrado!");
            System.out.println(projeto);

        } catch (ProjetoInvalidoException e) {
            System.out.println("\nErro ao cadastrar o projeto: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}