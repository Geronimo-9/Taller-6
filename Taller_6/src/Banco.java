public class Banco {
    private double saldo;

   public Banco(double saldo) {
        setSaldo(saldo);
    }

    private double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

 protected void datos(){
     System.out.println(saldo);


     /* Este tipo de encapsulamiento protected no es lo adecuado en este caso para manejar las
     finanzas del usuario final debido a que sus datos sensibles quedan expuesto a ser accedido
     y obtener la infromacion del saldo, comprometiendo la seguridad de cada uno.

     Para estos casos, lo mas recomendable es aplicar un encapsulameinto private
     para que el acceso sea unicamente por el usuario.
      */





 }






}
