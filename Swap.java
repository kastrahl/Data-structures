import java.util.*;
public class Swap{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter you full name");
        String name = s.nextLine();
        int i=0;
        name=name.trim();
        String firstname="",lastname="";
       //for(i=0;i<name.length();i++){
            while(name.charAt(i)!=' '){
                firstname += String.valueOf(name.charAt(i++));
                //string = string.appeand() String
            }
            while(i<name.length()){
                lastname += String.valueOf(name.charAt(i++));
                //string = string.appeand() String
            }
            /*flag=1;
            if(flag==1){
                lastname += String.valueOf(name.charAt(i));
            }*/
        //}
        System.out.println(lastname+" "+firstname);
    }
}