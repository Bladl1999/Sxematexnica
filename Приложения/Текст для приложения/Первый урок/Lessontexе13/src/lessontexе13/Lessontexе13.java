/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessontexе13;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

/**
 *
 * @author User
 */
public class Lessontexе13 extends JComponent{
        private int x = 10;
        private int y = 90;
        private int h;
        private int d;
        private int x1;
        
    public void paint(Graphics g){
        h = getHeight();
        d = getWidth();
        if(d > 920)
            x = (d - 920)/2;
        if(d > 500)
            x1 = (d- 500)/2;
        g.setFont(new Font("Bold", Font.BOLD, 24));
        g.drawString("Логический элемент «ИЛИ»",x + 250,y - 60);
        g.drawString("",x + 250,y - 30);
        g.drawString("Логический элемент «ИЛИ» - дизъюнкция, логическое сложение, OR",x,y);
        g.drawString("«ИЛИ» - логический элемент, выполняющий над входными данными",x,y + 30);
        g.drawString("операцию дизъюнкции или логического сложения. Он так же как и",x,y + 60);
        g.drawString("элемент «И» выпускается с двумя, тремя, четырьмя и т. д. входами и с",x,y + 90);
        g.drawString("одним выходом. Условные обозначения логических элементов «ИЛИ» с",x,y + 120);
        g.drawString("различным количеством входов показаны на рисунке. Обозначаются",x,y + 150);
        g.drawString("данные элементы так: 2ИЛИ, 3ИЛИ, 4ИЛИ и т. д.",x,y + 180);
    

    }
    
       public static void main(String[] args) {
        Lessontexе13 lessontexе13 = new  Lessontexе13();
        Frame frame = new Frame("Триггер Д-T");	
        frame.add(lessontexе13);
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
