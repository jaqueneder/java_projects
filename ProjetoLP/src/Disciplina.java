public abstract class Disciplina {
    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo (int codigo) {
        this.codigo = codigo;
    }

    public abstract float calcularMedia();
}
