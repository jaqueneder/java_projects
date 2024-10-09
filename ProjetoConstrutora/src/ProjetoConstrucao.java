//Briena Bertoni - RA:2760482321033
//Jaqueline Neder - RA:2760482321031

public class ProjetoConstrucao {
    private String nomeProjeto;
    private String cidade;
    private double orcamento;
    private int duracaoMeses;

    private static final String[] CIDADES_VALIDAS = {
            "Campinas", "Sumaré", "Hortolândia", "Indaiatuba", "Valinhos", "Vinhedo", "Paulínia"
    };

    public ProjetoConstrucao(String nomeProjeto, String cidade, double orcamento, int duracaoMeses) throws ProjetoInvalidoException {
        if (nomeProjeto == null || nomeProjeto.trim().isEmpty()) {
            throw new ProjetoInvalidoException("Nome inválido! O nome do projeto não pode estar vazio.");
        }
        if (orcamento <= 0) {
            throw new ProjetoInvalidoException("Orçamento inválido! O orçamento deve ser maior que zero.");
        }
        if (duracaoMeses <= 0) {
            throw new ProjetoInvalidoException("Duração inválida! A duração do projeto em meses deve ser maior que zero.");
        }
        if (!cidadeValida(cidade)) {
            throw new ProjetoInvalidoException("Cidade inválida! A cidade precisa estar entre uma das opções: Campinas, Sumaré, Hortolândia, Indaiatuba, Valinhos, Vinhedo ou Paulínia.");
        }

        this.nomeProjeto = nomeProjeto;
        this.cidade = cidade;
        this.orcamento = orcamento;
        this.duracaoMeses = duracaoMeses;
    }

    private boolean cidadeValida(String cidade) {
        for (String c : CIDADES_VALIDAS) {
            if (c.equalsIgnoreCase(cidade)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "\nProjeto: " + nomeProjeto + "\n" +
                "Cidade: " + cidade + "\n" +
                "Orçamento: " + orcamento + "\n" +
                "Duração: " + duracaoMeses + " meses";
    }
}
