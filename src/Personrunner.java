
public class Personrunner {
	public static void main(String[] args) {
		Person jim = new Person(); 
		jim.setname("Jimmy");
		jim.setSuperpower("Godly Strength");
		System.out.println(jim.getname()+" has "+jim.getSuperpower());
		Person Tim = new Person();
		Tim.setname("Timmy");
		Tim.setSuperpower("Procrastination Powers");
		System.out.println(Tim.getname()+" has "+Tim.getSuperpower());
	}	
}
