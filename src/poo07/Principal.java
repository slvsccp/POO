package poo07;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Matheus");
        p1.setIdade(21);
        p1.setSexo("M");
        
        p2.setNome("Maria");
        p2.setCurso("Informática");
        p2.setIdade(18);
        
        p3.setNome("Cláudio");
        p3.setSalario(4000.76f);
        p3.receberAumento(690.89f);
        
        p4.setNome("Fabiana");
        p4.setSetor("Almoxarifado");
        p4.setSexo("F");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
