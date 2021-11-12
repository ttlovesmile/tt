package work;

public class Count{
    public static void main(String args[]){
        int j=0;
        char x='n'; 
        String s="want you to know one thing";
        char a[]=s.toCharArray();
        for(int i=0;i<a.length;i++){
            if(x==a[i]){
                j++;
            }
         
        }
            System.out.println("瀛楁瘝n鐨勫嚭鐜版鏁�:"+j);
    }
}
	