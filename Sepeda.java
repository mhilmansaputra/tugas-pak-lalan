
package palalan;

public class Sepeda {
    int jarak;
    String merk;
    
  

   public void maju() {
        jarak = jarak+10;
        System.out.println("Bergerak Maju 10 Km");
    }

   public void mundur() {
        jarak = jarak - 5;

        if (jarak < 0) {
            jarak = 0;
        }

        System.out.println("Bergerak Mundur 5 Km");
    }

   public void berhenti() {
        System.out.println("Sepeda Berhenti");
        System.out.println("Object Sepeda " + merk
                + ", Jarak tempuh akhir " + jarak + " Km");
    }
}

    
    

