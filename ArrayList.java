
/**
 * It is used for storing question numbers. It is consists of a String.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayList
{
String s;
   ArrayList()
   {
       s="";
    }
   int get(int a)
   {
      char c= this.s.charAt(a);
      int g =(int)c;
      return g;
      
    }
    void add(int b)
    {
        char c = (char)b;
       
        this.s=this.s+c;
                      
    }
    int size()
    {
        return s.length();
        
}
}
