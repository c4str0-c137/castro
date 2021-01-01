package Elementos;
public class NodoDEF<T>{
    private NodoDEF<T> ant, suc;
    private int frecuencia;
    private T dato;
    public NodoDEF(T d){
        dato = d;
        ant = suc = null;
        frecuencia = 1;
    }
    public NodoDEF<T> getAnt(){
        return ant;
    }
    public NodoDEF<T> getSuc(){
        return suc;
    }
    public T getDato(){
        return dato;
    }
    public int getFrecuencia(){
        return frecuencia;
    }
    public void  setAnt(NodoDEF<T> a){
        ant = a;
    }
    public void  setSuc(NodoDEF<T> s){
        suc = s;
    }
    public void setDato(T d){
        dato = d;
    }
    public void aumentar(){
        frecuencia++;
    }
    public void disminuir(){
        frecuencia--;
    }
}
