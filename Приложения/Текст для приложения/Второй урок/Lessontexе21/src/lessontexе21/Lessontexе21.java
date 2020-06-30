/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessontexе21;

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
public class Lessontexе21 extends JComponent{
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
        g.drawString("Триггер",x + 350,y - 60);
        g.drawString("",x + 250,y - 30);
        g.drawString("Триггером называют логическую схему с положительной обратной связью,",x,y);
        g.drawString("имеющую два устойчивых состояния, которые называются единичным и",x,y + 30);
        
        g.drawString("нулевым и обозначаются 1 и 0 (триггер обладает свойством памяти).",x,y + 60);
        
        g.drawString("В общем случае триггер может иметь асинхронные входы предварительной",x,y + 120);
        
        g.drawString("установки, тактовый или синхронизирующий и информационные входы.",x,y + 150);
        
        g.drawString("К основным типам триггеров относятся:",x,y + 210);
        g.drawString("- триггер с раздельной установкой состояний (RS-триггер),",x,y + 240);
        g.drawString("- триггер «защелка» (D-триггер),",x,y + 270);
        g.drawString("- универсальный триггер (JK-триггер)",x,y + 300);
        g.drawString("- триггер со счетным входом (Т-триггер).",x,y + 330);
        g.drawString("По способу записи информации триггеры подразделяются на асинхронные и",x,y + 390);
        g.drawString("синхронные, или тактируемые, а по способу управления на триггеры со",x,y + 420);
        g.drawString("статическим управлением (единичным или реже нулевым уровнем тактового",x,y + 450);
        g.drawString("сигнала) и триггеры с динамическим управлением (положительным - из 0 в или",x,y + 480);
        g.drawString("отрицательным - из в фронтом тактового сигнала). В последнем случае говорят",x,y + 510);
        g.drawString("о триггерах с прямым или инверсным динамическим входом управления.",x,y + 540);
        g.drawString("Для задания единичного сигнала на синхровходе тригтера необходимо",x,y + 600);
        g.drawString("включить и выключить тумблер (ключ).",x,y + 630);
        g.drawString("При известной принципиальной схеме комбинационного узла достаточно путём",x,y + 690);
        g.drawString("перебора всех возможных состояний входных сигналов составить таблицу",x,y + 720);
        g.drawString("истинности выходных сигналов, что позволяет затем выполнить анализ работы",x,y + 750);
        g.drawString("устройства.",x,y + 780);      
    }
    
       public static void main(String[] args) {
        Lessontexе21 lessontexе21 = new  Lessontexе21();
        Frame frame = new Frame("Триггер Д-T");	
        frame.add(lessontexе21);
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
