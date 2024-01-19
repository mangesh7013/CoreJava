package com.edubridge.typesofvariables;
//program to create types of variables
public class TypesOfVariables {
	//instance variables
	float salary=78900.56f;
	//static variables
	static int x=10;
	
	String display()
	{
		//Local Variables
		char res='z';
		System.out.println(res);
		return "Local Variable";
		
	}
	

	public static void main(String[] args) {
		System.out.println(x);
		TypesOfVariables obj = new TypesOfVariables();
		System.out.println(obj.display());
		System.out.println(obj.salary);
		
		
		
		

	}

}
