package lambdaDemo;

public class TestOperation {

	public static void main(String[] args) {
		/*Operation add=new AddOperation();
		Double res=ArithOperation.ArithOperation(10.20,20.30,add);
       System.out.println(res);
       */
		
		/*Double res=ArithOperation.ArithOperation(10.20,20.30,new Operation <Double>(){
			 @Override
			    public Double Operate(Double a,Double b)
			    {
			    	return a+b;
			    }
			
		});
		 System.out.println(res);*/
		//Double res=ArithOperation.ArithOperation(10.20,20.30,);
		//tareget I/F Operation 
		//tareget method public abstract T Operate(T a,T b);
		//Operate(T a,T b)->T
		//(T a,T b)->T
		//(a,b)->return a+b;
		//(a,b)-> a+b;
		Double res=ArithOperation.ArithOperation(10.20,20.30,(a,b)-> a+b);
		System.out.println(res);
		
	}

}
