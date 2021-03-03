import java.util.Scanner;
public class StringReverse {
  
    static public String reverse(String str)
    {
        //complete the function here
        int j=str.length()-1;
        String rev="";
        char a[] =new char[j+1];
        int i=0;
        char c;
        while(j!=0)
        {
             c=str.charAt(j);
            
            if((j>=0) && (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            {
                rev=rev+c;
                j--;
            }
            else
            {
              a[j]=c;
              j--;
            }
           
            
            
        }
        c=str.charAt(0);
        if((j==0) && (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            {
                rev=rev+str.charAt(0);
            }
            else
             a[0]=str.charAt(0);
        for (j=0;j<=a.length-1;j++)
        {
            if(a[j]=='\0')
            {
                a[j]=rev.charAt(i);
                i++;
                
            }
            else
               continue;
        }
       String b=new String(a);
        return b;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String rever=reverse(str);
        System.out.println(rever);
        s.close();
    }
}
