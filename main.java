package arboles;

import java.util.Scanner;

public class Arboles {
    public static void main(String[] args) {
    Procesos arbol =new Procesos();
     int elemento;
     int año;
     int opc2=0;
     int opc;
     Scanner LECTOR = new Scanner(System.in);
     
            Nodo nodoActual1=new Nodo("Ana", 1997);
            Nodo nodoActual2=new Nodo("Joseline",2003);
            Nodo nodoActual3=new Nodo("Ramiro",2001);            
            Nodo nodoActual4=new Nodo("Lalo",2002);
            Nodo nodoActual5=new Nodo("Alicia",2009);
            Nodo nodoActual6=new Nodo("Cesar",2005);
            Nodo nodoActual7=new Nodo("Roberto",1982);
            Nodo nodoActual8=new Nodo("Fernando",1981);
            Nodo nodoActual9=new Nodo("Carmen",1970);
            Nodo nodoActual10=new Nodo("Cristal",1993);
            Nodo nodoActual11=new Nodo("Gustavo",1986);
            Nodo nodoActual12=new Nodo("Martha",1990);

            arbol.insertar(nodoActual1);
            arbol.insertar(nodoActual2);
            arbol.insertar(nodoActual3);
            arbol.insertar(nodoActual4);
            arbol.insertar(nodoActual5);
            arbol.insertar(nodoActual6);
            arbol.insertar(nodoActual7);
            arbol.insertar(nodoActual8);
            arbol.insertar(nodoActual9);
            arbol.insertar(nodoActual10);
            arbol.insertar(nodoActual11);
            arbol.insertar(nodoActual12); 
            System.out.println("Datos insertados");
            
       do{ 
        System.out.println("\n-------Menu------");
        System.out.println("1. ¿Quien es la persona mas pequeña y que edad tiene?");
        System.out.println("2. ¿Quien es la persona mas grande y que edad tiene?");
        System.out.println("3. ¿Cuantos años de diferencia tiene la persona mas grande y la persona mas chica?");
        System.out.println("4. ¿Cuantos participantes hay?");
        System.out.println("5.¿Cuanto es la suma de las edades de los participantes");
        System.out.println("6. ¿Cual es el promedio de edad de los participantes?");
        System.out.println("7. Altura");
        System.out.println("8. Recorido Pre-orden");
        System.out.println("9. Recorido In-Orden");
        System.out.println("10. Recorido Pos-orden");
        System.out.println("11. Salir del programa");
        System.out.println("¿Que desea realizar?");
        opc=LECTOR.nextInt();
        switch(opc){  
            case 1:   
            System.out.println("Edad menor: "+arbol.menor(arbol.nodoRaiz)+" Participante: "+arbol.menor.nombre);
            break;
            
            case 2:
             System.out.println("Edad mayor: "+arbol.mayor(arbol.nodoRaiz)+" Participante: "+arbol.mayor.nombre);
            break;
            
            case 3:
            System.out.println("Diferencia entre la persona mayor y la menor: ");
            int mayor=arbol.mayor(arbol.nodoRaiz);
            int menor=arbol.menor(arbol.nodoRaiz);
            System.out.print(arbol.diferencia(mayor,menor));
            break;
            
            case 4:
            System.out.println("Cantidad de participantes: "+arbol.cantidad);
            break;
            
            case 5:
            System.out.println("Suma: "+arbol.suma(arbol.nodoRaiz));
            arbol.suma=0;
            break;
  
            case 6:
            float suma=arbol.suma(arbol.nodoRaiz);
            System.out.println("Promedio de la edades: "+arbol.promedio(suma));
            arbol.suma=0;
            break;
            
            case 7:
            System.out.println("Altura: "+ arbol.altura(arbol.nodoRaiz,1));
            break;
            
            case 8:
            arbol.Preorden(arbol.nodoRaiz);
            break;
            case 9:
            arbol.inOrden(arbol.nodoRaiz);
            break;
            case 10:
            arbol.PosOrden(arbol.nodoRaiz);
            break;
            default:System.out.println("No existe esa opcion, por favor intente de nuevo");
        }
       }while(opc2!=11);
    }
    
}
