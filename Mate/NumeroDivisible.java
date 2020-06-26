package Mate;

public class NumeroDivisible{
    private int[] Numero;
    private int[] Num;
    private int Num2;
    private int Num3;
    private int Num5;
    private int Num2y3;
    private int Num3y5;
    private int Num5y2;
    private int Num532;
    private int Num3no52;
    private int Num5no32;
    private int Num2no53;
    public NumeroDivisible(int n){
        llenarNumero(n);
        contarNumDiv2();
        contarNumDiv3();
        contarNumDiv5();
        contarNumDiv2y3();
        contarNumDiv3y5();
        contarNumDiv5y2();
        contarNumDiv532();
    }
    
    public void llenarNumero(int n){
        Numero = new int[n];
        Num = new int[n];
        for(int i=0; i <Numero.length;i++){
            Numero[i] = i+1;
            Num[i] = i+1;
        }
            
    }
    public int contarNumDiv2(){
        Num2=0;
        for(int i=0; i <Numero.length;i++){
            if(Numero[i]%2==0){
                Num[i]=-2;
                Num2=Num2+1;
            }
        }
        return Num2;
    }
    public int contarNumDiv3(){
        Num3=0;
        for(int i=0; i <Numero.length;i++){
            if(Numero[i]%3==0){
                Num[i]=-3;
                Num3=Num3+1;
            }
        }
        return Num3;
    }
    public int contarNumDiv5(){
        Num5=0;
        for(int i=0; i <Numero.length;i++){
            if(Numero[i]%5==0){
                Num[i]=-5;
                Num5=Num5+1;
            }
        }
        return Num5;
    }
    public int contarNumDiv2y3(){
        Num2y3=0;
        for(int i=0; i <Numero.length;i++){
            if(Numero[i]%3==0){
                Num2y3=Num2y3+1;
            }if(Numero[i]%5==0){
                Num2y3=Num2y3+1;
             }
        }
        return Num2y3;
    }
    public int contarNumDiv3y5(){
        Num3y5=0;
        for(int i=0; i <Numero.length;i++){
            if(Numero[i]%3==0){
               Num3y5=Num3y5+1;
            }if(Numero[i]%5==0){
                Num3y5=Num3y5+1;
            }
        }
        return Num3y5;
    }
    public int contarNumDiv5y2(){
        Num5y2=0;
        for(int i=0; i <Numero.length;i++){
            if(Numero[i]%3==0){
               Num5y2=Num5y2+1;
            }if(Numero[i]%5==0){
                Num5y2=Num5y2+1;
            }
        }
        return Num5y2;
    }
    public int contarNumDiv532(){
        Num532=0;
        for(int i=0; i <Numero.length;i++){
            if(Numero[i]%2==0){
                Num532++;
            }if(Numero[i]%3==0){
               Num532++;
            }if(Numero[i]%5==0){
                Num532++;
            }
        }
        return Num532;
    }
    public int contarNumDiv3no52(){
        Num3no52=0;
        for(int i=0; i <Numero.length;i++){
            if(Numero[i]%3==0){
            if(Numero[i]%2==0){
               Num532++;
            }if(Numero[i]%5==0){
                Num532++;
            }
          }
        }
        return Num532;
    }
    public int contarNumDiv5no32(){
        Num532=0;
        for(int i=0; i <Numero.length;i++){
            if(Numero[i]%2==0){
                Num532++;
            }if(Numero[i]%3==0){
               Num532++;
            }if(Numero[i]%5==0){
                Num532++;
            }
        }
        return Num532;
    }
    public int contarNumDiv2no53(){
        Num532=0;
        for(int i=0; i <Numero.length;i++){
            if(Numero[i]%2==0){
                Num532++;
            }if(Numero[i]%3==0){
               Num532++;
            }if(Numero[i]%5==0){
                Num532++;
            }
        }
        return Num532;
    }
}
