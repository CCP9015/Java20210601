package net;

import java.io.IOException;
import java.net.Socket;

public class Test {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("ptt.cc",23);

        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("bye");


    }
}
