package model;
public class Questao{
	private int    id_questao;
	private String neuro_div;
	private String habilidade;
	private String dificuldade;
	public int getId_questao() {
		return id_questao;
	}

	public void setId_questao(int id_questao) {
		this.id_questao = id_questao;
	}

	public String getNeuro_div() {
		return neuro_div;
	}

	public void setNeuro_div(String neuro_div) {
		this.neuro_div = neuro_div;
	}

	public String getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(String habilidade) {
		this.habilidade = habilidade;
	}

	public String getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(String dificuldade) {
		this.dificuldade = dificuldade;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	private String enunciado;

	public Questao(){
		this.id_questao  =-1;
		this.neuro_div   = "";
		this.habilidade  = "";
		this.dificuldade = "";
		this.enunciado   = "";
	}

	public Questao(int id_questao, String neuro_div, String habilidade, String dificuldade, String enunciado) {
		this.id_questao = id_questao;
		this.neuro_div = neuro_div;
		this.habilidade = habilidade;
		this.dificuldade = dificuldade;
		this.enunciado = enunciado;
	}

	@Override
	public String toString(){
        return "Questao [idQuestao=" + id_questao + ", neuroDivergencia=" + neuro_div + ", habilidade=" + habilidade + ", dificuldade=" + dificuldade + ", enunciado=" + enunciado + "]";
    }
}