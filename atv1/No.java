package atv1;
class No {
    private String valor;
    private No prox;

    public void setValor(String valor) {
        this.valor = valor;
    }
    public String getValor() {
        return this.valor;
    }
    public void setProx(No prox) {
        this.prox = prox;
    }
    public No getProx() {
        return this.prox;
    }
}