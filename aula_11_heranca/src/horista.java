public class horista  extends empregado{
    private double horas;
    private double vl_horas;

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public horista(String nome, String endereço, Double salario, double horas, double vl_horas) {
        super(nome, endereço, salario);
        this.horas = horas;
        this.vl_horas = vl_horas;
    }

    public horista(double horas) {
        this.horas = horas;
    }
    
    public void calculoSalario (){
        salario = horas * vl_horas;
    }
}
