import java.nio.channels.ClosedSelectorException;

//import javax.lang.model.util.ElementScanner14;

public class Count {
    public static void main(String[] args){
        String str = "sravani";
        char ch = 'e';
         int count = 0;
         for(int i=0;i< str.length();i++)
         {

    
             if( ch == str.charAt(i)){

             
               count ++;
            

         
        }
        System.out.println("count " + count);
    }

}