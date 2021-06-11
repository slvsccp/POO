package poo08;

public class Tecnico extends Pessoa {
    private int registro;
    
    public void praticar() {
        System.out.println("Praticando...\n Prática concluída com sucesso!");
    }
    
    public void setRegistro(int registro) {
        this.registro = registro;
    }
    public int getRegistro() {
        return registro;
    }
}
