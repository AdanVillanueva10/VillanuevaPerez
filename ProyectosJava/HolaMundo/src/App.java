import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int i = 0; int N1 = 1; int N2 = 2; int suma = 0; int ciclo=0;
        
        Scanner numero = new Scanner(System.in);
        System.out.println("¿Cuántas vueltas quiere dar?");
        
        ciclo = numero.nextInt();
        while(i<ciclo)
        {
        suma = N1+N2;
        System.out.println(N1 + "+" + N2 + "=" + suma);  
        System.out.println("\n-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-");
        N1 = N2; 
        N2 = suma;
        i++;
        }
    }
}
