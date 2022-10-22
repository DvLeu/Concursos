import java.text.DecimalFormat;
import java.util.Scanner;

public class main {
    public static final double PI = 3.1416;
    public static void main(String[] args) {
        DecimalFormat dc = new DecimalFormat("#.00");
        double arear = 0;
        double areat = 0;
        double areac = 0;
        double areacir = 0;
        double sarea = 0;
        double sfinal = 0;

        double acumcuadra = 0;
        double acumrecta = 0;
        double acumcirc = 0;
        double acumtria = 0;



        int tfig = 0;
        int nfig;
        Scanner sc = new Scanner(System.in);

        nfig = sc.nextInt();

        for (int i = 0; i < nfig; i++){

            tfig = sc.nextInt();
            if(tfig == 1){

                double lado = sc.nextInt();
                areac = Math.pow(lado, 2);
                acumcuadra = areac + acumcuadra;
            }else if(tfig == 2){

                double base = sc.nextDouble();

                double altura = sc.nextDouble();
                areat = base * altura;
                acumrecta = areat + acumrecta;
            }else if(tfig == 3){

                double r = sc.nextDouble();
                //pi x r al 2
                areacir = PI * Math.pow(r,2);
                acumcirc = areacir + acumcirc;

            }else if(tfig == 4){

                double base = sc.nextDouble();

                double altura = sc.nextDouble();
                areat = (base * altura) / 2;
                acumtria = areat + acumtria;
            }

            sfinal = acumcuadra + acumcirc + acumrecta + acumtria;
        }

        float vfinal = (float) sfinal;



        System.out.println(dc.format(vfinal));
    }
}