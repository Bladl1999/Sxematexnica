/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessontexе34;

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
public class Lessontexе34 extends JComponent {
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
        g.drawString("D-Триггер на основе JK-Триггера:",x + 250,y - 30);

        g.drawString("двухступенчатого D-триггера, построенного на основе двухступенчатого JK-",x,y + 30);
        g.drawString("триггера и дополнительного инвертора. Если D = 1, J=1, К=0 и первая ",x,y + 60);
        g.drawString("ступень JK-триггера тактовым импульсом переключается в единичное ",x,y + 90);
        g.drawString("состояние, а после окончания тактового импульса в единичное состояние ",x,y + 120);
        g.drawString("переходит выходная ступень. Если же D = 0, то К= D`=1, J=0 и триггер ",x,y + 150);
        g.drawString("переходит в нулевое состояние. Таким образом, после окончания тактового ",x,y + 180);
        g.drawString("импульса информация на выходе триггера соответствует информации на ",x,y + 210);
        g.drawString("входе.». ",x,y + 240);   
    }
    
       public static void main(String[] args) {
        Lessontexе34 lessontexе34 = new  Lessontexе34();
        Frame frame = new Frame("Триггер Д-T");	
        frame.add(lessontexе34);
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
