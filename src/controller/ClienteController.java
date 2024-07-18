package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import model.Cliente;

public class ClienteController {
	List<Cliente> listaClientes;
	
	public ClienteController() {
		this.listaClientes = new ArrayList<>();
	}
	
	public Cliente criarCliente(String nome) {
		Cliente cliente = new Cliente(nome);
		listaClientes.add(cliente);
		System.out.println(listaClientes.get(listaClientes.size()-1) + " cadastrado(a)");
		return cliente;
	}
	
	public void listarClientes() {
		if (this.listaClientes.isEmpty()) {
			System.out.println("Nao existe clientes cadastrados");
		} else {
			for (Cliente cliente : this.listaClientes) {
				System.out.println("Nome cliente: " + cliente.getNome());
			}
		}
		
	}
	
	public void removerCliente(String nome) {
		try {
			if(this.listaClientes.isEmpty()) {
				System.out.println("Nao existe cliente cadastrado");
			}
			
			Iterator<Cliente> existeCliente = this.listaClientes.iterator();
			
			Cliente cliente = null;
			while(existeCliente.hasNext()) {
				cliente = existeCliente.next();
				
				if(cliente.getNome().equalsIgnoreCase(nome)) {
					existeCliente.remove();
				} else {
					System.out.println("Cliente nao encontrado");
				}
			}
			
		} catch (Exception e) {
			System.out.println("Erro ao remover cliente");
		}
	}
}
