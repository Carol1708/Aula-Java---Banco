public abstract class Conta { // abstract diz q essa conta nao pode ser instaciada

    private String titularConta;
    private String numeroConta;
    private String numeroAgencia;
    private double saldo;

    public Conta(String titularConta, String numeroConta, String numeroAgencia, double saldo){
        this.titularConta = titularConta;
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.saldo = saldo;
    }

    public void depositar(double valor) {      // 3 passo - criando os metodos

    }
    public void sacar(double valor) {         // 3 passo - outro metodo

    }
    public void mostrarDados() {             // 3 passo - outro metodo
        System.out.println("_______________");
        System.out.println("O titular da conta é: " + getTitularConta());
        System.out.println("O número da conta é: " + getNumeroConta());
        System.out.println("O número da agencia é: " + getNumeroAgencia());
        System.out.println("O saldo da conta é de:" + getSaldo());
    }



    public String getTitularConta() { // 2 passo - criando os get e seters
        return titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
