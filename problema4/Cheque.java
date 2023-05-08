class Cheque1 {
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;

    public Cheque1(String nombreCliente, double valorCheque,String nombreBanco) {
        this.nombreCliente = nombreCliente;
        this.nombreBanco= nombreBanco;
        this.valorCheque = valorCheque;

    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setNombreBanco(String nombreBanco){
        this.nombreBanco=nombreBanco;
    }
    public String getNombreBanco(){
        return nombreBanco;
    }

    public double getValorCheque() {
        return valorCheque;
    }

    public void setValorCheque(double valorCheque) {
        this.valorCheque = valorCheque;
    }
    public void calcularComisionBanco() {
        this.comisionBanco = 0.00003 * this.getValorCheque();
    }

    public double getComisionBanco() {
        return comisionBanco;
    }

    public String toString() {
        return String.format("DATOS"+
                        "\nNombre Banco: %s"+
                        "\nCliente: %s"+
                        "\nValor del Cheque: %.2f"+
                        "\nComision del Banco: %.2f",
                this.getNombreBanco(),this.nombreCliente,this.getValorCheque(),this.getComisionBanco());
    }
}
public class Cheque {
    public static void main(String[] args) {
        Cheque1 cheque=new Cheque1("JEAN",236,"Pichincha");
        cheque.calcularComisionBanco();
        System.out.print(cheque);
    }
}