/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessontexе24;

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
public class Lessontexе24 extends JComponent {
        private int x = 10;
        private int y = 60;
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
        g.drawString("Т-Триггер",x + 250,y - 30);

        g.drawString("T-триггер — это счетный триггер. У данного триггера имеется только один вход.",x,y + 30);
        g.drawString("Принцип работы T-триггера заключается в следующем. После поступления на ",x,y + 60);
        g.drawString("вход T импульса, состояние триггера меняется на прямо противоположное. ",x,y + 90);
        g.drawString("Счётным он называется потому, что T триггер как бы подсчитывает количество ",x,y + 120);
        g.drawString("импульсов, поступивших на его вход. Жаль только, что считать этот триггер ",x,y + 150);
        g.drawString("умеет только до одного. При поступлении второго импульса T-триггер снова",x,y + 180);
        g.drawString("сбрасывается в исходное состояние.",x,y + 210);
    }
    
       public static void main(String[] args) {
        Lessontexе24 lessontexе24 = new  Lessontexе24();
        Frame frame = new Frame("Триггер Д-T");	
        frame.add(lessontexе24);
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
