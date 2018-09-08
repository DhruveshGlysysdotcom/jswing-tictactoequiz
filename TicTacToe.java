import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class TicTacToe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TicTacToe extends JPanel   
{
    Quiz q;str al =new str();JTextArea l;
    public TicTacToe(Quiz q,JTextArea l)
    {
        this.q=q;this.l =l;
    }
    int i;JButton j[] =new JButton[9];
    void s()
    {
        Font f =new Font(null,Font.BOLD,80);

        for(int i=0;i<9;i++)
        {
            j[i]=new JButton();
            j[i].setFont(f);
            j[i].setPreferredSize(new Dimension(70,70));
        }

        
        setLayout(new GridLayout(3,3));

       
        j[0].addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    j[0].setEnabled(false);al.add(0);
                    q.start(j[0],i);

            
                    i++;
                }
            });

        j[1].addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    j[1].setEnabled(false);al.add(1);
                    q.start(j[1],i);

                    i++;
                }

            });
        j[2].addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    j[2].setEnabled(false);al.add(2);
                    q.start(j[2],i);

                    i++;
                }

            });
        j[3].addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    j[3].setEnabled(false);al.add(3);
                    q.start(j[3],i);

                    i++;
                }

            });j[4].addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    j[4].setEnabled(false); al.add(4);
                    q.start(j[4],i);

                    i++;
                }

            });
        j[5].addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    j[5].setEnabled(false);al.add(5);
                    q.start(j[5],i);

                    i++;
                }

            });j[6].addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    j[6].setEnabled(false);al.add(6);
                    q.start(j[6],i);

                    i++;
                }

            });
        j[7].addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    j[7].setEnabled(false);al.add(7);
                    q.start(j[7],i);

                    i++;
                }

            });
        j[8].addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    j[8].setEnabled(false);al.add(8);
                    q.start(j[8],i);

                    i++;
                }

            });

        for(int i=0;i<=8;i++)
            add(j[i]);

        
        
    }

    void disableb()
    {
        for(int i=0;i<=8;i++)
        {
            j[i].setEnabled(false);
        }
    }

    void enableb()
    {
        boolean c=false;
        for(int i=0;i<=8;i++)
        {
            for(int j=0;j<al.size();j++)
            {if(al.get(j)==i)
                {
                    c=true;
                    break;
                }

            }
            if(c)
            {
                c=false;
                continue;

            }
            else
            {
                j[i].setEnabled(true);
            }
        }
    }

    int check()
    {
        int w=0;
        if(al.size()==9)
        {
            w=3;
        }
        if(j[0].getText().equals("X")&&j[1].getText().equals("X")&&j[2].getText().equals("X"))
        {
            j[0].setBackground(new Color(200,0,0));j[1].setBackground(new Color(200,0,0));j[2].setBackground(new Color(200,0,0));
            w=1;
        }
        else if(j[3].getText().equals("X")&&    j[4].getText().equals("X")&&    j[5].getText().equals("X")) 
        {
            j[3].setBackground(new Color(200,0,0));j[4].setBackground(new Color(200,0,0));j[5].setBackground(new Color(200,0,0));
            w=1;
        }
        else if(j[6].getText().equals("X")&&    j[7].getText().equals("X")&&    j[8].getText().equals("X"))
        {
            j[6].setBackground(new Color(200,0,0));j[7].setBackground(new Color(200,0,0));j[8].setBackground(new Color(200,0,0));
            w=1;
        }
        else if(j[0].getText().equals("X")&&    j[3].getText().equals("X")&&    j[6].getText().equals("X"))
        {
            j[0].setBackground(new Color(200,0,0));j[3].setBackground(new Color(200,0,0));j[6].setBackground(new Color(200,0,0));
            w=1;
        }
        else if(j[1].getText().equals("X")&&    j[4].getText().equals("X")&&    j[7].getText().equals("X"))
        {
            j[1].setBackground(new Color(200,0,0));j[4].setBackground(new Color(200,0,0));j[7].setBackground(new Color(200,0,0));
            w=1;
        }
        else if(j[2].getText().equals("X")&&    j[5].getText().equals("X")&&    j[8].getText().equals("X"))
        {
            j[2].setBackground(new Color(200,0,0));j[5].setBackground(new Color(200,0,0));j[8].setBackground(new Color(200,0,0));
            w=1;
        }
        else if(j[0].getText().equals("X")&&    j[4].getText().equals("X")&&    j[8].getText().equals("X"))
        {
            j[0].setBackground(new Color(200,0,0));j[4].setBackground(new Color(200,0,0));j[8].setBackground(new Color(200,0,0));
            w=1;
        }
        else if(j[2].getText().equals("X")&&    j[4].getText().equals("X")&&    j[6].getText().equals("X"))
        {
            j[2].setBackground(new Color(200,0,0));j[4].setBackground(new Color(200,0,0));j[6].setBackground(new Color(200,0,0));
            w=1;
        }
        else if(j[0].getText().equals("O")&&j[1].getText().equals("O")&&j[2].getText().equals("O"))
        {
            j[0].setBackground(new Color(200,0,0));j[1].setBackground(new Color(200,0,0));j[2].setBackground(new Color(200,0,0));
            w=2;
        }
        else if(j[3].getText().equals("O")&&    j[4].getText().equals("O")&&    j[5].getText().equals("O"))
        {
            j[3].setBackground(new Color(200,0,0));j[4].setBackground(new Color(200,0,0));j[5].setBackground(new Color(200,0,0));
            w=2;
        }
        else if(j[6].getText().equals("O")&&    j[7].getText().equals("O")&&    j[8].getText().equals("O"))
        {
            j[6].setBackground(new Color(200,0,0));j[7].setBackground(new Color(200,0,0));j[8].setBackground(new Color(200,0,0));
            w=2;
        }
        else if(j[0].getText().equals("O")&&    j[3].getText().equals("O")&&    j[6].getText().equals("O"))
        {
            j[0].setBackground(new Color(200,0,0));j[3].setBackground(new Color(200,0,0));j[6].setBackground(new Color(200,0,0));
            w=2;
        }
        else if(j[1].getText().equals("O")&&    j[4].getText().equals("O")&&    j[7].getText().equals("O"))
        {
            j[1].setBackground(new Color(200,0,0));j[4].setBackground(new Color(200,0,0));j[7].setBackground(new Color(200,0,0));
            w=2;
        }
        else if(j[2].getText().equals("O")&&    j[5].getText().equals("O")&&    j[8].getText().equals("O"))
        {
            j[2].setBackground(new Color(200,0,0));j[5].setBackground(new Color(200,0,0));j[8].setBackground(new Color(200,0,0));
            w=2;
        }
        else if(j[0].getText().equals("O")&&    j[4].getText().equals("O")&&    j[8].getText().equals("O"))
        {
            j[0].setBackground(new Color(200,0,0));j[4].setBackground(new Color(200,0,0));j[8].setBackground(new Color(200,0,0));
            w=2;
        }
        else if(j[2].getText().equals("O")&&    j[4].getText().equals("O")&&    j[6].getText().equals("O"))
        {
            j[2].setBackground(new Color(200,0,0));j[4].setBackground(new Color(200,0,0));j[6].setBackground(new Color(200,0,0));
            w=2;

        }
        return w;
    }

    void set(JButton k,boolean b,int i)
    {
        if(i==41)
        {
            l.setText("Q's over start again");
            q.disablec();
            disableb();
        }
        if(i==3)
        {
            l.setText("tie start again");
        }
        if(b==true)
        {
            if(i%2==0)
            {

                k.setText("X");
                l.setText("O PLAY");
            }
            else 
            {
                k.setText("O");
                l.setText("X PLAY");
            }
            

            q.disablec();
            enableb();
            int check=check();
            if(check==1)
            {
                l.setText("X WON!!");
                disableb();
            }
            else if(check==2)
            {
                l.setText(" O WON!!");
                disableb();
            }

        }
        else 
        {
            if(i%2==0)
            {

                l.setText("O PLAY");
            }
            else 
            {

                l.setText("X PLAY");
            }
            al.remove();
            enableb();
            q.disablec();
            k.setEnabled(true);
        }

    }
}