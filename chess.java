import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;
class chess{
    public static chessPiece[] pieces = new chessPiece[32];
    public static void main() {
        int p = 0;
        JFrame frame = new JFrame("chess");
        JPanel panel = new Panel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false); 

        for (int i=50; i<800; i+=100) {
            for (int j=50; j<200; j += 100) {
                if (p ==0 || p== 15)
                    pieces[p] = new chessPiece(i,j,"rook","white", p);
                else if (p ==2 || p== 13)
                    pieces[p] = new chessPiece(i,j,"knight","white", p);
                else if (p ==4 || p== 11)
                    pieces[p] = new chessPiece(i,j,"bishop","white", p);
                else if (p ==6)
                    pieces[p] = new chessPiece(i,j,"king","white", p);
                else if (p ==8)
                    pieces[p] = new chessPiece(i,j,"queen","white", p);
                else
                    pieces[p] = new chessPiece(i,j,"pawn","white", p);
                p++; 
            }
        }

        p=48;
        for (int i=50; i<800; i+=100) {
            for (int j=650; j<800; j += 100) {
                if (p ==0 || p== 15)
                    pieces[p -32] = new chessPiece(i,j,"rook","black", p);
                else if (p ==2 || p== 13)
                    pieces[p- 32] = new chessPiece(i,j,"knight","black", p);
                else if (p ==4 || p== 11)
                    pieces[p -32] = new chessPiece(i,j,"bishop","black", p);
                else if (p ==6)
                    pieces[p- 32] = new chessPiece(i,j,"king","black", p);
                else if (p ==8)
                    pieces[p- 32] = new chessPiece(i,j,"queen","black", p);
                else
                    pieces[p- 32] = new chessPiece(i,j,"pawn","black", p);
                p++; 
            }
        }
        //final BufferedImage image = ImageIO.read(new File("pawn");
        frame.getContentPane().add(panel);
        panel.setPreferredSize(new Dimension(1000,800));
        MouseListener mouse =  new Mouse();
        panel.addMouseListener(mouse);
        frame.pack();
        frame.setVisible(true);

        //Piece Test
        /*for (int i =0; i<32; i++) {
        System.out.println(chessPiece.getType());
        System.out.println(chessPiece.getSide());
        System.out.println(chessPiece.getX());
        System.out.println(chessPiece.getY());
        System.out.println(chessPiece.getBox());
        }
         */

        
        while (true) {
            frame.repaint();
        }
    }
}