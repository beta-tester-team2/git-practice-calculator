package dev.friox;
import java.util.Scanner;

class Sum {
    private int a, b, sum;

    public int Sum(int a, int b) {
        this.a = a;
        this.b = b;
        sum = a + b;
        return sum;
    }
}

class Div{
    private int a,b;

    public Div(int a,int b){
        this.a = a;
        this.b = b;
    }

    public int divide(int a,int b) {
        return a/b;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("===============계산기==============");
        System.out.println("계산할 값을 2개 입력해주세요: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Sum sum = new Sum();
        Div div = new Div(a,b);
        Minus minus = new Minus();
        Mulitplication mulitplication = new Mulitplication();

        System.out.println(a+" 와 "+b+" 를 더한 값은 "+sum.Sum(a,b)+" 입니다.");
        System.out.println(a+" 와 "+b+" 를 뺀 값은 "+minus.execute(a, b)+" 입니다.");
        System.out.println(a+" 와 "+b+" 를 곱한 값은 "+ mulitplication.multiply(a,b)+" 입니다.");
        System.out.println(a+" 와 "+b+" 를 나눈 값은 "+div.divide(a,b)+" 입니다.");

    }
}

