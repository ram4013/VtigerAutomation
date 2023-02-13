package Method;

public class SingleTonPractice {

	public static void main(String[] args) {

//		SingleTonClass d=	SingleTonClass.getDriver();
//		SingleTonClass c=	SingleTonClass.getDriver();
//		SingleTonClass j=	SingleTonClass.getDriver();
////		d.a=6;
//		System.out.println(d.a);
////		c.a=7;
//		System.out.println(c.a);
//		
//		System.out.println(j.a);
		
		System.out.println(SingleTonClass.getDriver());
		System.out.println(SingleTonClass.getDriver());
		System.out.println(SingleTonClass.getDriver());
		
	}

}
