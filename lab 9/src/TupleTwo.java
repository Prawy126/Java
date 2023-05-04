//zadanie 2
public class TupleTwo <T1, T2>{
    private T1 t1;
    private T2 t2;
    public TupleTwo(T1 t1, T2 t2){
        this.t1 = t1;
        this.t2 = t2;
    }
    public T1 getT1(){
        return this.t1;
    }
    public T2 getT2(){
        return this.t2;
    }
    public void setT1(T1 t1){
        this.t1 = t1;
    }
    public void setT2(T2 t1){
        this.t2 = t2;
    }
}
