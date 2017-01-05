
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
public class Animate2 extends JPanel implements Runnable
{
  JLabel label;
  String str;
  public Animate2(String texte)
  	{
    super();
    str=texte;
    label = new JLabel(texte);
    label.setFont(new java.awt.Font(Font.SANS_SERIF, Font.BOLD, 36));
    label.setForeground(Color.MAGENTA);
    add(label);
    Thread t = new Thread(this);
    t.start();
  }
  public void run(){
    while(true){
        char c = str.charAt(0);
        String rest = str.substring(1);
        str = rest + c;
        label.setText(str);
        try{
            Thread.sleep(200);
        }catch(InterruptedException e){ e.printStackTrace();}
    }
  }
    	public static void main (String[] args)
    		{
  JFrame frame=new JFrame("Text Animation")	;
    		 JPanel policePanel=new Animate2("My Sample Text ");
    		 frame.add(policePanel);
    		 frame.setSize(300,200);
    		 frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    		 frame.setVisible(true);
            }
 }
