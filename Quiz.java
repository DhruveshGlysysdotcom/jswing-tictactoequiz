import javax.swing.*;
import java.awt.*;
import java.util.*;

import java.awt.event.*;

/**
 * It is a modified form of JPanel specially for the TQ class and this project. It is used as a component in
 * the TQ window. It is a quiz in a jpanel.
 * 
 * @author (Dhruvesh) 
 * @version (1.0)
 */
public class Quiz extends JPanel 
{
    Color c;
    int q;ArrayList al;
    final  JButton[] j =new JButton[4];
    Random r ;

    final JPanel p ;
    JTextArea ta;
    JButton abc ;
    int ox ;

    String x[] =
        {"What is capital of india","Which is the tallest peak",

          
        
            "Radiocarbon is produced in the atmosphere as a result of",
            "It is easier to roll a stone up a sloping road than to lift it vertical upwards because",
            "The absorption of ink by blotting paper involves",
            "Siphon will fail to work if",
            "Large transformers, when used for some time, become very hot and are cooled by circulating oil. The heating of the transformer is due to",
            "Nuclear sizes are expressed in a unit named"

        
        ,"What is part of a database that holds only one type of information?",
            "'OS' computer abbreviation usually means ?",
            "In which decade with the first transatlantic radio broadcast occur?",
            "'.MOV' extension refers usually to what kind of file?",

  
     
            "Former Australian captain Mark Taylor has had several nicknames over his playing career. Which of the following was NOT one of them?",
            "Which was the 1st non Test playing country to beat India in an international match?",
            "Which county did Ravi Shastri play for?",
            "Who was the first Indian to win the World Amateur Billiards title?", 
            "Who is the first Indian woman to win an Asian Games gold in 400m run?"

        ,"Grand Central Terminal, Park Avenue, New York is the world's",
            "Entomology is the science that studies",
            "Garampani sanctuary is located at",
            "For which of the following disciplines is Nobel Prize awarded?",
            "Hitler party which came into power in 1933 is known as",


            "Exposure to sunlight helps a person improve his health because",
            "Golf player Vijay Singh belongs to which country?",
            "Guarantee to an exporter that the importer of his goods will pay immediately for the goods ordered by him, is known as",
            "First Afghan War took place in",
            "Gulf cooperation council was originally formed by",
            "First China War was fought between",


            "Who wrote the famous book - 'We the people'?",
            "Who is the author of the book 'Nineteen Eighty Four'?",
            "Which of the following is NOT written by Munshi Premchand?",


            "The Battle of Plassey was fought in",
            "The territory of Porus who offered strong resistance to Alexander was situated between the rivers of",
            "Under Akbar, the Mir Bakshi was required to look after",
            "Tripitakas are sacred books of",
            "The trident-shaped symbol of Buddhism does not represent",



            "What is the predominant type of Indian agriculture?",
            "The Radcliffe line is a boundary between",
            "Which of the following has a potential for harnessing of tidal energy in India?",
            "The typical area of sal forest in the Indian peninsular upland occurs",
            "The state having a largest area of forest cover in India is",

        };
    int can[]={0,2,0,3,1,1,2,0,1,2,3,1,3,1,0,1,2,0,1,1,3,1,3,1,0,0,0,0,3,2,2,0,1,0,0,0,3,0,0,3,2};
    String ca[][]={{"Delhi","Mumbai","Chennai","Bangalore"},{"k2","himalaya","Everest","Fiji"},

    
    
            {"collision between fast neutrons and nitrogen nuclei present in the atmosphere","action of ultraviolet light from the sun on atmospheric oxygen","action of solar radiations particularly cosmic rays on carbon dioxide present in the atmosphere","lightning discharge in atmosphere"},
            {"work done in rolling is more than in lifting","work done in lifting the stone is equal to rolling it","work done in both is same but the rate of doing work is less in rolling","work done in rolling a stone is less than in lifting it"},
            {"viscosity of ink","capillary action phenomenon","diffusion of ink through the blotting","siphon action"},
            {"the densities of the liquid in the two vessels are equal","the level of the liquid in the two vessels are at the same height","both its limbs are of unequal length","the temperature of the liquids in the two vessels are the same"},
            {"the heating effect of current alone","hysteresis loss alone","both the heating effect of current and hysteresis loss","intense sunlight at noon"},
            {"Fermi","angstrom","newton","tesla"},

    
            {"Report","Field","Record","File"},
            {"Order of Significance","Open Software","Operating System","Optical Sensor"},
            {"1850s","1860s","1870s","1900s"},{"Image file","MS Office document","Audio file","MS Office document"},

    
    
    
    
            {"Tubby","Stodge","Helium Bat","Stumpy"},{"Canada","Sri Lanka","Zimbabwe","East Africa"}
        ,{"Glamorgan","Leicestershire","Gloucestershire","Lancashire",},
            {"Geet Sethi","Wilson Jones","Michael Ferreira","Manoj Kothari"},{"M.L.Valsamma","P.T.Usha","Kamaljit Sandhu","K.Malleshwari"},

      
    
            {"largest railway station","highest railway station","longest railway station","None of the above"},
            {"Insects","The origin and history of technical and scientific terms","The formation of rocks","Europe"},
            {"Junagarh, Gujarat","Diphu, Assam","Kohima, Nagaland","Gangtok, Sikkim",},
            {"Physics and Chemistry","Physiology or Medicine","Literature, Peace and Economics","All of the above"},
            {"Labour Party","Nazi Party","Ku-Klux-Klan","Democratic Party"},


            {"the infrared light kills bacteria in the body","resistance power increases","the pigment cells in the skin get stimulated and produce a healthy tan","the ultraviolet rays convert skin oil into Vitamin D"},
            {"USA","Fiji","India","UK"},
            {"Letter of Credit (L/C)","laissezfaire","inflation","None of the above"},
            {"1839","1840","1833","1848"},
            {"Bahrain, Kuwait, Oman, Qatar, Saudi Arabia and United Arab Emirates","Second World Nations","Third World Nations","Fourth World Nations",},
            {"China and Britain","China and France","China and Egypt","China and Greek"},


            {"T.N.Kaul","J.R.D. Tata","Khushwant Singh","Nani Palkhivala"},
            {"Thomas Hardy","Emile Zola","George Orwell","Walter Scott"},
            {"Gaban","Godan","Guide","Manasorovar"},

            {"1757","1782","1748","1764"},
            {"Sutlej and Beas","Jhelum and Chenab","Ravi and Chenab","Ganga and Yamuna"},
            {"military affairs","the state treasury","the royal household","the land revenue system"},
            {"Buddhist","Hindus","Jains","None of the above"},
            {"Nirvana","Sangha","Buddha","Dhamma"},

            {"Commercial agriculture","Extensive agriculture","plantation agriculture","subsistence agriculture"},
            {"India and Pakistan","India and China","India and Myanmar","India and Afghanistan"},
            {"Gulf of Cambay","Gulf of Mannar","Backwaters of Kearla","CHilka Lake"},
            {"on the western ghats","between the Tapti and the Narmada","to the north-east of the Godavari","on the Malwa plateau"},
            {"Arunachal Pradesh","Haryana","Madhya Pradesh","Assam"}

        };
    TicTacToe to;
    Quiz()
    {

     
        p=new JPanel();
        ta=new JTextArea();
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        
        ta.setForeground(new Color(0,0,0));
        ta.setEnabled(false);
        p.setLayout(new FlowLayout());
        p.add(ta);
        p.setVisible(true);

        for(int i=0;i<4;i++)
        {
            j[i]=new JButton();

        }
        r= new Random();
        al =new ArrayList();

        this.q =q;
        
        JPanel pb =new JPanel();
        for(int i=0;i<4;i++)
        {
            pb.add(j[i]);
        }
        pb.setLayout(new GridLayout(2,2));
        setLayout(new GridLayout(2,1));
        add(p);
        add(pb);
        setSize(800,500);
    }





