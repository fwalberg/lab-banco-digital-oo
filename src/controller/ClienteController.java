package controller;

import java.util.Iterator;

import app.Main;
import model.Cliente;

public class ClienteController {
	private Cliente clienteEncontrado;
	
	public Cliente criarCliente(String nome) {
		Cliente cliente = new Cliente(nome);
		Main.data.clientesCadastrados.add(cliente);
		System.out.println(Main.data.clientesCadastrados.get(Main.data.clientesCadastrados.size()-1) + " cadastrado(a)");
		return cliente;
	}
	
	public void listarClientes() {		
		if (Main.data.clientesCadastrados.isEmpty()) {
			System.out.println("Nenhum cliente cadastrado!");
		} else {
			System.out.println("====== LISTA DE CLIENTES CADASTRADOS ======");
			Main.data.clientesCadastrados
			.forEach(cliente -> System.out.println(cliente));
		}
	}
	
	public Boolean verificaSeExisteCliente(String nome) {
		Iterator<Cliente> existeCliente = Main.data.clientesCadastrados.iterator();
		Boolean hasClient = false;
		
		while(existeCliente.hasNext()) {
			Cliente cliente = existeCliente.next();
			
			if(cliente.getNome().equalsIgnoreCase(nome)) {
				this.clienteEncontrado = cliente;
				hasClient = true;
			}
		}
		
		return hasClient;
	}
	
	public void removerCliente(String nome) {
		try {
			Boolean hasClient = verificaSeExisteCliente(nome);
			if (hasClient) {
				Main.data.clientesCadastrados.remove(clienteEncontrado);
				System.out.println(String.format("Clente %s removido.", this.clienteEncontrado.getNome()));
				this.clienteEncontrado = null;
			}
			else {
				System.out.println("Cliente nao encontrado!");
			}
			
		} catch (Exception e) {
			System.out.println("Erro ao remover cliente");
		}
	}
}
