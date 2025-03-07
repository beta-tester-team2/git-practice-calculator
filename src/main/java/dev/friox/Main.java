package dev.friox;

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
        System.out.println("===============계산기============");
    }
}

