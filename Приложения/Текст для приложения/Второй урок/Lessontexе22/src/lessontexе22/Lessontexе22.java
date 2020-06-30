/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessontexе22;

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
public class Lessontexе22 extends JComponent{
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
        if(d > 600)
            x1 = (d- 600)/2;
        g.setFont(new Font("Bold", Font.BOLD, 24));
        g.drawString("D-триггер",x + 350,y - 60);
        g.drawString("",x + 250,y - 30);
        g.drawString("D– триггеры имеет один информационный вход (D- вход) для установки в “1”",x,y);
        g.drawString("или “0” и вход синхронизации С (происходит от слова delay - задержка)",x,y + 30);
        
        g.drawString("нулевым и обозначаются 1 и 0 (триггер обладает свойством памяти).",x,y + 90);
        
        g.drawString("D-триггер (D от англ. delay - задержка) - запоминает состояние входа и выдаёт",x,y + 120);
        
        g.drawString("его на выход. D-триггеры имеют, как минимум, два входа: информационный D",x,y + 150);
        
        g.drawString("и синхронизации С. Сохранение информации в D-триггерах происходит в",x,y + 180);
        g.drawString("момент прихода активного фронта на вход С. Так как информация на выходе",x,y + 210);
        g.drawString("остаётся неизменной до прихода очередного импульса синхронизации, D-",x,y + 240);
        g.drawString("триггер называют также триггером с запоминанием информации или триггером-",x,y + 270);
        g.drawString("защёлкой. Рассуждая чисто теоретически, D-триггер можно образовать из",x,y + 300);
        g.drawString("любых RS- или JK-триггеров, если на их входы одновременно подавать взаимно",x,y + 330);
        g.drawString("инверсные сигналы. D-триггер в основном используется для реализации",x,y + 360);
        g.drawString("защёлки. Так, например, для снятия 32 бит информации с параллельной шины,",x,y + 390);
        g.drawString("берут 32 D-триггера и объединяют их входы синхронизации для управления",x,y + 420);
        g.drawString("записью информации в защёлку, а 32 D входа подсоединяют к шине.",x,y + 450);
        Image image = new ImageIcon("F:\\Джава Схемотехника\\Приложения\\Текст для приложения\\Второй урок\\Картинки\\image016.jpg").getImage();
        g.drawImage(image, x1 + 50, y + 500, this);
    }
    
       public static void main(String[] args) {
        Lessontexе22 lessontexе22 = new  Lessontexе22();
        Frame frame = new Frame("Триггер Д-T");	
        frame.add(lessontexе22);
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
