

/*




 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticbinding;

  
/**
 *
 * @author Younis
 */
public class STATICBINDING 
{
    public static class Superclass
    {
        static void println()
        {
            System.out.println("HI");
            
        }
    }
    
      public static class Subclass extends Superclass
      {
          static void println()
          {
              System.out.println("Hello");
          
          
      }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       Superclass A = new Superclass();
       Superclass B = new Superclass();
       
       A.println();
       B.println();
        
        
        // TODO code application logic here
    }
    
}
