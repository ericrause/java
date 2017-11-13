public interface ToCount {
    int getLength();
    
}
public class Item implements ToCount {
    @Override 
    public int getLength(){
        return 0;
    }
    
}