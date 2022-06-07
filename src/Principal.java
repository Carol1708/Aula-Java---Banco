public class Principal {

    public static void main(String[] args) { //criando o metodo main
//        Conta c1 = new Conta("Tatiana", "123456", "123x", 500)
//        Conta c2 = new Conta("Manuela","123457", "123X", 500);
//
//        c1.mostrarDados();
//        c2.mostrarDados();

        //comentou pois n precisa mais instaciar atrasvez do objeto, vai ser direto da conta corrente, pq é herença

        ContaCorrente c1 = new ContaCorrente("Tatiana", "123456", "123x", 500);
        ContaCorrente c2 = new ContaCorrente("Manuela", "123457", "123x", 500);

        c1.mostrarDados();
        c2.mostrarDados();

        c1.sacar(600);
        c2.sacar(200);

        c1.depositar(235.76);

        ContaEspecial ce1 = new ContaEspecial("Bárbara", "123458", "x123", 560,
                1000);
        ce1.mostrarDados();

    }
}
