package DesafioBanco;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Cliente> clientes;
	private List<Conta> contas;
	
	public Banco(String nome) {
		this.nome = nome;
		this.clientes = new ArrayList<>();
		this.contas = new ArrayList<>();
	}
	
	public void adicionarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}
		
	public List<Conta> getContas() {
		return contas;
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}
	
	public String getNome() {
		return nome;
	}

}
