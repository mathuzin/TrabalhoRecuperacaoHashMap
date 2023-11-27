public class Municipio {
    private String cidade;
    private int populacao;

    public Municipio(String cidade, int populacao){
        setCidade(cidade);
        setPopulacao(populacao);
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }
}
