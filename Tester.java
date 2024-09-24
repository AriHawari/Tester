package CD;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner kemilas = new Scanner(System.in);
        System.out.println("Pilih 1. CD atau 2. DVD");
        int pilihan = kemilas.nextInt();
        kemilas.nextLine();

        if(pilihan == 1){

            System.out.println("Name: ");
            String name = kemilas.nextLine();
            System.out.println("Artist: ");
            String artist = kemilas.nextLine();
            System.out.println("Label: ");
            String label = kemilas.nextLine();
            System.out.println("Number: ");
            int number = kemilas.nextInt();
            System.out.println("Number Song: ");
            int numSong = kemilas.nextInt();
            System.out.println("Quantity: ");
            int quantity = kemilas.nextInt();
            System.out.println("Price: ");
            double price = kemilas.nextDouble();

            CD cd1 = new CD(number, name, quantity, price, artist, numSong, label);
            cd1.print();
            
        }else if (pilihan == 2){
            System.out.println("Name: ");
            String name = kemilas.nextLine();
            System.out.println("Studio: ");
            String studio = kemilas.nextLine();
            System.out.println("Number: ");
            int number = kemilas.nextInt();
            System.out.println("Quantity: ");
            int quantity = kemilas.nextInt();
            System.out.println("Rating: ");
            int rating = kemilas.nextInt();
            System.out.println("Lenght: ");
            int lenght = kemilas.nextInt();
            System.out.println("Price: ");
            double price = kemilas.nextDouble();

            DVD dvd1 = new DVD(number, name, quantity, price, lenght, rating, studio);
            dvd1.print();
        }else {
            System.out.println("Input Salah");
        }
    }
}