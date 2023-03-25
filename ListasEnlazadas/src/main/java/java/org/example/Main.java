package java.org.example;

import Listas.Lista;

public class Main {
    public static void main(String[] args) {
        Lista l = new Lista();
        var respuesta = l.CrearLista();
        //System.out.println(respuesta);

        respuesta.visualizar();

    }
}