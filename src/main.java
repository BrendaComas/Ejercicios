public class main {

    public static void main(String[] args){
        //Segunda parte
        Coche miCoche=new Coche();
        miCoche.agregarPuerta();
        miCoche.mostrarPuerta();

        //Primera parte
        int num1 = 5;
        int num2 = 10;
        int num3 =15 ;


        var valor= suma(num1, num2, num3);

        System.out.println(valor);
    }
    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}

