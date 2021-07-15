package JavaA4;

public class Question1 {

	public static void main(String[] args) {
		LambdaFunction lambdaFunction1=(int a,int b) -> a+b;
		LambdaFunction lambdaFunction2=(int a,int b) -> a-b;
		LambdaFunction lambdaFunction3=(int a,int b) -> a*b;
		LambdaFunction lambdaFunction4=(int a,int b) -> a/b;

		System.out.println(lambdaFunction1.lambda(30,40));
		System.out.println(lambdaFunction2.lambda(15,5));
		System.out.println(lambdaFunction3.lambda(45,5));
		System.out.println(lambdaFunction4.lambda(75,25));

	}

}
interface LambdaFunction{
	int lambda(int x,int y);
	}


