package lambdaDemo;

public class ArithOperation {
 public static Double ArithOperation(Double a,Double b,Operation<Double> op) 
 {
	return op.Operate(a,b);
 }
}
