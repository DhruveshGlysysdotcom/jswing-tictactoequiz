import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * It is modified form of JFrame. It has the quiz and TicTacToe as the components. It is the place 
 * where the game is actually played.
 * 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TQ extends JFrame
{
    Menu m;
    TQ()
    {
        super("TICTACTOEQUIZ");
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setSize(2000,700);
        
    }

    void setM(Menu m)
    {
        this.m =m;

    }

    void s()
    {

        GridLayout g= new GridLayout(2,2);

        setLayout(g);
        Font f =new Font(null,Font.BOLD,80);
        JTextArea l =new JTextArea("PLAY");
        l.setFont(f);
        l.setBackground(new Color(0,0,200));
        JPanel p1 =new JPanel();
        p1.setLayout(new FlowLayout());
        JButton b =new JButton("TO MENU");
        b.setPreferredSize(new Dimension(150,50));
        b.addActionListener(new ActionListener(){
                @Override
                public  void actionPerformed(ActionEvent e)
                {
                    m.main();

                    dispose();
                }   
            });
        p1.add(b);
        JPanel p =new JPanel();
        p.setLayout(new FlowLayout());
        p.add(l);
        l.setEnabled(false);
        l.setForeground(new Color(0,200,0));
        Quiz q=new Quiz();q.adda();
        TicTacToe t =new TicTacToe(q,l);
        q.init(t);
        add(t);
        add(p);
        add(q);
        add(p1);
        t.s();
        setVisible(true);
    }
}
