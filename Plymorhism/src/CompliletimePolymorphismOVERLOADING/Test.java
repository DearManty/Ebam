package CompliletimePolymorphismOVERLOADING;

public class Test {
  public long ADD(int a,int b) {
	  long c=a+b;
	  return c;
	  //System.out.println(c);
  }
  public  void ADD(double a,int b,int c) {
	  
	  double d=a+b+c;
	  System.out.println(d);
  }
  public static void main(String[]args) {
	  Test r=new Test();
	  long gg=r.ADD(50, 30);
	  System.out.println(gg); 
	  r.ADD(12.4,45,88);
	  
  }
}
