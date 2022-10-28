package atv1;
public class Lista {
    private No inicio;

    //construtor
    public Lista(){
        this.inicio = null;
    }
    public void inserir(String valor){
        No novo = new No();
        novo.setValor(valor);
        novo.setProx(null);
        if (vazia()) {
            inicio = novo;
        }
        else{
            No aux;
            aux = inicio;
            while (aux.getProx() != null) {
                aux = aux.getProx();
            }
            aux.setProx(novo);
        }
    }
    public String retirar(){
        if (vazia()) {
            return null;
        } 
        else{
            inicio = inicio.getProx();
            return null;
        }
        
    }
    public boolean vazia(){
        return this.inicio == null;
    }

    public int verificaTamanho(){
        int cont = 0;
        No aux;
        aux = inicio;
        if (vazia()) {
            return cont;
        }
        else {
            while (aux != null) {
                cont++;
                aux = aux.getProx();
            }
        }
        return cont;
    }

    public int tamanhoTotal(int lista1, int lista2){
        int soma = lista1 + lista2;
        return soma;
    }


    // criação da 3 lista 
    public void intercalar(Lista lista1, Lista lista2, int totalValores){
        No auxLista1;
        auxLista1 = lista1.inicio;
        No auxLista2;
        auxLista2 = lista2.inicio;
       for (int i = 0; i < totalValores; i++) {
            No novo = new No();
            if (auxLista1 != null) {
                inserir(auxLista1.getValor());
                lista1.retirar(); 
                auxLista1 = auxLista1.getProx();
            }
            if (auxLista2 != null) {
                inserir(auxLista2.getValor());
                lista2.retirar();
                auxLista2 = auxLista2.getProx();
            }
       } 
    }

    // imprimir a lista
    public void imprimir(){
        No aux;
        aux = inicio;
        if (vazia()) {
            System.out.println("lista vazia");
        }
        else{
            while (aux != null) {
                System.out.print(aux.getValor() + " ");
                aux = aux.getProx();
            }
        }
    }
}
