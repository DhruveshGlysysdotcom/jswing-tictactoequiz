import javax.swing.*;
import java.awt.*;import java.util.*;
import java.awt.event.*;
/**
 * THe starting menu of the game.The game first starts here and you can go back to this menu from the 
 * TQuiz.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu
{
    
    TQ q;
    

    void main()
    {
        q =new TQ();
        Font f =new Font(null,Font.BOLD,35);
        final JFrame j = new JFrame("MENU");
        j.setSize(250,250);
        final GridLayout g =new GridLayout(2,1);
        g.setHgap(20);
        g.setVgap(40);
        j.setLayout(g);
        JPanel p =new JPanel();//JPanel jp =new JPanel(); 
        p.setLayout(new FlowLayout());
        JTextArea a =new JTextArea("TICTACQUIZ");a.setFont(f);
        //p.add(jp);
        a.setPreferredSize(new Dimension(220,220));
        p.add(a);
        a.setEnabled(false);
        q.setM(this);

        JPanel pa =new JPanel();
        GridLayout gl =new GridLayout(1,2);
        pa.setLayout(gl);
        gl.setHgap(20);
        gl.setVgap(40);
        JButton b =new JButton("Start"); 
        b.addActionListener(new ActionListener(){
                @Override
                public  void actionPerformed(ActionEvent e)
                {

                    q.s();
                    j.dispose();
                }         
            });
        JButton e =new JButton("Exit");   
        e.addActionListener(new ActionListener(){
                @Override
                public  void actionPerformed(ActionEvent e)
                {

                    j.dispose();
                    System.exit(0);
                }         
            });
        pa.add(b);
        pa.add(e);
        j.add(p);

        j.add(pa);
        j.setVisible(true);
    }
    
}