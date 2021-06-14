package poo09;

public class Peixe extends Animal {
    private String corEscama;
    
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo Substâncias");
    }
    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
    public void soltarBolha() {
        System.out.println("Soltou Bolha...");
    }
    
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    public String getCorEscama() {
        return corEscama;
    }
}
