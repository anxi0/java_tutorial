package org.anxi0.java.start;

public class Condition {
    public static void main(){
Q1();
Q2();
Q3();
Q4();
Q5();

    }
    private static void Q1(){
        String a = "write once, run anywhere";
        if (a.contains("wife")) {
            System.out.println("wife");
        } else if (a.contains("once") && !a.contains("run")) {
            System.out.println("once");
        } else if (!a.contains("everywhere")) {
            System.out.println("everywhere");
        } else if (a.contains("anywhere")) {
            System.out.println("anywhere");
        } else {
            System.out.println("none");
        }
    }
    private static void Q2(){
        int sum = 0;
        int i =3;
        while(i<1000){
            sum+=i;
            i+=3;
        }
        System.out.println(sum);
    }
    private static void Q3(){
        int length = 5;
        for(int i =0;i<length;i++){
            for(int j =0;j<i+1;j++){
                if(j==i) System.out.println("*"); else System.out.print("*");
            }
        }
    }
    private static void Q4(){
        for(int i=1;i<=100;i++) System.out.println(i);
    }
    private static void Q5(){
        int sum = 0;
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        for(int mark:marks){
            sum+=mark;
        }
        System.out.println(sum/marks.length*1.0);
    }
}
