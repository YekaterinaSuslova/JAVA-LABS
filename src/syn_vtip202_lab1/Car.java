package syn_vtip202_lab1;

import java.awt.Color;

public class Car {
   
    String mark;   
    String country;
    Color color;
    
    public Car() {
        mark = "toyota";
        country = "Japan";
        color = Color.BLACK;
}
    
    public Car(String mark, String country, Color color) {
        this.mark = mark;
        this.country = country;
        this.color = color;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
     public String getMark() {
        return mark;
    }
    public void setMark(String mark) {
        this.mark = mark;
    }
          
 @Override
    public String toString() {
        return "Car{" + "mark=" + mark + ", country=" + country + ", color=" + color + '}';
    }

}
