package domain;

public class User {
    private String nome;
    private String number;
    private String senha;


    public User( String nome,String number , String senha)
    {
        this.nome  = nome;
        this.number = number;
        this.senha = senha;
    }


    public String getNome() {
        return this.nome;
    }
    
    public String getNumber() {
        return this.number;
    }

    public String getSenha() {
        return this.senha;
    }
}