package Mate;
public class Ejemplo{
    public int llenar(int n){
        int res=1;
        int b=0;
        int[] a= new int[n];
        for(int i=0; i<a.length;i++){
            a[i]=res++;
        }
        
        for(int i=0; i<a.length;i++){
            if(a[i]%2==0){
                    a[i]=0;
            }if(a[i]%5==0){
                    a[i]=0;
             }if(a[i]%3==0){
                    a[i]=0;
              }
        }
        
        for(int i=0; i<a.length;i++){
            if(a[i]!=0){
                System.out.println(a[i]);
                b++;
            }
        }
        return b;
    }
}