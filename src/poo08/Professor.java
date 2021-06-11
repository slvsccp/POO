package poo08;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    
    public void receberAumento(float aumentoPercentual) {
        this.setSalario(this.getSalario() + (aumentoPercentual/100)* this.getSalario());
    }
    
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public float getSalario() {
        return salario;
    }
}
