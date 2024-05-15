public class mensalista extends empregado {
    public String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    //construtor
    public mensalista(String nome, String endereço, Double salario, String cargo){
        super(nome, endereço,salario);
        this.cargo = cargo;
    }

    public void calcularSalario(){
        if (cargo.equals( "Junior")){
            salario = 2500.00;
        }else if (cargo.equals("Pleno")){
            salario = 3500.00;
        }else {
            salario = 5500.00;
        }
    }
}
