package lambdaDemo;

public class AddOperation implements Operation<Double>{
    @Override
    public Double Operate(Double a,Double b)
    {
    	return a+b;
    }
}
