package DesafioBanco;

public class Main {
    public static void main(String[] args) {
    	  Banco banco = new Banco("Power Bank");

          Cliente cliente1 = new Cliente("Cristina Andrade", "123.456.789-00");
          Cliente cliente2 = new Cliente("Carla Santos", "987.654.321-00");

          Conta contaCorrente1 = new ContaCorrente(cliente1, 1000, 10);
          Conta contaPoupanca1 = new ContaPoupanca(cliente1, 10.25);

          Conta contaCorrente2 = new ContaCorrente(cliente2, 500, 10);

          banco.adicionarCliente(cliente1);
          banco.adicionarCliente(cliente2);

          banco.adicionarConta(contaCorrente1);
          banco.adicionarConta(contaPoupanca1);
          banco.adicionarConta(contaCorrente2);

          contaCorrente1.depositar(500);
          contaCorrente1.sacar(100);
          contaCorrente1.transferir(200, contaPoupanca1);
          contaCorrente1.imprimirExtrato();
          contaCorrente2.imprimirExtrato();

          contaCorrente1.cobrarTaxaManutencao();
          contaPoupanca1.aplicarRendimento();

          System.out.println("Saldo Conta Corrente 1: " + contaCorrente1.getSaldo());
          System.out.println("Saldo Conta Corrente 2: " + contaCorrente2.getSaldo());
          

          System.out.println("Clientes cadastrados no banco: ");
          for (Cliente cliente : banco.getClientes()) {
              System.out.println(cliente.getNome() + " - " + cliente.getCpf());
          }
      }
}

	
