package Method;

public class SingleTonClass {
	public static SingleTonClass obj=null;
	public static SingleTonClass obj2=null;
	int a=2;
	int b=9;
	
private SingleTonClass(){
		
	}
public static SingleTonClass  getDriver() {
	if(obj==null) {
		obj=new SingleTonClass();
		
		return obj;
	}else if(obj2==null) {
		obj2=new SingleTonClass();
		return obj2;
	}
	return obj;
	
}
	
	
	

}
