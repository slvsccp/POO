package poo09;

public abstract class Animal {
    //Atributos de Animal
    protected float peso;
    protected int idade;
    protected int membros;
    //Métodos de Animal
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getPeso() {
        return peso;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    
    public void setMembros(int membros) {
        this.membros = membros;
    }
    public int getMembros() {
        return membros;
    }
}
