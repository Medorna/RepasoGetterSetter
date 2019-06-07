package repasogettersetter;
//breve repaso sobre Getters, Setters y Sobrescritura de metodos.

public class RepasoGetterSetter {

    public static void main(String[] args) {
        // TODO code application logic here
        Coche autito = new Coche();
        
        autito.escribirPatente("k54320");
        autito.escribirColor("Azul");
        
        System.out.println(autito.toString());
    }
}
