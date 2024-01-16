package br.com.fiap.main;

import java.sql.Connection;

import br.com.fiap.bean.Carro;
import br.com.fiap.dao.CarroDAO;
import br.com.fiap.dao.Conexao;

public class teste2 {
	public static void main(String[] args) {
		Connection con = Conexao.abrirConexao();
		
		Carro cb = new Carro();
		CarroDAO cd = new CarroDAO(con);
		
		//Testando método alterar
		cb.setPlaca("JKK1900");
		cb.setCor("Amarelo");
		cb.setDescricao("Carro 1");
		System.out.println(cd.alterar(cb));
		
		Conexao.fecharConexao(con);
	}
}
