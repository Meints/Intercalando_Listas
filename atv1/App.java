package atv1;
public class App {
    public static void main(String[] args) {
        //criação da Lista 1
        Lista lista1 = new Lista();

        //inserindo valores na lista 1
        lista1.inserir("10");
        lista1.inserir("8");
        lista1.inserir("6");
        lista1.inserir("4");
        lista1.inserir("2");

        // verifica tamanho
        System.out.println("tamanho lista 1: " + lista1.verificaTamanho()); 

        //criação da Lista 2
        Lista lista2 = new Lista();

        //inserindo valores na lista 2
        lista2.inserir("9");
        lista2.inserir("7");
        lista2.inserir("5");
        lista2.inserir("3");
        lista2.inserir("1");
        lista2.inserir("0");

        // verifica tamanho
        System.out.println("tamanho lista 2: " + lista2.verificaTamanho()); 


        // criação da Lista 3 / Intercalada
        Lista listaIntercalada = new Lista();
        listaIntercalada.intercalar(lista1, lista2, listaIntercalada.tamanhoTotal(lista2.verificaTamanho(), lista1.verificaTamanho()));

        // imprimindo a lista 3
        listaIntercalada.imprimir();

        
    }
}
