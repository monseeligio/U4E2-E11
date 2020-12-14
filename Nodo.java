package arboles;

public class Nodo {
    String nombre;
    int añoN;
    Nodo izquierdo;
    Nodo derecho;
    int edad;
    public  Nodo (String nombre, int añoNaci){
        this.nombre=nombre;
        this.izquierdo=null; 
        this.derecho=null;
        this.añoN=añoNaci;
        this.edad=0;
        
} 
}
