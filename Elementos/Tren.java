package Elementos;
public class Tren<T extends Comparable<T>>{
    private NodoDEF<T> ini, med, fin;
    private int largo, medio;
    
    public Tren(){
        ini = med = fin = null;
        medio = 0;
        largo = 0;
    }
    
    public boolean esVacia(){
        return ini == null;
    }
    
    private void calcularMedio(){
        NodoDEF<T> aux = ini;
        int medioAux = 1;
        medio=largo/2;
        while(aux.getSuc() != null){
            if(medioAux==medio){
                med = aux;
            }
            medioAux++;
            aux = aux.getSuc();
        }
    }
    private void calcularFin(){
        NodoDEF<T> aux = ini;
        while(aux.getSuc() != null){
            aux = aux.getSuc();
        }
        fin = aux;
    }
    
    public void insertar(T dato){
        if(esVacia()){
            insertarSinOrden(dato);
        }else{
            NodoDEF<T> ult = ini;
            NodoDEF<T> nuevo = new NodoDEF(dato);
            Comparable<T> comp = ((Comparable<T>)dato);
            boolean encontrado = false;
            while(ult != null && encontrado == false){
                if(comp.compareTo(ult.getDato()) == 0){
                    ult.aumentar();
                    encontrado = true;
                }
                ult = ult.getSuc();
            }
            NodoDEF<T> aux = ini;
            if(!encontrado){
                while(aux != null && encontrado != true){
                    if(comp.compareTo(aux.getDato()) < 0){
                        if(aux.getAnt()==null){
                            nuevo.setSuc(ini);
                            ini.setAnt(nuevo);
                            ini=nuevo;
                            largo++;
                            medio=largo/2;
                            encontrado = true;
                        }  
                    }else if(comp.compareTo(aux.getDato()) > 0 && aux.getSuc()==null){
                        aux.setSuc(nuevo);
                        nuevo.setAnt(aux);
                        fin=nuevo;
                        largo++;
                        medio=largo/2;
                        encontrado = true;
                     }
                    aux=aux.getSuc();
                }
                if(!encontrado){
                    NodoDEF<T> actual = ini;
                    while(comp.compareTo(actual.getDato())!=-1){
                        actual = actual.getSuc();
                    }
                    NodoDEF<T> ante = actual.getAnt();
                    ante.setSuc(nuevo);
                    nuevo.setSuc(actual);
                    nuevo.setAnt(ante);
                    actual.setAnt(nuevo);
                    largo++;
                }
            }
            aux = ini;
            calcularMedio();
            calcularFin();
        }
        
    }
    public void insertarSinOrden(T dato){
        if(esVacia()){
            ini = new NodoDEF(dato);
            med = ini;
            fin = ini;
            largo = 1;
            medio = 1;
        }else{
            NodoDEF<T> ult = ini;
            NodoDEF<T> nuevo = new NodoDEF(dato);
            Comparable<T> comp = ((Comparable<T>)dato);
            boolean encontrado = false;
            while(ult != null && encontrado == false){
                if(comp.compareTo(ult.getDato()) == 0){
                    ult.aumentar();
                    encontrado = true;
                } else if(!encontrado && ult.getSuc()==null){
                    ult.setSuc(nuevo);
                    nuevo.setAnt(ult);
                    fin=nuevo;
                    largo++;
                    encontrado = true;
            }
                ult = ult.getSuc();
            }
            calcularMedio();
        }
        
    }
    public T eliminar(T dato){
        T res = null;
        if(esVacia())
            res = null;
        else{
            NodoDEF<T> aux = ini;
            NodoDEF<T> nuevo = new NodoDEF<T>(dato);
            Comparable<T> comp = ((Comparable<T>)dato);
            boolean encontrado = false;
            while(aux != null && encontrado == false){
                if(comp.compareTo(aux.getDato())==0){
                    encontrado = true;
                } else{
                    aux = aux.getSuc();
                }
            }
            if(encontrado){
                boolean eliminado = false;
                if(aux.getFrecuencia()>1){
                    aux.disminuir();
                    res = aux.getDato();
                    eliminado = true;
                } else if(aux.getFrecuencia()==1 && eliminado == false){
                    NodoDEF<T> ant = aux.getAnt();
                    NodoDEF<T> sig = aux.getSuc();
                    if(ant != null)
                        ant.setSuc(sig);
                    if(sig != null)
                        sig.setAnt(ant);
                    if(aux == ini)
                        ini = sig;
                    aux.setAnt(null);
                    aux.setSuc(null);
                    res = aux.getDato();
                    largo = largo -1;
                }
            }
        }
        calcularMedio();
        calcularFin();
        return res;
    }
    public T medio(){
        T elDato;
        if(esVacia())
            elDato = null;
        else
            elDato = med.getDato();
        return elDato;
    }
    public String toString(){
        String reporte = "";
        NodoDEF<T> q;
        if(esVacia()){
            reporte = "{}";
        }else{
            reporte = "{";
            q = ini;
            while(q != fin){
                reporte = reporte + mostrar(q) + ", ";
                q = q.getSuc();
            }    
            reporte = reporte + mostrar(fin);
            reporte = reporte + "}";
        }
        return reporte;
    }
    private String mostrar(NodoDEF<T> q){
        String reporte;
        reporte = "";
        for(int i = 0; i < q.getFrecuencia()-1; i++)
            reporte = reporte + q.getDato() + ", ";
        return reporte + q.getDato();
    }
    public T acceder(int pos){
        T res;
        if(esVacia() || pos >= largo)
            res = null;
        else{
            NodoDEF<T> nodo = ini;
            while(pos > 0){
                pos--;
                nodo = nodo.getSuc();
            }
            res = nodo.getDato();
        }
        return res;
    }
    public void reemplazar(int pos, T dato){
        if(!esVacia() && pos < largo){
            NodoDEF<T> nodo = ini;
            while(pos > 0){
                pos--;
                nodo = nodo.getSuc();
            }
            nodo.setDato(dato);
        }
    }
    public void intercambiar(int pos1, int pos2){
        if(pos1 < largo && pos2 < largo){
            T dato1 = acceder(pos1);
            T dato2 = acceder(pos2);
            reemplazar(pos1, dato2);
            reemplazar(pos2, dato1);
            
        }
    }
    public T eliminar1(int pos){
        T res;
        if(esVacia() || pos >= largo )
            res = null;
        else{
            NodoDEF<T> aux = ini;
            while(pos-- > 0)
                aux = aux.getSuc();
                
            NodoDEF<T> ant = aux.getAnt();
            NodoDEF<T> sig = aux.getSuc();
            if(ant != null)
                ant.setSuc(sig);
            if(sig != null)
                sig.setAnt(ant);
            if(aux == ini)
                ini = sig;
            aux.setAnt(null);
            aux.setSuc(null);
            res = aux.getDato();
        }
        return res;
    }
    public void ordenar(){//ASCENDENTE
        int n = largo;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                Comparable<T> comp = ((Comparable<T>)acceder(i));
                if(comp.compareTo(acceder(j)) > 0){
                    intercambiar(i, j);
                }
            }
        }
        
    }
}