package model;
public class Alternativa{
    private int id_alternativa;
    private int id_questao;
    private boolean is_Correto;
    private String conteudo;


    public Alternativa(){
        this.id_alternativa = -1;
        this.id_questao     = -1;
        this.is_Correto     = false;
        this.conteudo       = "";
    }

    public Alternativa(int id_alternativa, int id_questao, boolean is_Correto, String conteudo) {
        this.id_alternativa = id_alternativa;
        this.id_questao = id_questao;
        this.is_Correto = is_Correto;
        this.conteudo = conteudo;
    }

    public int getId_alternativa() {
        return id_alternativa;
    }
    public void setId_alternativa(int id_alternativa) {
        this.id_alternativa = id_alternativa;
    }
    public int getId_questao() {
        return id_questao;
    }
    public void setId_questao(int id_questao) {
        this.id_questao = id_questao;
    }
    public boolean getIs_Correto() {
        return is_Correto;
    }
    public void setIs_Correto(boolean is_Correto) {
        this.is_Correto = is_Correto;
    }
    public String get_Conteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString(){
        return "alternativa [idAlternativa=" + id_alternativa + ", idQuestao=" + id_questao + ", correto=" + is_Correto + ", conteudo=" + conteudo + "]";
    }
}
