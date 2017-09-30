
package mascota;

public class Mascota {

    public static void main(String[] args) {
        int prioridad = 22;
        String pref;
        
        pref = (prioridad<6)? "perro" : "gato";
        System.out.println("prefiere un " + pref);
    }
    
}
