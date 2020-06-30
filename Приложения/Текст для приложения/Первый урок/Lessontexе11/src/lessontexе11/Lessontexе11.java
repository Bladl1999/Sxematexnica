/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessontexе11;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;

/**
 *
 * @author User
 */
public class Lessontexе11 extends JComponent {
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
        g.drawString("Логический элемент",x + 250,y - 30);
        g.drawString("Логический элемент — элемент, осуществляющий определенные",x,y);
        g.drawString("логические зависимость между входными и выходными сигналами.",x,y + 30);
        g.drawString("Логические элементы обычно используются для построения логических",x,y + 60);
        g.drawString("схем вычислительных машин, дискретных схем автоматического",x,y + 90);
        g.drawString("контроля и управления. Для всех видов логических элементов,",x,y + 120);
        g.drawString("независимо от их физической природы, характерны дискретные",x,y + 150);
        g.drawString("значения входных и выходных сигналов.",x,y + 180);
        g.drawString("",x,y + 210);
        g.drawString("Логические элементы имеют один или несколько входов и один или два",x,y + 240);
        g.drawString("(обычно инверсных друг другу) выхода. Значения «нулей» и «единиц»",x,y + 270);
        g.drawString("выходных сигналов логических элементов определяются логической",x,y + 300);
        g.drawString("функцией, которую выполняет элемент, и значениями «нулей» и",x,y + 330);
        g.drawString("«единиц» входных сигналов, играющих роль независимых переменных.",x,y + 360);
        g.drawString("Существуют элементарные логические функции, из которых можно",x,y + 390);
        g.drawString("составить любую сложную логическую функцию.",x,y + 420);
        Image image = new ImageIcon("F:\\Джава Схемотехника\\Приложения\\Текст для приложения\\Первый урок\\Картинки\\1503051153_21.jpg").getImage();
        g.drawImage(image, x1, y + 450, this);
    }
    
       public static void main(String[] args) {
        Lessontexе11 triggerdt = new  Lessontexе11();
        Frame frame = new Frame("Триггер Д-T");	
        frame.add(triggerdt);
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
