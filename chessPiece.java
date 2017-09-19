
public class chessPiece {
    int Xcoord, Ycoord, box;
    String type, side;
    public chessPiece(int x, int y, String z, String s, int b) {
        Xcoord = x;
        Ycoord = y;
        type = z;
        side =s;
        box =b;
    }
    
    /**public int getX() {
       
    } */
    public int getY() {
        return Ycoord;
    }
    public String getType() {
        return type;
    }
    public String getSide() {
        return side;
    }
    public int getBox() {
        return box;
    }
    public void setBox(int b) {
        box = b;
    }
    public boolean hasPiece( int b) {
        if (b==box)
         return true;
         else
         return false;    
    }
}
