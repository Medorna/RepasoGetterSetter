package repasogettersetter;

//Clase coche
public class Coche {
    //private = encapsulacion 
    private int ruedas, puertas, peso, altura, ancho;
    private String color, marca, patente;

    //Metodo constructor, estado inicial de objeto
    public Coche(){
        
        ruedas = 4;
        puertas = 4;
        peso = 4000;
    }
    //Metodo Getter    
    public int obtenerRuedas(){
        return ruedas;
    }
    //Metodo Setter
    public void escribirPatente(String patente){
       this.patente = patente;
    }
    
    public String obtenerPatente(){
        return "la patente es: "+patente;
    }
    //Metodo setter entre () escribo el parametro
    public void escribirColor(String color){
        this.color = color;
    }
    //metodo getter
    public String obtenerColor(){
        return "El color del coche es: "+color; 
    }
    //sobrescritura de metodo overriding
    @Override
    public String toString(){
        return "El coche tiene "+ruedas+" ruedas y es de color: "+color;
    }
}