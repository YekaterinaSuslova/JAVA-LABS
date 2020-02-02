package syn_vtip202_lab1;

import java.awt.Color;

public class SYN_VTIP202_LAB1 {

    public static void main(String[] args) {
        Car toyota = new car();              
        
        System.out.println(toyota.mark);
        System.out.println(toyota.country);
        System.out.println(toyota.color);
   
        System.out.println(toyota);
    
        Car volkswagen = new car();
        volkswagen.mark = "volkswagen";
        volkswagen.country = "German";
        volkswagen.color = Color.GREEN;
        
        System.out.println(volkswagen);
        
        Car lada = new car();
        lada.mark = "lada";
        lada.country = "Russia";
        lada.color = Color.WHITE;
        
        System.out.println(lada);
    }
    

    private static class car extends Car {

        public car() {
            
        }
    }
    
}
