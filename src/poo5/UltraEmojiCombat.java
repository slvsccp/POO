package poo5;

/**
 *
 * @author matheus
 */
public class UltraEmojiCombat {
    public static void main(String[] args){
        Lutador l[] = new Lutador[3];
                
        l[0] = new Lutador("Matheus", "Brasil", 21, 1.75f, 
                           68.9f, 17, 2, 3);
        
        l[1] = new Lutador("Putscript", "França", 29, 1.67f,
                            57.8f, 12, 5, 2);
        l[2] = new Lutador("SnapShadow", "EUA", 35, 1.55f,
                            51.3f, 13, 3, 2);
        
        l[2].status();
    }
}
