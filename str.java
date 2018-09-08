
/**
 * Write a description of class str here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class str
{
   String s;
   str()
   {
       s="";
    }
   int get(int a)
   {
      char c= this.s.charAt(a);
      
      int g =(int)c-48;
      return g;
      
    }
    void add(int b)
    {
        
       
        this.s=this.s+b;
                      
    }
    int size()
    {
        return s.length();
        
}
void remove()
{
if(size()==1)
{
s="";
}
else{
if(s.charAt(0)=='0')
{
int a =Integer.parseInt(s);
a=a/10;
s=0+Integer.toString(a);
}
else{
int a =Integer.parseInt(s);
a=a/10;
s=Integer.toString(a);
}
}

}
}
