import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
public class Panel extends JPanel {
        public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (int i=0; i<800; i += 100) {
            for (int j=0; j<800; j += 100) {
                if(i % 200 ==0 && j % 200 ==0 || i % 200 ==100 && j % 200 ==100)
                    g2.setColor(Color.lightGray);
                else
                    g2.setColor(Color.darkGray);
                g2.fillRect(i,j,100,100);
            }
        }

        for (int i=0; i<chess.pieces.length;i++) {
            g2.setColor(Color.white);
            g2.drawRect(chess.pieces[i].getX(), chess.pieces[i].getY(), 20, 30);
        }
        
        if (Mouse.sBoxX != -1 && Mouse.sBoxY != -1) {
            g2.setColor(Color.green);
            g2.drawRect(Mouse.sBoxX, Mouse.sBoxY, 100, 100);
        }
        //g2.drawRect(Mouse.mouseX, Mouse.mouseY, 20, 30);
    }
}