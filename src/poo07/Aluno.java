package poo07;

public class Aluno extends Pessoa {
    private int mat;
    private String curso;
    
    public void cancelarMatr() {
        System.out.println("Matrícula será cancelada");
    }
    
    public void setMat(int mat) {
        this.mat = mat;
    }
    public int getMat() {
        return mat;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getCurso() {
        return curso;
    }
}
