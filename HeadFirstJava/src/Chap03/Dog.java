package Chap03;

public class Dog {
	
	String name;
	public static void main(String[] args) {
		
		//make dog object and access it
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "pug";
		
		//now make a dog array
		Dog[] mydog = new Dog[3];
		mydog[0] = new Dog();
		mydog[1] = new Dog();
		mydog[2] = new Dog();
		
		//Dog access the Dogs using the array
		//references
		
		mydog[0].name = "bart";
		mydog[1].name = "don";
		
		System.out.println("last dog name is ");
		System.out.println(mydog[2].name);
		
		int x=0;
		for (int i = 0;i<mydog.length;i++) {
			mydog[i].bark();
		}
	}
	
	public void bark() {
		System.out.println(name + " says Ruff");	
	}
}
