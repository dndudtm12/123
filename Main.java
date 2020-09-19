import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int score = 0;
    String num;

    System.out.println("score");
    int num1 = sc.nextInt();

    if(score>90){
    num = "a";
    }
    else if (score>80){
    num = "b";
    }
    else if (score>70){
    num = "c";
    }
    else if (score>60){
    num = "d";
    }
    else{
    num = "f";
    }
    System.out.println(num+"학점입니다");

    System.out.println("a입력");
    int num2 = sc.nextInt();

    System.out.println("b입력");
    int num3 = sc.nextInt();

    if(num2 % num3 == 0){
      System.out.println("a는b약수입니다.");
    }
    else{
    System.out.println("a는b약수입니다.?");
    }
  }
}