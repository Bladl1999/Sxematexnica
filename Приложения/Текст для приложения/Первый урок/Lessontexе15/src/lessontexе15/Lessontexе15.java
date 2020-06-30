/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessontexе15;

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
public class Lessontexе15 extends JComponent{
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
        g.drawString("Логический элемент «И-НЕ»",x + 250,y - 60);
        g.drawString("",x + 250,y - 30);
        g.drawString("Логический элемент «И-НЕ» - конъюнкция (логическое умножение) с",x,y);
        g.drawString("отрицанием, NAND",x,y + 30);
        g.drawString("«И-НЕ» - логический элемент, выполняющий над входными данными",x,y + 60);
        g.drawString("операцию логического сложения, и затем операцию логического",x,y + 90);
        g.drawString("отрицания, результат подается на выход. Другими словами, это в",x,y + 120);
        g.drawString("принципе элемент «И», дополненный элементом «НЕ». На рисунке",x,y + 150);
        g.drawString("приведено условное обозначение логического элемента «2И-НЕ».",x,y + 180);
    }
    
       public static void main(String[] args) {
        Lessontexе15 lessontexе15 = new  Lessontexе15();
        Frame frame = new Frame("Триггер Д-T");	
        frame.add(lessontexе15);
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
