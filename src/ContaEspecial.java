public class ContaEspecial extends Conta {
    private final String atendimento = "Com prioridade";
    private double limiteEspecial;
    private double saldoLimite;

    public ContaEspecial(String titularConta, String numeroConta, String numeroAgencia, double saldo, double limiteEspecial) {
        super(titularConta, numeroConta, numeroAgencia, saldo);
        this.limiteEspecial = limiteEspecial;
    }

    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Essa conta tem um limite especial de: " + getLimiteEspecial());
        System.out.println("Essa conta tem atendimento do tipo: " + getAtendimento());
    }

    @Override
    public void sacar(double valor){
        System.out.println("---------" + this.getTitularConta() + "----------");
        if(valor > this.getSaldo()) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque efetuado com sucesso!");
            System.out.println("Seu novo saldo é de : " + this.getSaldo());
        }else if((this.getSaldo() + this.getSaldoLimite()) >= valor) {
            System.out.println("Seu saldo é insuficiente, você usará o seu limite especial");
            this.setSaldoLimite(this.getSaldoLimite() - (valor - this.getSaldo()));
            this.setSaldo(this.getSaldo() - valor);

            System.out.println("Depósito efetuado com sucesso. Seu novo saldo é de: " + this.getSaldo());
            System.out.println("Seu novo saldo do limite é: " + this.getSaldoLimite());

        }else{
            System.out.println("Saldo insuficiente para o saque");
        }
    }

    @Override
    public void depositar(double valor){
        System.out.println("-------" + this.getTitularConta() + "-----------");
        if (this.getSaldo() >= 0) {
            this.setSaldo(this.getSaldo() + valor);
        }else {
            valor = valor - (this.getLimiteEspecial() - this.getSaldoLimite());
            if(valor >= 0){
                this.setSaldoLimite(this.getSaldoLimite() + valor);
                this.setSaldo(this.getSaldo() + valor);}
            else{
                valor *=-1;
                this.setSaldoLimite(this.getSaldoLimite() + valor);
                this.setSaldo(this.getSaldo() + valor);}
            }

        }

    public String getAtendimento() {
        return atendimento;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public double getSaldoLimite() {
        return saldoLimite;
    }

    public void setSaldoLimite(double saldoLimite) {
        this.saldoLimite = saldoLimite;
    }
}
