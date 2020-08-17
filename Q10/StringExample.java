package Q10;

public class StringExample {
    
    public static void StrConcat(String x) 
    { 
        x = x + "Musab"; 
    } 
   
    public static void StrBufConcat(StringBuffer str2) 
    { 
        str2.append("Nassar"); 
    } 
   
     
   
    public static void main(String[] args) 
    { 
        String str1 = "Hello!"; 
        StrConcat(str1); 
        System.out.println("The final String is - " + str1); 
   
        StringBuffer str2 = new StringBuffer("Hello!"); 
        StrBufConcat(str2); 
        System.out.println("The final String is - " + str2); 
   
        
    } 
}