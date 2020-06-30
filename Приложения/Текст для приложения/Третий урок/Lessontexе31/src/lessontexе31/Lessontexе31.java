/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessontexе31;

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
public class Lessontexе31 extends JComponent {
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
        g.drawString("Триггеры с динамическим управлением",x + 250,y - 30);

        g.drawString("Отдельный класс триггеров составляют триггеры с динамическим управлением.",x,y + 30);
        g.drawString("Такие триггеры реагируют на информационные сигналы только",x,y + 60);
        g.drawString("в момент изменения сигнала \"С\" либо от 0 к 1 (прямой динамический",x,y + 90);
        g.drawString("вход) либо от 1 к 0 (инверсный динамический вход). Условно-графическое",x,y + 120);
        g.drawString("обозначение входов таких триггеров имеет вид:",x,y + 150);
        Image image = new ImageIcon("F:\\Джава Схемотехника\\Приложения\\Текст для приложения\\Третий урок\\Картинки\\337.png").getImage();
        g.drawImage(image, x1, y + 150, this);
        g.drawString("Триггеры с динамическим управлением обычно исполняются одноступенчатыми.",x,y + 300);
        g.drawString("Они состоят из бистабильной ячейки и коммутирующих элементов ",x,y + 330);
        g.drawString("(1 или 2-х триггеров). Коммутирующие элементы обеспечивают прием информации",x,y + 360);
        g.drawString("и ее передачу в выходной триггер при изменении сигнала  \"С\" от 0 к 1",x,y + 390);
        g.drawString("(или от 1 к 0) и осуществление с этого момента самоблокировки",x,y + 420);
        g.drawString("входов от воздействия информационного сигнала.",x,y + 450);
        g.drawString("D триггеры, работающие по фронту  (динамические",x1,y + 510);
        g.drawString("D триггеры)",x1 + 200,y + 540);
        g.drawString("Основным недостатком простейшего D-триггера (защелки), рассмотренного в",x,y + 600);
        g.drawString("предыдущей статье, является наличие режима \"прозрачности\". Пока на входе",x,y + 630);
        g.drawString("синхронизации присутствует высокий потенциал, триггер записывает входную",x,y + 660);
        g.drawString("информацию. Для того, чтобы избежать прохождения входного сигнала на выход",x,y + 690);
        g.drawString("схемы приходится на вход триггера подавать очень узкие импульсы.",x,y + 720);
        g.drawString("Фронт сигнала синхронизации, в отличие от высокого (или низкого) потенциала,",x,y + 780);
        g.drawString("не может длиться продолжительное время. В идеальном случае длительность",x,y + 810);
        g.drawString("фронта импульса равна нулю. Поэтому в триггере, запоминающем входную",x,y + 840);
        g.drawString("информацию по фронту не нужно предъявлять требования к длительности тактового",x,y + 870);
        g.drawString("сигнала.",x,y + 900);
        
    }
    
       public static void main(String[] args) {
        Lessontexе31 lessontexе31 = new  Lessontexе31();
        Frame frame = new Frame("Триггер Д-T");	
        frame.add(lessontexе31);
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
