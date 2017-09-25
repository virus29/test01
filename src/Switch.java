import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int z=scanner.nextInt();
       switch (z){
           case 0:
               System.out.println("Ноль");
               break;
           case 5:
               System.out.println("Пять");
               break;
           default:
               System.out.println("По умолчанию");
       }
    }
}