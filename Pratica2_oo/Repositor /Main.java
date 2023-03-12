public class Main {
    public static void main(String[] args) {
        Estoque produto = new Estoque("Caneta", 2, 5);
        System.out.println(produto.mostra());
        System.out.println("\n");

        produto.darBaixa(2);
        System.out.println(produto.mostra());
        if (produto.precisaRepor()) {
            System.out.println("Produto precisa ser reposto.");
        }
        else {
            System.out.println("Produto não precisa ser reposto.");
        }
        System.out.println("\n");

        produto.darBaixa(10);
        System.out.println(produto.mostra());
        if (produto.precisaRepor()) {
            System.out.println("Produto precisa ser reposto.");
        }
        else {
            System.out.println("Produto não precisa ser reposto.");
        }
    }
}
