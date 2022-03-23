package javaRules;

class  StaticThisSuperOverride_Parent {
	static int i=20;
	public static void Parent(){
		System.out.println("Parent class variable" + i);
		//this.i=8; can not use
	}

}
