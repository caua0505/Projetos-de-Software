public class Main {
    public static void main(String[] args) {
         ContaCorrente contaCorrente = new ContaCorrente(1234 , "Cauã Tobias");

        contaCorrente.ExibirDados();
        System.out.println("-------------");

        contaCorrente.depositar(100000);
        contaCorrente.sacar(2500);

        System.out.println("--------------------");
        contaCorrente.ExibirDados();

    }
}