package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.bean.Carro;

public class CarroDAO {
	private Connection con;

	public CarroDAO(Connection con) {
		this.con = con;
	}
	
	public Connection getCon() {
		return con;
	}
	
	public void setCon(Connection con) {
		this.con = con;
	}
	
	public String inserir(Carro carro) {
		String sql = "insert into carro(placa,cor,descricao)values(?,?,?)";
		
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, carro.getPlaca());
			ps.setString(2, carro.getCor());
			ps.setString(3, carro.getDescricao());
			
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso";
			} else {
				return "Erro ao inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	public String alterar(Carro carro) {
		String sql = "update carro set cor = ?,descricao = ?";
		sql += " where placa = ?";
		
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, carro.getCor());
			ps.setString(2, carro.getDescricao());
			ps.setString(3, carro.getPlaca());
			
			if(ps.executeUpdate() > 0) {
				return "Alterado com sucesso";
			} else {
				return "Erro ao alterar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	public String excluir(Carro carro) {
		String sql = "delete from carro where placa = ?";
		
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, carro.getPlaca());
			
			if(ps.executeUpdate() > 0) {
				return "Excluído com sucesso";
			} else {
				return "Erro ao alterar";
			}
			
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	public ArrayList<Carro> listarTodos() {
		String sql = "select * from carro ";
		ArrayList<Carro> listaCarro = new ArrayList<Carro>();
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			if(rs != null) {
				while (rs.next()) {
					Carro cb = new Carro();
					cb.setPlaca(rs.getString(1));
					cb.setCor(rs.getString(2));
					cb.setDescricao(rs.getString(3));
					listaCarro.add(cb);
				}
				return listaCarro;
			} else {
				return null;
			}
		} catch (SQLException e) {
			return null;
		}
	}
}
