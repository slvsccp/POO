package poo05;

/**
 *
 * @author matheus
 */
public class UltraEmojiCombat {
    public static void main(String[] args){
        Lutador l[] = new Lutador[6];
                
        l[0] = new Lutador("Matheus", "Brasil", 21, 1.75f, 
                           68.9f, 17, 2, 3);
        l[1] = new Lutador("Putscript", "França", 29, 1.67f,
                            57.8f, 12, 5, 2);
        l[2] = new Lutador("SnapShadow", "EUA", 35, 1.55f,
                            51.3f, 13, 3, 2);
        l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f,
                            81.6f, 28, 12, 5);
        l[4] = new Lutador("Uf0Cobol", "Brasil", 37, 1.70f,
                            119.3f, 5, 3, 2);
        l[5] = new Lutador("Nerdaart", "EUA", 30, 1.82f,
                            105.6f, 14, 2, 4);
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[5], l[4]);
        UEC01.lutar();
        l[5].status();
        l[4].status();
        
    }
}
