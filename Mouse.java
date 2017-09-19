import java.awt.*;
import java.awt.event.*;
public class Mouse implements MouseListener {
    public static int mouseX = 0;
    public static int mouseY = 0;
    public static int sBoxX = -1;
    public static int sBoxY = -1;
    public static int box = -1;
    public static int xi = -1; 
    public static int yi = -1;
    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        mouseX = x;
        mouseY = y;
        int temp = -1;
        int sPiece = -1;

            //System.out.println("X: " + x + " Y: " + y);

        for(int i = 0; i<= 7; i++) {
            if (x>i*100 && x<(i+1)*100) {
                sBoxX = i*100;
                xi = i;
            }
        }
        for(int i = 0; i<= 7; i++) {
            if (y>i*100 && y<(i+1)*100) {
                sBoxY = i*100;
                yi = i;
            }
        }

        if (yi > 0)
            box = xi + 8 * yi;
        if (yi == 0)
            box = xi;
        for (int i=0; i<32; i++) {
            if (chess.pieces[i].hasPiece(box) && temp == -1) {
                temp = box;    
                sPiece = i;
            }
        }
        if ( temp != -1 && sPiece != -1) {
            chess.pieces[sPiece].setBox(box);
            temp = -1;
            sPiece = -1;
        }
        
            }

        public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void mouseClicked(MouseEvent e) {
    }
}