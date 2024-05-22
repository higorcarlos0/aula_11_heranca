public class horista  extends empregado{
    private double horas;

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public horista(String nome, String endereço, Double salario, double horas) {
        super(nome, endereço, salario);
        this.horas = horas;
    }

    public horista(double horas) {
        this.horas = horas;
    }
    
    public void calculoSalario (){
        salario = horas * 50;
    }
}
