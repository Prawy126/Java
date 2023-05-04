//zadanie 2
public class TupleThree <T1,T2,T3> extends TupleTwo{
    private T1 t1;
    private T2 t2;
    private T3 t3;
    public TupleThree(T1 t1, T2 t2,T3 t3){
        super(t1,t2);
        this.t3 = t3;
    }
    public void setT3(T3 t3){
        this.t3 = t3;
    }
    public T3 getT3(){
        return this.t3;
    }
}
