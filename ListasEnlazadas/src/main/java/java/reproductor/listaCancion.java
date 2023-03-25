package java.reproductor;

import java.util.Scanner;

public class listaCancion {
    public NodoMusic primero;

    public listaCancion(){
        primero=null;
    }

    private Cancion leercancion(){

        System.out.println("Ingrese nombre");
        Cancion c= new Cancion();
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese nombre");
        c.nombrecancion=sc;
        System.out.println("Ingrese Ubicacion");
        c.ubicacion=sc;
        System.out.println("Ingrese nombre archivo");
        c.nombrearchivo=sc;

        //return Integer.parseInt(new Scanner(System.in).nextLine());
        return c;

    }

    public listaCancion CrearLista(){
         Cancion x;
        primero=null;
        do {
            x = leercancion();
            if (x!=null){
                primero=new NodoMusic(x,primero);
            }
        }while(x!=null);
        return this;
    }
}
