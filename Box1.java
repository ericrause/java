/** public interface ToCount {
    int getLength();
    
}
public class Item implements ToCount {
    @Override 
    public int getLength(){
        return 0;
    }
    
}
*/
class Rectangle {
    double width;
    double height;
    
    double space() {
        return width * height;
    }
    void setDimensions(double w, double h){
        width=w;
        height=h;
    }
}

class Box1 {
    public static void main(String args[]){
        Rectangle mybox = new Rectangle();
        double boxSpace;
        
        mybox.setDimensions(5,5);
            
        boxSpace=mybox.space();
        System.out.println("Space is " +boxSpace);
        
    }
}