public class App {
    public static void main(String[] args) throws Exception {
        mensalista mensa1, mensa2 ;
        horista hora1, hora2;
 

       
        // Empregados mensalistas
        mensa1 = new mensalista ("higor", "rua 2", 2500.0, "junior");
        mensa1.calcularSalario ();
        mensa1.calcINSS ();
        mensa1.imprimir ();
        
        System.out.println ("Cargo: " + mensa1.getCargo());
 
 
        mensa2 = new mensalista ("lais", "rua 3", 3100.0, "senior");
        mensa2.calcularSalario();
        mensa2.calcINSS();
        mensa2.imprimir ();
        System.out.println ("Cargo: " + mensa2.getCargo());
 
 
        //Ehorista exemplo 1
        hora1 = new horista ("maria", "rua 3", 0.0, 100, 20);
        hora1.calculoSalario();
        hora1.imprimir ();
        System.out.println ("Horas trabalhadas: " + hora1.getHoras());
 
        //horista exemplo 2   
        hora2 = new horista ("Higor", "Rua 10", 0.0, 160, 35);
        hora2.calculoSalario();
        hora2.imprimir ();
        System.out.println ("Horas trabalhadas: " + hora1.getHoras());
 
        }
    }
    
