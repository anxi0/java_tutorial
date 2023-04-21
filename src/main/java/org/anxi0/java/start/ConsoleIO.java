package org.anxi0.java.start;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleIO {
    public static void main() throws IOException {
        InputStream in = System.in;

        int a;
        byte[] b = new byte[3];
        a = in.read();
        in.read(b);
        System.out.println(a);
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);

        InputStreamReader reader = new InputStreamReader(in);
        char[] c = new char[3];
        reader.read(c);
        System.out.println(c);

        BufferedReader br = new BufferedReader(reader);

        String d = br.readLine();
        System.out.println(d);

        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine());

        // https://wikidocs.net/227#fileoutputstream

    }
}
