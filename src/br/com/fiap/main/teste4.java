package br.com.fiap.main;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.fiap.bean.Carro;
import br.com.fiap.dao.CarroDAO;
import br.com.fiap.dao.Conexao;

public class Teste4 {
	public static void main(String[] args) {
		Connection con = Conexao.abrirConexao();
		
		CarroDAO cd = new CarroDAO(con);
		
		//Teste do método ListarTodos
		ArrayList<Carro> lista = cd.listarTodos();
		
		if(lista != null) {
			for (Carro carro : lista) {
				System.out.println("Placa: " + carro.getPlaca());
				System.out.println("Cor: " + carro.getCor());
				System.out.println("Descrição: " + carro.getDescricao());
			}
		}
		
		Conexao.fecharConexao(con);
	}
}
