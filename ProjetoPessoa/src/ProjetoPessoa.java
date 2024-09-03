public class ProjetoPessoa {
        public static void main(String[]args){

            PessoaFisica pessoaF1 = new PessoaFisica ("Jaque");
            System.out.println("Nome = " + pessoaF1.getNome());

            pessoaF1.setNome("Kauan");
            pessoaF1.setCpf(12345678);
            
            System.out.println("Nome = " + pessoaF1.getNome());
            System.out.println("CPF = " + pessoaF1.getCpf());

            Aluno aluno1 = new Aluno("Jaque", 1234567);
            Aluno aluno2 = new Aluno("Kauan" , 7654321);
            Professor professor1 = new Professor("Prof. Olavo", 3333333);

            aluno1.setCpf(1111111);
            aluno2.setCpf(2222222);

            aluno1.mostrar();
            aluno2.mostrar();
            professor1.mostrar();
        }
}
