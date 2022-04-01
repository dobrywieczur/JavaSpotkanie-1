import java.util.Scanner;
import java.util.ArrayList;

public class Fibonacci {
    public static void main(String args[]) {
        
    ArrayList<Integer> lista = new ArrayList<Integer>();
    Scanner skan = new Scanner(System.in);
    int x;
    int y;
    
    System.out.println("Podaj dwie dowolne pierwsze liczby ciągu Fibonacciego: ");
    System.out.print("Pierwsza: ");
    x = skan.nextInt();
    System.out.print("Druga: ");
    y = skan.nextInt();
    
    lista.add(x);
    lista.add(y);
    
    for (int i = 0; i < 5; i++ ){
        x = x + y;
        lista.add(x);
        y = y + x;
        lista.add(y);
    }
    System.out.print("Pełna lista: " + lista);
    }
}
