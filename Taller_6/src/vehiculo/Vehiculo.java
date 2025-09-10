package vehiculo;

public class Vehiculo {
   protected String tipo;
   protected String marca;






}

class Moto extends Vehiculo{
    protected String cilindrada;

    public Moto(String tipo, String marca, String cilindrada){
        this.tipo = tipo;
        this.marca = marca;
        this.cilindrada = cilindrada;
    }

    void mostrarDetalles(){
        System.out.println(" Tipo:"+tipo+" Marca: "+marca+" Cilindraje: "+cilindrada+" ");
    }

}