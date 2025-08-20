public class ContaBancaria {
    protected int numero;
    protected String titular;
    protected double saldo;

    public ContaBancaria(int numero , String titular){
        this.numero  = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Depósito de R$" + valor + "realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor invalido");
        }
    }
    public void ExibirDados() {
            System.out.println("Número: " + numero);
            System.out.println("Titular: " + titular);
            System.out.println("Saldo R$: " + saldo);
        }
    }
