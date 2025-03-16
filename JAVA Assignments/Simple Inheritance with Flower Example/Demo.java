

 class flower{
	String name;
	String colour;
	String hasFragrance;
	flower(String name,String colour,String hasFragrance){
    this.name = name;
	this.colour = colour;
	this.hasFragrance = hasFragrance;
	}
}
class Rose extends flower{
	String hasThorns;
public Rose(String name,String colour,String hasFragrance,String hasThorns){
		super(name,colour,hasFragrance);
		this.hasThorns=hasThorns;
 }
		public void display(){
		System.out.println("Flower Name: "+ name);
		System.out.println("Color: "+ colour);
		System.out.println("Has Fragrance: "+ hasFragrance);
		System.out.println("Has Thorns: "+ hasThorns);
		
		System.out.println("----------------------------------------");
	}
 }
 
 class Lily extends flower{
	String growsInWater;
public Lily(String name,String colour,String hasFragrance,String growsInWater){
		super(name,colour,hasFragrance);
		this.growsInWater=growsInWater;
 }
		public void display(){
		System.out.println("Flower Name: "+ name);
		System.out.println("Color: "+ colour);
		System.out.println("Has Fragrance: "+ hasFragrance);
		System.out.println("Grows in water: "+ growsInWater);
	}
 }

class Demo{
	public static void main(String args[]){
		
		Rose s = new Rose("Rose","Red","Yes","Yes");
		s.display();
		Lily l = new Lily("Lily","White","Yes","Yes");
		l.display();
	}
}
		


























    
