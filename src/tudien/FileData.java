/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tudien;

/**
 *
 * @author admin
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class FileData {
    public static ArrayList<String> list = new ArrayList<>();

    public void loadFile ()  {
        File file = new File("src\\file.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while(sc.hasNextLine()) {
            list.add(sc.nextLine());
        }
    }

    public String dich(String world) {
        String s = "Không có từ này";
        if (list.indexOf(world) != -1){
            s = list.get(list.indexOf(world) + 1);
        }
        return s;
    }

}

