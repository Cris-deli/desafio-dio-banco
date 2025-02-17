package DesafioBanco;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;
    private double taxaManutencao;

    public ContaCorrente(Cliente cliente, double limiteChequeEspecial, double taxaManutencao) {
        super(cliente);
        this.limiteChequeEspecial = limiteChequeEspecial;
        this.taxaManutencao = taxaManutencao;
    }

    @Override
    public void sacar(double valor) {
        if (saldo + limiteChequeEspecial >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente, mesmo considerando o cheque especial!");
        }
    }

    public void cobrarTaxaManutencao() {
        if (saldo >= taxaManutencao) {
            saldo -= taxaManutencao;
        } else {
            System.out.println("Saldo insuficiente para cobrar a taxa de manutenção!");
        }
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public double getTaxaManutencao() {
        return taxaManutencao;
    }

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		
	}
}