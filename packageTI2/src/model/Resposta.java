package model;
public class Resposta {
    private int id_resp;
    private int id_usuario;
    private int id_pergunta;
    private String pergunta;
    private String data_postagem;

    public Resposta() {
        this.id_resp = -1;
        this.id_usuario = -1;
        this.id_pergunta = -1;
        this.pergunta = "";
        this.data_postagem = "";
    }

    public Resposta(int id_resp, int id_usuario, int id_pergunta, String pergunta, String data_postagem) {
        this.id_resp = id_resp;
        this.id_usuario = id_usuario;
        this.id_pergunta = id_pergunta;
        this.pergunta = pergunta;
        this.data_postagem = data_postagem;
    }

    public int getId_resp() {
        return id_resp;
    }

    public void setId_resp(int id_resp) {
        this.id_resp = id_resp;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_pergunta() {
        return id_pergunta;
    }

    public void setId_pergunta(int id_pergunta) {
        this.id_pergunta = id_pergunta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getData_postagem() {
        return data_postagem;
    }

    public void setData_postagem(String data_postagem) {
        this.data_postagem = data_postagem;
    }

    @Override
    public String toString(){
        return "Resposta [idResposta=" + id_resp + ", idUsuario=" + id_usuario + ", idPergunta=" + id_pergunta + ", pergunta=" + pergunta + ", data_postagem=" + data_postagem + "]";
    }
}