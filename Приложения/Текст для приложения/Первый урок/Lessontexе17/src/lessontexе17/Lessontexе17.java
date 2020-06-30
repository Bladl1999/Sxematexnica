/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessontexе17;

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
public class Lessontexе17 extends JComponent{
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
        g.drawString("RS триггер",x + 250,y - 60);
        g.drawString("",x + 250,y - 30);
        g.drawString("RS триггер получил название по названию своих входов. Вход S (Set —",x,y);
        g.drawString("установить англ.) позволяет устанавливать выход триггера Q в единичное",x,y + 30);
        g.drawString("состояние (записывать единицу). Вход R (Reset — сбросить англ.) позволяет",x,y + 60);
        g.drawString("сбрасывать выход триггера Q (Quit — выход англ.) в нулевое состояние",x,y + 90);
        g.drawString(" (записывать ноль).",x,y + 120);
        g.drawString("В простейшем случае RS триггер это два логических элемента \"2И-НЕ\",",x,y + 150);
        g.drawString("соединенные последовательно друг с другом. Его принципиальная схема ",x,y + 180);
        g.drawString("приведена на рисунке. Обратите внимание, что у триггера только один выход.",x,y + 210);
        g.drawString("Обозначим его Q. Тогда оставшийся вывод схемы будет инверсным выходом Q",x,y + 240);
    }
    
       public static void main(String[] args) {
        Lessontexе17 lessontexе17 = new  Lessontexе17();
        Frame frame = new Frame("Триггер Д-T");	
        frame.add(lessontexе17);
        frame.setSize(960, 600);
        frame.setLocation(300, 200);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e){
               System.exit(0);
            }    
       });
    }
}
