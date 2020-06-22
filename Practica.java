class Practica{
    public int Practica(int a, int b){
        int res;
        if(b>1){
            res=a*Practica(a,b-1);
        }else{
            res=a;
        }
        return res;
    }
    

}
