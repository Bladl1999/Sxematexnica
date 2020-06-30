/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessontexе12;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JComponent;

/**
 *
 * @author User
 */
public class Lessontexе12 extends JComponent{
        private int x = 10;
        private int y = 120;
        private int h;
        private int d;
    
    public void paint(Graphics g){
        h = getHeight();
        d = getWidth();
        if(d > 920)
            x = (d - 920)/2;
        g.setFont(new Font("Bold", Font.BOLD, 24));
        g.drawString("Логический элемент «И»",x + 250,y - 90);
        g.drawString("",x,y - 60);
        g.drawString("Логический элемент «И» - конъюнкция, логическое умножение, AND",x,y - 30);
        g.drawString("«И» - логический элемент, выполняющий над входными данными",x,y);
        g.drawString("операцию конъюнкции или логического умножения. Данный элемент",x,y + 30);
        g.drawString("может иметь от 2 до 8 (наиболее распространены в производстве",x,y + 60);
        g.drawString("элементы «И» с 2, 3, 4 и 8 входами) входов и один выход.",x,y + 90);
        
    }
    public static void main(String[] args) {
        Lessontexе12 lessontexе12 = new Lessontexе12();
        Frame frame = new Frame("Триггер Д-T");	
        frame.add(lessontexе12);
        frame.setSize(920, 600);
        frame.setLocation(300, 200);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e){
               System.exit(0);
            }    
       });
    }
    
}
