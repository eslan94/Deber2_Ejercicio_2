import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    double sueldo,HorasTra,ValHora;
    double TotalHora=0;
    Scanner s =new Scanner(System.in);
    System.out.println("Ingrese el valor a pagar por hora : ");
    ValHora = s. nextDouble();
    for(int i = 1; i <= 5; i++){
    System.out.println("Ingrese el numero de horas trabajadas en el dia "+i+" :");
    HorasTra = s. nextDouble();
    TotalHora=TotalHora+HorasTra;
    }
    sueldo=TotalHora*ValHora;
    System.out.println("El valor a pagar es: "+sueldo);
  }

}