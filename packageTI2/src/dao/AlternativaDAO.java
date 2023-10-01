package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.Alternativa;

public class AlternativaDAO extends DAO {

	public AlternativaDAO() {
		super();
		conectar();
	}

	public void finalize() {
		close();
	}

	public boolean insert(Alternativa alternativa) {
		boolean status = false;
		try {
			// executar scripts sql no banco de dados
			Statement st = conexao.createStatement(); // conexao ao db feito pela dao
			String sql = "INSERT INTO BancoTI2.alternativas (idalternativas, idQuestao, conteudo, iscorreta) "
					+ "VALUES (" + alternativa.getId_alternativa()
					+ "','" + alternativa.getId_questao() + "','" + alternativa.get_Conteudo() + "','"
					+ alternativa.getIs_Correto() + "');";
			// string sql criou o script para insercao
			System.out.println(sql); // imprime o script
			st.executeUpdate(sql); // a instrucao e executada no db
			st.close();
			status = true; /// se nao lancar excecoes status e verdadeiro
		} catch (SQLEXception u) {
			throw new RuntimeException(u); // se acontecer SQLException, sera convertida para RE, que encerrara o
											// programa
		}
		return status;
	}

	public Alternativa get(int idAlternativa) { // seleciona a alternativa pelo id
		Alternativa alternativa = null;

		try {
			Statement st = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			String sql = "SELECT * FROM BancoTI2.alternativas WHERE id=" + idAlternativa;
			System.out.println(sql);
			ResultSet rs = st.executeQuery(sql);
			if (rs.next()) {
				alternativa = new Alternativa(rs.getInt("id_alternativa"), rs.getInt("id_questao"),
						rs.getBoolean("is_Correto"), rs.getString("conteudo"));
			}
			st.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return usuario;
	}

	// ------------------//------------------//
	public List<Alternativa> get() {
		return get("");
	}

	public List<Alternativa> getOrderByIdAlternativas() {
		return get("id_alternativa");
	}

	public List<Alternativa> getOrderByIdQuestao() {
		return get("id_questao");
	}

	public List<Alternativa> getOrderByIsCorreto() {
		return get("is_Correto");
	}

	public List<Alternativa> getOrderByConteudo() {
		return get("conteudo");
	}

	// -----------------//-----------------//

	private List<ALternativa> get(String orderBy) { // retorna uma lista com objetos Alternativa relativo as linhas do
													// banco de dados
		List<Alternativa> alternativas = new ArrayList<Alternativa>();

		try {
			Statement st = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			String sql = "SELECT * FROM BancoTI2.alternativas"
					+ ((orderBy.trim().length() == 0) ? "" : (" ORDER BY " + orderBy));
			System.out.println(sql);
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Alternativa u = new Alternativa(rs.getInt("id_alternativa"), rs.getInt("id_questao"),
						rs.getBoolean("is_Correto"), rs.getString("conteudo"));
				usuarios.add(u);
			}
			st.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return alternativas;
	}

	// LIST GETSEXO MASCULINO NA USUARIO, NAO COLOCADO

	public boolean update(Alternativa alternativa) { // fazer um update no conteudo na Alternativa
		boolean status = false;
		try {
			Statement st = conexao.createStatement();
			String sql = "UPDATE alternativas SET conteudo = '" + alternativa.get_Conteudo() + "'"
					+ " WHERE id_alternativa = " + alternativa.getId_alternativa();
			System.out.println(sql);
			st.executeUpdate(sql);
			st.close();
			status = true;
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
		return status;
	}

	public boolean delete(int idAlt) { // insere o script sql que deleta a alternativa pelo id
		boolean status = false;
		try {
			Statement st = conexao.createStatement();
			String sql = "DELETE FROM alternativas WHERE id_alternativa = " + idAlt;
			System.out.println(sql);
			st.executeUpdate(sql);
			st.close();
			status = true;
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
		return status;
	}

	public boolean autenticar(String login, String senha) { // autenticar, "selecionar" alternativa pelo id
		boolean resp = false;

		try {
			Statement st = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			String sql = "SELECT * FROM alternativas WHERE id_alternativa LIKE '" + id_alternativa + "'";
			System.out.println(sql);
			ResultSet rs = st.executeQuery(sql);
			resp = rs.next();
			st.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return resp;
	}
}
