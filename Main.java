
package palalan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pilihan;
        Scanner input = new Scanner(System.in);
        

        Sepeda sepeda = new Sepeda();
         sepeda.jarak=0;
         
       
       System.out.println("Masukan Object Merk Sepeda : ");
        sepeda.merk = input.nextLine();
        
        

        do {
               System.out.println("\nMenu:");
            System.out.println("Bergerak Maju (1)");
            System.out.println("Bergerak Mundur (2)");
            System.out.println("Berhenti (3)");
            System.out.println("Exit (0)");
            System.out.print("Pilihan : ");
              pilihan=input.nextInt();
            
            
           
          

            switch (pilihan) {
                
                case 1:
                    sepeda.maju();
                    System.out.println("Object Sepeda "
                            + sepeda.merk + ", Jarak tempuh "
                            + (sepeda.jarak) + " Km");
                    break;

                case 2:
                    sepeda.mundur();
                    System.out.println("Object Sepeda "
                            + sepeda.merk + ", Jarak tempuh "
                            + sepeda.jarak + " Km");
                    break;

                case 3:
                    sepeda.berhenti();
                    break;

                case 0:
                    System.out.println("Keluar Program ..");
                    System.out.println(
                            "Terimakasih sudah menggunakan program ini.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia!");
            }

        } while (pilihan != 0);

        input.close();
    }
}

    

