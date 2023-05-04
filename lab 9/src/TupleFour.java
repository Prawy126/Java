//zadanie 2
public class TupleFour <T1,T2,T3,T4>extends TupleThree{
    private T1 t1;
    private T2 t2;
    private T3 t3;
    private T4 t4;
    public TupleFour(T1 t1, T2 t2, T3 t3, T4 t4){
        super(t1,t2,t3);
        this.t4 = t4;
    }
    public void setT4(T4 t4){
        this.t4 = t4;
    }
    public T4 getT4(){
        return this.t4;
    }
}
