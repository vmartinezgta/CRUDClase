
package crudformulario;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;


public class Imagen extends javax.swing.JPanel {
public String ruta;    
    public Imagen(int x, int y, String ruta){
        this.setSize(x,y);
        this.ruta = ruta;
    }
    public void paint(Graphics g){
        Dimension height = getSize();
        Image imgExt = new ImageIcon(ruta).getImage();
        g.drawImage(imgExt,0,0, height.width, height.height, null);
        setOpaque(false);
        super.paintComponent(g);
    }
}
