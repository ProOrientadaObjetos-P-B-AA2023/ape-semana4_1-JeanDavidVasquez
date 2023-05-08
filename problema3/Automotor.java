class automotor1{
    private String cedula;
    private String marcaVehiculo;
    private int anoFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public automotor1(String cedula, String marcaVehiculo, int anoFabricacion, double valorVehiculo) {
        this.cedula = cedula;
        this.marcaVehiculo = marcaVehiculo;
        this.anoFabricacion = anoFabricacion;
        this.valorVehiculo = valorVehiculo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(int anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    public double getValorVehiculo() {
        return valorVehiculo;
    }

    public void setValorVehiculo(double valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }

    public void calcularValorMatricula(){
        this.valorMatricula= (this.valorVehiculo*0.00002)*(2023-anoFabricacion);
    }
    public double getValorMatricula(){
        return this.valorMatricula;
    }

    public String toString(){
        return String.format("AUTOMOTOR"+
                        "\nCedula: %s"+
                        "\nMarca del Vehiculo: %s"+
                        "\nAño de fabricacion: %d"+
                        "\nPrecio del vehiculo: %.2f"+
                        "\nValor de la matricula: %.2f",
                this.getCedula(),this.getMarcaVehiculo(),this.getAnoFabricacion(),this.getValorVehiculo(),this.getValorMatricula());
    }
}

public class Automotor {
    public static void main(String[] args) {
        automotor1 automotor= new automotor1("1105822231", "Chevrolet", 2001,20000);
        automotor.calcularValorMatricula();
        System.out.println(automotor);

    }
}
