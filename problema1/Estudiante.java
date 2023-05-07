class Estudiante1{
    private String nombreEstudiante;
    private double notaM1;
    private double notaM2;
    private double notaM3;
    private double promedio;

    public Estudiante1(String nombre, double nota1, double nota2, double nota3) {
        this.nombreEstudiante = nombre;
        this.notaM1 = nota1;
        this.notaM2 = nota2;
        this.notaM3 = nota3;
    }

    public String getNombre() {
        return nombreEstudiante;
    }

    public void setNombre(String nombre) {
        this.nombreEstudiante = nombre;
    }

    public double getNota1() {
        return notaM1;
    }

    public void setNota1(double nota1) {
        this.notaM1 = nota1;
    }

    public double getNota2() {
        return notaM2;
    }

    public void setNota2(double nota2) {
        this.notaM2 = nota2;
    }

    public double getNota3() {
        return notaM3;
    }

    public void setNota3(double nota3) {
        this.notaM3 = nota3;
    }

    public double getPromedio() {
        return promedio;
    }

    public void calcularPromedio(){
        this.promedio=(this.notaM1+this.notaM2+this.notaM3)/3;
    }

    public String toString(){
        return String.format("DATOS "+
                "\nNombre: %s"+
                "\nNota 1: %.2f"+
                "\nNota 2: %.2f"+
                "\nNota 3: %.2f"+
                "\nPromedio: %.2f",this.getNombre(),this.getNota1(),this.getNota2(),this.getNota3(),this.getPromedio());
    }
}

public class Estudiante {
    public static void main(String[] args) {
        Estudiante1 estudiante= new Estudiante1("JEAN",9,10,4);
        estudiante.calcularPromedio();
        System.out.println(estudiante);
    }

}
