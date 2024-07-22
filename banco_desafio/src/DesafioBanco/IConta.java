package DesafioBanco;

public interface IConta {

	void depositar(double valor);
    void sacar(double valor);
    double getSaldo();
    void transferir(double valor, IConta contaDestino);
    void imprimirExtrato();
		
}
