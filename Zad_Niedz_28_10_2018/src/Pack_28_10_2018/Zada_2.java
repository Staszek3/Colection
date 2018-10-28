package Pack_28_10_2018;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zada_2 {  //mapa z Id(klucz) i Nazwiskiem (wartość)
    public static void main(String[] args) {


        Map<String, String> id_Nazwisko = new LinkedHashMap<>();

        id_Nazwisko.put("K1", "Jan Kowalski");
        id_Nazwisko.put("Q2", "Eugienia Nowak");
        id_Nazwisko.put("A4", "Zofia Pitera");
        id_Nazwisko.put("R5", "Alfred Nowak");

        System.out.println("*****************************************");
        for (Map.Entry<String, String> x : id_Nazwisko.entrySet()) {
            System.out.println("ID pracownika: " + x.getKey() + " Imie Nazwisko: " + x.getValue());
        }
       String prac= id_Nazwisko.get("k1".toUpperCase());
        System.out.println(prac);

       // Scanner scanner = new Scanner(System.in);
       // System.out.println( );
    }
}
