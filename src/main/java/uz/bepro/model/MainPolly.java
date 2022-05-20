package uz.bepro.model;

import javafx.scene.chart.PieChart;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainPolly {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
            Date date = simpleDateFormat.parse(scanner.nextLine());
            System.out.println(date);
        }catch (Exception e){
            System.out.println("Exception : " + e);
        }
        finally {
            System.out.println("Happy Birthday");
        }

    }
}
