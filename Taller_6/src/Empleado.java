public class Empleado{

    protected String nombre;
    protected double salario;


    public Empleado(String nombre, double salario){
        this.nombre = nombre;
        setSalario(salario);
    }


    public String getNombre(){
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0){
            this.salario = salario;
        }
    }

    void mostrarInformacion(){
        System.out.println(" Nombre:"+nombre+" Salario: "+salario+" ");
    }
}


 class Gerente extends Empleado{

 protected String departamento;



 public Gerente(String nombre,double salario, String departamento){
     super(nombre, salario);
     this.departamento = departamento;
 }


 void mostrarInformacion(){
     System.out.println(" Nombre:"+nombre+" Salario: "+salario+" Departamento: "+departamento+" ");
 }


}
