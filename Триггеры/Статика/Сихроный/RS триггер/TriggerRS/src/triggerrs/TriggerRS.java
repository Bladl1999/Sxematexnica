/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triggerrs;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;

/**
 *
 * @author User
 */
public class TriggerRS extends JComponent implements Runnable{
    private int h;  // Высота логического элемента
    private int w;  // длина логического элемента
    private int x;  // координата х для размещение
    private int y;  // координата у для размещение
    private int h1;
    private int r;
    private int s;
    private int q1;
    private int q2;
    private Thread thread;
    
    public void paint(Graphics g)
 	{
        // Отрисовываем логического элемента
            Color newColor = new Color(255, 255, 255);
            g.setColor(newColor);
            w = 50;   
            h = 100;
            x = 60;
            y = 10;
            h1 = 200;
            g.fillRect(x, y, w, h);                 // Внутриняя часть логического элемента
            newColor = new Color(0, 0, 0);
            g.setColor(newColor);                   // Внешняя часть логического элемента
            g.drawRect(x, y, w, h);                 // Внешняя часть логического элемента и его входов и выдохов
            g.drawOval(x + w -  5, y + h/2 - 5, 10, 10);
            
            g.setColor(Color.BLACK);
            g.setFont(new Font("Dialog",1, 40));
            g.drawString("&", x + w - 25, y + 35);
            g.setFont(new Font("Dialog",1, 20));
            //Второй лог элемент
            newColor = new Color(255, 255, 255);
            g.setColor(newColor);
            g.fillRect(x, h1, w, h);                 // Внутриняя часть логического элемента
            newColor = new Color(0, 0, 0);
            g.setColor(newColor);                   // Внешняя часть логического элемента
             g.drawOval(x + w -  5, h1 + h/2 - 5, 10, 10);
            g.drawRect(x, h1, w, h);      
            g.setColor(Color.BLACK);
            g.setFont(new Font("Dialog",1, 40));
            g.drawString("&", x + w - 25, h1 + 35);
            g.setFont(new Font("Dialog",1, 20));
            
            if(getS() == 1)
                g.setColor(Color.RED);
            else
                g.setColor(Color.BLACK);
            g.drawLine(x - 50, y + 25, x, y + 25);
            g.drawString("" + getS(), x - 50, y + 25);
            
            if(getR() == 1)
                g.setColor(Color.RED);
            else
                g.setColor(Color.BLACK); 
            g.drawLine(x - 50, h1 + 75, x, h1 + 75);
            g.drawString("" + getR(), x - 50, h1 + 75);
            
            if(getQ1() == 1)
                g.setColor(Color.RED);
            else
                g.setColor(Color.BLACK);
            g.drawString("" + getQ1(), x + w + 50, y + 50);
            g.drawLine(x + w, y + 50, x + w + 50 + 100, y + 50);
            g.drawLine(x + w + 50, y + 50, x + w + 50, y + 100);
            g.drawLine(x + w + 50, y + 100, x - 50, y + 150);
            g.drawLine(x - 50, y + 150, x - 50, h1 + 25);
            g.drawLine(x - 50, h1 + 25, x, h1 + 25);
            
            if(getQ2() == 1)
                g.setColor(Color.RED);
            else
                g.setColor(Color.BLACK);
            g.drawString("" + getQ2(), x + w + 50, h1 + 50);
            g.drawLine(x + w, h1 + 50, x + w + 50 + 100, h1 + 50);
            g.drawLine(x + w + 50, h1 + 50, x + w + 50, h1 - 25);
            g.drawLine(x + w + 50, h1 - 25, x - 50, h1 - 65);
            g.drawLine(x - 50, h1 - 65, x - 50, y + 75);
            g.drawLine(x - 50, y + 75, x, y + 75);
	} 

    public int getR() {
        return r;
    }

    public int getS() {
        return s;
    }

    public int getQ1() {
        return q1;
    }

    public int getQ2() {
        return q2;
    }
    
    
    
    public void setS() {
        if((s == 1) && (r == 1)){
            thread =  null;
            System.out.println("поток закончен");
        }
        if(s == 1){
            s = 0;
            if(r == 1){
                q1 = 0;
                q2 = 1;
            }
        } else
        {
            s = 1;
            if( r == 0){
                q1 = 1;
                q2 = 0;
            } else
            {
                System.out.println("момент 1 1");
                thread =  new Thread(this);
                thread.start();
            }
        }
        repaint();
    }
    
    public void setR() {
        if((s == 1) && (r == 1)){
            thread =  null;
            System.out.println("поток закончен");
        }
        if(r == 1){
            r = 0;
            if(s == 1){
                q1 = 1;
                q2 = 0;
            }
        } else
        {
            r = 1;
            if(s == 1){
                System.out.println("момент 1 1");
                thread =  new Thread(this);
                thread.start();
            } else
            {
                q1 = 0;
                q2 = 1;
            }
        }
        repaint();
    }
    
    public void run(){
        for(int i = 0; i < i + 1;i++){
            System.out.println("Поток запушен");
            if(q1 == 1){
                q1 = 0;
                q2 = 1;
            } else
            {
                q1 = 1;
                q2 = 0;
            }
            repaint();
            try {
                thread.sleep(100);
            } catch (InterruptedException ex) {
               System.out.println("Произошла ошабка в ран");
            }
            if((r != 1) || (s != 1))
                break;
        }
    }
   
    public static void main(String[] args) {
        TriggerRS ili = new  TriggerRS();
        Frame frame = new Frame("RS триггер");	
        frame.add(ili);
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
