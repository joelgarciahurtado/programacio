import java.util.Scanner;
class exercici2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();
    int aux;

    if (num1<num2){
      aux = num1;
      num1 = num2;
      num2 = aux;
      aux = 0;
    }  

    if (num2<num3){
      aux = num2;
      num2 =num3;
      num3 = aux;
    }

    if (num1<num2){
      aux = num1;
      num1 = num2;
      num2 = aux;
      aux = 0;
    }

    System.out.println(num1);
    System.out.println(num2);
    System.out.println(num3);


  }
}