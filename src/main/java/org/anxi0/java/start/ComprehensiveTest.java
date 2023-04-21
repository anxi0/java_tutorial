package org.anxi0.java.start;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class ComprehensiveTest {

    public static void main() {
//        Q1();
//        Q2();
//        Q3();
//        Q4(5);
//        Q5();
//        Q6();
//        Q9();
//        Q10();
//        Q11();
//        Q12();
//        Q13();
//    Q14();
//    Q15();
    }

    private static void Q1() {
        String question = "a:b:c:d";
        question.split(":");
        question.join("#");
        System.out.println(question);
    }

    private static void Q2() {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("A", 90);
        a.put("B", 80);
        System.out.println(a.get("C") == null ? "70" : a.get("C"));
    }

    private static void Q3() {
        int[] A = {20, 55, 67, 82, 45, 33, 90, 87, 100, 25};
        int sum = Arrays.stream(A).boxed().distinct().filter(a -> a >= 50).reduce(0, Integer::sum);
        System.out.println(sum);
    }

    private static void Q4(int n) {
        ArrayList<Integer> result = new ArrayList();
        int now = 0, next = 1;
        result.add(now);
        result.add(next);
        for (int i = 0; i < n - 2; i++) {
            now += next;
            result.add(now);
        }
        System.out.println(result);
    }

    private static void Q5() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input : ");
        int result = Integer.parseInt(in.next());
        in.close();
        for (int i = 1; i <= 9; i++) {
            System.out.print(result * i + " ");
        }
    }

    private static void Q6() {
        Scanner in = new Scanner(System.in);
        String[] result = in.next().split(",");
        int stream_result = Arrays.stream(result).map(a -> Integer.parseInt(a))
            .reduce(0, Integer::sum);
        System.out.println(stream_result);
    }

    private static void Q9() {
        int[] data1 = {1, 2, 3, 4, 5};
        Calculator cal1 = new Calculator(data1);
        System.out.println(cal1.sum());
        System.out.println(cal1.avg());

        int[] data2 = {6, 7, 8, 9, 10};
        Calculator cal2 = new Calculator(data2);
        System.out.println(cal2.sum());
        System.out.println(cal2.avg());
    }

    private static void Q10() {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            try {
                execute(r.nextInt(10));
            } catch (OddException e) {
                e.printStackTrace();
            }
        }
    }

    private static void Q11() {
        System.out.println(dashInsert("4546793"));
    }

    private static void Q12() {
        System.out.println(compressString("aaabbcccccca"));
    }

    private static void Q13() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for (String arg : input.split(" ")) {
            System.out.print(checkDuplicated(arg) + " ");
        }
    }
    private static void Q14(){
        System.out.println(morseTranslator(".... .  ... .-.. . . .--. ...  . .- .-. .-.. -.--"));
    }
    private static void Q15(){
        System.out.println(caesarMaker("CAT",5));
    }

    private static void execute(int n) throws OddException {
        System.out.printf("Input number : %d\n", n);
        if (n % 2 == 1) {
            throw new OddException();
        }
        System.out.println("Even");
    }

    private static String dashInsert(String arg) {
        int[] numbers = Arrays.stream(arg.split("")).mapToInt(Integer::parseInt).toArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                result.append(numbers[numbers.length - 1]);
            } else if (numbers[i] % 2 == 0 && numbers[i + 1] % 2 == 0) {
                result.append(numbers[i] + "*");
            } else if (numbers[i] % 2 == 1 && numbers[i + 1] % 2 == 1) {
                result.append(numbers[i] + "-");
            } else {
                result.append(numbers[i]);
            }
        }
        return result.toString();
    }

    private static String compressString(String arg) {
        String _c = "";
        int cnt = 1;
        String result = "";
        for (String c : arg.split("")) {
            if (_c.equals("")) {
                _c = c;
                result += _c;
            } else if (_c.equals(c)) {
                cnt++;
            } else {
                result += cnt;
                cnt = 1;
                _c = c;
                result += _c;
            }
        }
        result += "" + cnt;
        return result;
    }

    private static boolean checkDuplicated(String arg) {
        boolean isDistinctLengthTen = Arrays.stream(arg.split("")).distinct().toArray().length == 10;
        boolean isTen = arg.length()==10;
        return isDistinctLengthTen && isTen;
    }
    private static String morseTranslator(String arg){
        String result = "";
        HashMap<String,String> library = new HashMap() {{
            put(".-", "A");
            put("-...", "B");
            put("-.-.", "C");
            put("-..", "D");
            put(".", "E");
            put("..-.", "F");
            put("--.", "G");
            put("....", "H");
            put("..", "I");
            put(".---", "J");
            put("-.-", "K");
            put(".-..", "L");
            put("--", "M");
            put("-.", "N");
            put("---", "O");
            put(".--.", "P");
            put("--.-", "Q");
            put(".-.", "R");
            put("...", "S");
            put("-", "T");
            put("..-", "U");
            put("...-", "V");
            put(".--", "W");
            put("-..-", "X");
            put("-.--", "Y");
            put("--..", "Z");
        }};
        for(String word: arg.split("  ")){
            for(String letter: word.split(" ")){
                result+=library.get(letter);
            }
            result+=" ";
        }
        return result;
    }
    private static String caesarMaker(String arg,int shift){
        String result = "";
        int asciiA = (int) 'A';
        int asciiZ = (int) 'Z';
        for(int i=0;i<arg.length();i++){
            char l = arg.charAt(i);
            if((int) l +shift>asciiZ){
                result+=(char) ((int) l +shift - (int) 'A');
            }else{
                result+=(char) ((int) l +shift);
            }
        }
        return result;
    }

    private static class Calculator {

        int sum = 0;
        int avg = 0;

        Calculator(int[] arr) {
            int tmp = Arrays.stream(arr).reduce(0, Integer::sum);
            this.sum = tmp;
            this.avg = tmp / arr.length;
        }

        public int sum() {
            return sum;
        }

        public int avg() {
            return avg;
        }

    }

    private static class OddException extends java.lang.Exception {

    }
}

