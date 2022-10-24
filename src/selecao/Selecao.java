package selecao;
/**
 *
 * @author Alunos
 */
public class Selecao {
    private String nome;
    private String posicao;
    private int numCamiseta;
    private boolean titular;

    public Selecao(String nome, String posicao, int numCamiseta, boolean titular) {
        this.nome = nome;
        this.posicao = posicao;
        this.numCamiseta = numCamiseta;
        this.titular = titular;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getNumCamiseta() {
        return numCamiseta;
    }

    public void setNumCamiseta(int numCamiseta) {
        this.numCamiseta = numCamiseta;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Selecao{" + "nome=" + nome + ", posicao=" + posicao + ", numCamiseta=" + numCamiseta + '}';
    }
}
