/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessontexе25;

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
public class Lessontexе25 extends JComponent {
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
        g.drawString("J K-Триггеры",x + 250,y - 30);

        g.drawString("Его входы являются теми же R и S, но им присвоены буквы J и K по",x,y + 30);
        g.drawString("имени изобретателя схемы, чтобы отличить от других триггеров. JK схема",x,y + 60);
        g.drawString("отличается от RS триггера тем, что она не имеет неопределенных или",x,y + 90);
        g.drawString("запрещенных входных статусов. В JK добавлена входная схема ",x,y + 120);
        g.drawString("синхронизации, предотвращающая неопределенное условие вывода, которое ",x,y + 150);
        g.drawString("может случиться, если R и S равны единице. Поэтому в наличии четыре ",x,y + 180);
        g.drawString("возможных комбинации ввода: 1, 0, «без изменений» и «переключение». ",x,y + 210);
        g.drawString("Вход J соответствует S, а K – R. Кроме того, для каждого вентиля имеется ». ",x,y + 240);
        g.drawString("третий вход. На выходе остаются Q̃ и Q. Перекрестная связь RS триггера",x,y + 270);
        g.drawString("позволяет использовать ранее неопределенные условия работы триггера, ",x,y + 300);
        g.drawString("когда оба входных сигнала равны 1, для создания «переключателя», так как ». ",x,y + 330);
        g.drawString("два входа могут быть блокированы.",x,y + 360);
        Image image = new ImageIcon("F:\\Джава Схемотехника\\Приложения\\Текст для приложения\\Второй урок\\Картинки\\JK_Trigger_Logic.gif").getImage();
        g.drawImage(image, x1, y + 360, this);

    }
    
       public static void main(String[] args) {
        Lessontexе25 lessontexе25 = new  Lessontexе25();
        Frame frame = new Frame("Триггер Д-T");	
        frame.add(lessontexе25);
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
