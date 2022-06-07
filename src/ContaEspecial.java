public class ContaEspecial extends Conta {
    private final String atendimento = "Com prioridade";
    private double limiteEspecial;

    public ContaEspecial(String titularConta, String numeroConta, String numeroAgencia, double saldo, double limiteEspecial) {
        super(titularConta, numeroConta, numeroAgencia, saldo);
        this.limiteEspecial = limiteEspecial;
    }

    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Essa conta tem um limite especial de: " + getLimiteEspecial());
        System.out.println("Essa conta tem atendimento do tipo: " + getAtendimento());
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
}
