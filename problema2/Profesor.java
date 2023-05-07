class Profesor1{
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;

    public Profesor1(String nombre, String apellido, double sueldoBasico, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
        this.cedula = cedula;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void calcularSueldoTotal(){
        this.sueldoTotal=sueldoBasico+(this.sueldoBasico*0.20);
    }
    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


    public String toString(){
        return String.format("DATOS"+
                "\nNombre: %s"+
                "\nApellido: %s"+
                "\nSueldo Basico: %.2f"+
                "\nSueldo Total: %.2f"+
                "\nCedula: %s",this.nombre,this.apellido,this.sueldoBasico,this.sueldoTotal,this.cedula);
    }
}

public class Profesor {
    public static void main(String[] args) {
        Profesor1 profesor= new Profesor1("JEAN","VASQUEZ",100,"1105622231");
        profesor.calcularSueldoTotal();
        System.out.println(profesor);
    }
}
