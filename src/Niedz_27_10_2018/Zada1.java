package Niedz_27_10_2018;

public class Zada1 {
    public static void main(String[] args) {

        // zadanie 2
        System.out.println("zadanie 2 -rysuje kwadrat wypełniony gwiazdkami");
        for (int i = 0; i < 10; i++) {
            char a = '*';
            System.out.println("");
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + a + " ");
            }
        }
        System.out.println("");
        System.out.println("zadanie 3 -rysuje kwadrat z gwiazdek(w środku nie ma gwiazdek");


        for (int i = 0; i < 10; i++) {
            char b = '*';
            if (i == 0 || i == 9) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(" " + b + " ");
                }
                System.out.println("");
            } else {
                for (int j = 0; j < 10; j++)
                {
                    if (j == 0 || j == 9) {
                        System.out.print(" " + b + " ");
                    }else{
                        System.out.print("   ");
                    }
                }
                System.out.println("");
            }
        }
        System.out.println("");
        System.out.println("zadanie 4-rysuje trojkąt prostokatny z gwiazdek");

        int length=10;
        int licznik=length+1;
        for (int i = 0; i < 10; i++) {
            char c = '*';
            licznik--;

                for (int j = 0; j < licznik; j++) {
                    System.out.print(" " + c + " ");
                }
                System.out.println("");

            }
        System.out.println("");
        System.out.println("zadanie 5-rysuje wypełniony trojkąt równoramienny z gwiazdek");

    }
    }
