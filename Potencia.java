class Potencia{
    public int Practica(int a, int b){
        int res;
        if(b==0){
            res=1;
        }else{
            res=a*Practica(a,b-1);
        }
        return res;
    }
}
