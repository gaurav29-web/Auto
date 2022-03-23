package javaRules;

public class StaticThisSuperOverride_Child extends StaticThisSuperOverride_Parent{
static int j=20;
	public static void main(String[] args) {
		StaticThisSuperOverride_Parent obj = new StaticThisSuperOverride_Child();
		obj.Parent(); //-- Should call parent method only. No overriding should be done
	}

	public  static void Parent(){
		//super.j=j;  Can not use
		System.out.println("child var "+ j);
	}
}
  