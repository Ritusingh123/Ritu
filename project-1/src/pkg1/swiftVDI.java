package pkg1;

public class swiftVDI extends Swift
{
  public void modelType()
  {
	  System.out.println("Model is VDI");
  }
  public static void main(String[] args) 
  {
	swiftVDI s=new swiftVDI();
	s.modelType();
	s.Model();
	s.basePrice();
	
}
}
