package poo11;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistindo;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistindo = 0;
    }
    
    
    
    public void setLogin(String login) {
        this.login = login;
    }
    public String getLogin() {
        return login;
    }
    
    public void setTotAssistindo(int totAssintindo) {
        this.totAssistindo = totAssintindo;
    }
    public int getTotAssistindo() {
        return totAssistindo;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "\nlogin=" + login + ", totAssintindo=" + totAssistindo + '}';
    }
    
    
}
