
package clases;


public class Estatica {
    //ATRIBUTOS
    public static Obrero o = new Obrero();
    public static Confianza c = new Confianza();
    public static Departamento d = new Departamento();
    public static Seccion s = new Seccion();

    //METODOS GET Y SET
    public static Obrero getO() {
        return o;
    }

    public static void setO(Obrero o) {
        Estatica.o = o;
    }

    public static Confianza getC() {
        return c;
    }

    public static void setC(Confianza c) {
        Estatica.c = c;
    }

    public static Departamento getD() {
        return d;
    }

    public static void setD(Departamento d) {
        Estatica.d = d;
    }

    public static Seccion getS() {
        return s;
    }

    public static void setS(Seccion s) {
        Estatica.s = s;
    }
    
        
    
}
