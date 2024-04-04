import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        if(a == 0 || b == 0){
            System.out.println("nao multiplos");
        }else if(a % b == 0 || b % a == 0){
        System.out.println("Sao multiplos");
    }else{
        System.out.println("nao multiplos");
    }
        
    }
}
