package model;

public class Usuario {
    private int senha;
    private int id_usuario;
    private String email;
    private String username;

    public Usuario(){
        this.senha      = -1;
        this.id_usuario = -1;
        this.email      = "";
        this.username   = "";
    }

    public Usuario(int senha, int id_usuario, String email, String username) {
        this.senha = senha;
        this.id_usuario = id_usuario;
        this.email = email;
        this.username = username;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString(){
        return "usuario [email=" + email + ", senha=" + senha + ", idUsuario=" + id_usuario + ", username=" + username + "]";
    }
}
