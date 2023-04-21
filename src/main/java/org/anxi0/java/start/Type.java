package org.anxi0.java.start;

import java.util.*;

public class Type {
    public static void main(){
            Q1();
    Q2(13);
    Q3("881120-1068234");
    Q4("881120-1068234");
    Q5();
        Q6();
        Q7();
        Q8();
        Q9();
        Q10(Coffee.values()[0]);
//        Q10(Coffee.values()[99]);
    }
    private static void Q1(){
        int korean = 80;
        int english = 75;
        int math = 55;
        System.out.println((korean+english+math)/3.0);
    }
    private static void Q2(int target){
        System.out.println(target%2==0? "짝":"홀");
    }
    private static void Q3(String id){
        System.out.println(id.split("-")[0]);
        System.out.println(id.split("-")[1]);
    }
    private static void Q4(String id){
        System.out.println(id.split("-")[1].charAt(0));
    }
    private static void Q5(){
        String a= "a:b:c:d";
        System.out.println(a.replaceAll(":","#"));
    }
    private static void Q6(){
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        myList.sort(Comparator.reverseOrder());
        System.out.println(myList);
    }
    private static void Q7(){
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        System.out.println(String.join(" ",myList));
    }
    private static void Q8(){
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);
        System.out.println(grade.remove("B"));
    }
    private static void Q9(){
        HashSet<Integer> numbers = new HashSet<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        System.out.println(numbers);
    }
    enum Coffee{
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    }
    private static void Q10(Coffee coffee) throws NullPointerException{

        HashMap<Coffee, Integer> priceMap = new HashMap<>();
        priceMap.put(Coffee.AMERICANO, 3000);  // 1: 아메리카노
        priceMap.put(Coffee.ICE_AMERICANO, 4000);  // 2: 아이스 아메리카노
        priceMap.put(Coffee.CAFE_LATTE, 5000);  // 3: 카페라떼
        int price = priceMap.get(coffee);
        System.out.println(String.format("가격은 %d원 입니다.", price));
    }
}
