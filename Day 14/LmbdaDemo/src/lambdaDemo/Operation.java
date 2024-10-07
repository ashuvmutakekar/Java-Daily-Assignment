package lambdaDemo;
@FunctionalInterface
public interface Operation <T>{
public abstract T Operate(T a,T b);
}
