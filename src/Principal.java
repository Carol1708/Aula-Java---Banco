public class Principal {

    public static void main(String[] args) { //criando o metodo main
//        Conta c1 = new Conta("Tatiana", "123456", "123x", 500)
//        Conta c2 = new Conta("Manuela","123457", "123X", 500);
//
//        c1.mostrarDados();
//        c2.mostrarDados();

        //comentou pois n precisa mais instaciar atrasvez do objeto, vai ser direto da conta corrente, pq é herença

      //  ContaCorrente c1 = new ContaCorrente("Tatiana", "123456", "123x", 500);
       // ContaCorrente c2 = new ContaCorrente("Manuela", "123457", "123x", 500);

       // c1.mostrarDados();
      //  c2.mostrarDados();

      //  c1.sacar(600);
     //   c2.sacar(200);

      //  c1.depositar(235.76);

      //  ContaEspecial ce1 = new ContaEspecial("Bárbara", "123458", "x123", 560, 1000);
      //  ce1.mostrarDados();
      //  ce1.sacar(300);
       // ce1.sacar(300);

     //   ce1.depositar(500);

        ContaCorrente cc1 = new ContaCorrente("Fernando", "12345", "123", 500);
        ContaPoupança cp1 = new ContaPoupança("Rafael", "12346", "123", 500);
        ContaEspecial ce1 = new ContaEspecial("Carolina", "123458", "123", 500, 500);

        cc1.sacar(250); //250tem q sobrar
        cp1.sacar(350);
        ce1.sacar(600); // tem q sobrar 400

        cc1.depositar(500); //750
        cp1.depositar(1000); // se ele tinha 150, agora vai ter 1150
        ce1.depositar(1000);


    }
}
