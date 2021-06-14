package poo09;

public class Principal {
    public static void main(String[] args){
        //Animal n1 = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();
        
        /*
        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.setMembros(4);
        m.locomover();
        m.emitirSom();
        */
        
        
        c.locomover();
        c.emitirSom();
        
        k.locomover();
        k.emitirSom();
    }
}







