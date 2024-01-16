package br.com.fiap.main;

import java.sql.Connection;

import br.com.fiap.bean.Carro;
import br.com.fiap.dao.CarroDAO;
import br.com.fiap.dao.Conexao;

public class Teste3 {
	public static void main(String[] args) {
		Connection con = Conexao.abrirConexao();
		
		Carro cb = new Carro();
		CarroDAO cd = new CarroDAO(con);
		
		//Teste do método excluir
		cb.setPlaca("JKK1900");
		System.out.println(cd.excluir(cb));
		
		Conexao.fecharConexao(con);
	}
}
