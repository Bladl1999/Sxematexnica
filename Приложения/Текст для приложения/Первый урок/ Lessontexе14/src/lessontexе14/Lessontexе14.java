/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessontexе14;

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
public class Lessontexе14 extends JComponent{
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
        g.drawString("Логический элемент «НЕ»",x + 250,y - 60);
        g.drawString("",x + 250,y - 30);
        g.drawString("Логический элемент «НЕ» - отрицание, инвертор, NOT",x,y);
        g.drawString("«НЕ» - логический элемент, выполняющий над входными данными",x,y + 30);
        g.drawString("операцию логического отрицания. Данный элемент, имеющий один",x,y + 60);
        g.drawString("выход и только один вход, называют еще инвертором, поскольку он на",x,y + 90);
        g.drawString("самом деле инвертирует (обращает) входной сигнал. На рисунке",x,y + 120);
        g.drawString("приведено условное обозначение логического элемента «НЕ».",x,y + 150);
    }
    
       public static void main(String[] args) {
        Lessontexе14 lessontexе14 = new  Lessontexе14();
        Frame frame = new Frame("Триггер Д-T");	
        frame.add(lessontexе14);
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
