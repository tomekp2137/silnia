import java.util.Scanner;
import java.util.Locale;


class Main {
  public static void main(String[] args) {
     int i,wynik=1;
  
  Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); 
        System.out.println("Podaj liczbę:");
        int liczba = scanner.nextInt();
    
  for(i=1;i<=liczba;i++){
      wynik=wynik*i;
  }
  System.out.println("Silnia liczby "+liczba+" to: "+wynik);
  }
}