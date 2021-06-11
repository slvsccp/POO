package poo08;

public class Principal {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        Professor p1 = new Professor();
        
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        
        a1.setNome("Claudio");
        a1.setMatricula(1143);
        a1.setCurso("Informática");
        a1.setIdade(14);
        a1.setSexo("M");
        a1.pagarMensalidade();
        /*
        b1.setMatricula(2444);
        b1.setNome("Juriscleide");
        b1.setBolsa(75.5f);
        b1.setIdade(34);
        b1.setSexo("F");
        b1.pagarMensalidade();
        */
        
        p1.setNome("Roberto");
        p1.setEspecialidade("RH");
        p1.setIdade(56);
        p1.setSexo("M");
        p1.setSalario(6800f);
        
        System.out.println(v1.toString());
        System.out.println(a1.toString());
        //System.out.println(b1.toString());
        System.out.println(p1.toString());
    }
}
