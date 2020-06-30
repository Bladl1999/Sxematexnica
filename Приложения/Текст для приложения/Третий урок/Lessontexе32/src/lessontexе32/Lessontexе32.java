/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessontexе32;

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
public class Lessontexе32 extends JComponent {
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
        g.drawString("D триггеры, работающие по фронту  (динамические",x1,y - 30);
        g.drawString("D триггеры)",x1 + 200,y);

        g.drawString("Динамический D триггер, запоминающий входную информацию по фронту,",x,y + 60);
        g.drawString("может быть построен из двух статических D триггеров.Сигнал ",x,y + 90);
        g.drawString("синхронизации \"C\" будем подавать на статические D триггеры",x,y + 120);
        g.drawString("в противофазе. Схема триггера, запоминающего входную двоичную",x,y + 150);
        g.drawString("информацию по фронту, приведена на рисунке",x,y + 180);
        Image image = new ImageIcon("F:\\Джава Схемотехника\\Приложения\\Текст для приложения\\Третий урок\\Картинки\\01.png").getImage();
        g.drawImage(image, x1 + 50, y + 190, this);
        
    }
    
       public static void main(String[] args) {
        Lessontexе32 lessontexе32 = new  Lessontexе32();
        Frame frame = new Frame("Триггер Д-T");	
        frame.add(lessontexе32);
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