    int cq(int qq)
    {
        boolean b=false;int rq=0;;boolean run=true;
        while(run)
        {
            for(int i=0;i<al.size();i++)
            {
                if(qq==al.get(i))
                {
                    b=true;
                    
                    break;
                    
                }
                
            }
            
            
            
            if(b==false)
            {
                
                rq=qq;
                al.add(rq);
                run =false;
                
            }
            else if(b)
            {
                
                qq=r.nextInt(40);
                b=false;
                
            }
        }
        return rq;
    }





    void start(JButton jb,int o)
    {
        enablec();
        to.disableb();
        inba();
        abc=jb;
        ox=o;

        this.q= r.nextInt(40);
        if(al.size()>0)
        {
            this.q= cq(this.q);
        }
        else if(al.size()==0)
        {
            al.add(this.q);
        }
        ta.setText(x[this.q]); 

        Color c=j[0].getBackground();this.c=c;
        
        for(int i=0;i<4;i++)
        {
            j[i].setText(ca[q][i]);
        }

       
    }

    void adda()
    {

        j[0].addActionListener(new ActionListener(){
                @Override
                public  void actionPerformed(ActionEvent e)
                {
                    if(ca[q][can[q]].equals(j[0].getText()))
                    {

                        p.setBackground(new Color(0,100,0));
                        to.set(abc,true,ox);
                    }
                    else
                    {

                        p.setBackground(new Color(100,0,0));
                        to.set(abc,false,ox);
                    }
                }         
            });
        j[1].addActionListener(new ActionListener(){
                @Override
                public  void actionPerformed(ActionEvent e)
                {

                    if(ca[q][can[q]].equals(j[1].getText()))
                    {

                        p.setBackground(new Color(0,100,0));
                        to.set(abc,true,ox);
                    }
                    else
                    {

                        p.setBackground(new Color(100,0,0));
                        to.set(abc,false,ox);
                    }

               
                }         
            });
        j[2].addActionListener(new ActionListener(){
                @Override
                public  void actionPerformed(ActionEvent e)
                {

                    if(ca[q][can[q]].equals(j[2].getText()))
                    {

                        p.setBackground(new Color(0,100,0));
                        to.set(abc,true,ox);
                    }
                    else
                    {

                        p.setBackground(new Color(100,0,0));
                        to.set(abc,false,ox);
                    }

               
                }         
            });
        j[3].addActionListener(new ActionListener(){
                @Override
                public  void actionPerformed(ActionEvent e)
                {

                    if(ca[q][can[q]].equals(j[3].getText()))
                    {

                        p.setBackground(new Color(0,100,0));
                        to.set(abc,true,ox);
                    }
                    else
                    {

                        p.setBackground(new Color(100,0,0));
                        to.set(abc,false,ox);
                    }

               
                }         
            });
    }

    
    void disablec()
    {
        for(int i=0;i<4;i++)
        {
            j[i].setEnabled(false);
        }
    }

    void enablec()
    {
        for(int i=0;i<4;i++)
        {
            j[i].setEnabled(true);
        }

    }

    void inba()
    {

        p.setBackground(c);

    }

    void init(TicTacToe to)
    {
        this.to=to;

    }

}