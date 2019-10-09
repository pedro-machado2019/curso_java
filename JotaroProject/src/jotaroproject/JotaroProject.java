
package jotaroproject;

public class JotaroProject {

    public static void main(String[] args) {
        
        Character Radetra = new Character("Radetra", "F", "Humana", "Guerreira", 56, 4);
        
        Character Elon = new Character("Elon", "M", "Humano", "Bárbaro", 20, 5);
        
        Elon.atacar(Radetra, 18);
      
    }
    
}
