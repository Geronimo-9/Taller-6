// import vehiculo.Moto;

public class Main{
    public static void main(String[] args) {


// Ejercicio 1 Taller 6, Clase Empleado y Clase heredado Gerente con sobrescritura del metodo.
        Gerente g1 = new Gerente("Gregorio",-1100,"Software");
        g1.mostrarInformacion();


// Ejercicio 2 Taller 6, Error encontrado en intentar acceder a la subclase del paquete vehiculo

        /*
    Moto m1 = new Moto("Naked","Yamaha","689cc"); //No es posible acceder porque no estamos dentro del paquete origen.
    m1.mostrarDetalles();*/


        // Ejercicio 3 Taller 6, Mala práctica en el uso de protected para proyectos críticos y solucion al caso.
Banco Bancolombia = new Banco(3339);
Bancolombia.datos();



        }
    }
