public class ContaCorrente extends Conta{

    private final String atendimento = "Sem prioridades";

    public ContaCorrente(String titularConta, String numeroConta, String numeroAgencia, double saldo) {
        super(titularConta, numeroConta, numeroAgencia, saldo);
    }

    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Essa conta tem atendimento do tipo: " + getAtendimento());
    }

    public String getAtendimento() {
        return atendimento;
    }

    public void sacar(double valor) {
        if (getSaldo() < valor) {
            System.out.println("Saldo insuficiente para saque");
        } else {
            setSaldo(getSaldo() - valor);
            // System.out.println(getTitularConta() + " , saque efetuado com sucesso. Seu novo saldo é: " + getSaldo());
            System.out.printf("%s%s%.2f%n", getTitularConta(),
                    " , saque efetuado com sucesso. Seu novo saldo é: ", getSaldo());
        }
    }
    public void depositar(double valor){
        if (valor > 0){
            setSaldo(getSaldo() + valor );
            System.out.printf("%s%s%.2f%n", getTitularConta()," , depósito efetuado com sucesso. Seu novo saldo é: ", getSaldo());
        }
    }
}
