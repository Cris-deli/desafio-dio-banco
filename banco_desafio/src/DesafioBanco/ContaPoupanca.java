package DesafioBanco;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(Cliente cliente, double taxaRendimento) {
        super(cliente);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        saldo += saldo * taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		
	}
}
