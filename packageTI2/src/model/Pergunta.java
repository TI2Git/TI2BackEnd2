package model;
public class Pergunta{
	private int id_perg;
	private int id_usuario;
	private String data_postagem;
	private String titulo;
	private String conteudo;

	public Pergunta(){
        this.id_perg       = -1;
		this.id_usuario    = -1;
		this.data_postagem = "";
		this.titulo        = "";
		this.conteudo      = "";
	}

	public Pergunta(int id_perg, int id_usuario, String data_postagem, String titulo, String conteudo) {
		this.id_perg = id_perg;
		this.id_usuario = id_usuario;
		this.data_postagem = data_postagem;
		this.titulo = titulo;
		this.conteudo = conteudo;
	}

	public int getId_perg() {
		return id_perg;
	}
	public void setId_perg(int id_perg) {
		this.id_perg = id_perg;
	}
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getData_postagem() {
		return data_postagem;
	}
	public void setData_postagem(String data_postagem) {
		this.data_postagem = data_postagem;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	@Override
	public String toString(){
		return "pergunta [idPergunta=" + id_perg + ", idUsuario=" + ", data_postagem=" + data_postagem + ", titulo=" + titulo + ", conteudo=" + conteudo + "]";
	}
}



