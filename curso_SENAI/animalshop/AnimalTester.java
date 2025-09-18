package animalshop;

/*
 * Classe AnimalTester criada para prática de 
 * uso de Classes em java
 */
public class AnimalTester {
	public static void main(String[] args) {
		
		Dog Dog1 = new Dog("Jade", "Rottweiler", 55.7);
		Dog Dog2 = new Dog("Clacla", "Poodle", "Rar!", 5.6);
		
		System.out.println("Dog name : " + Dog1.getName());
		System.out.println("Dog breed : " + Dog1.getBreed());
		System.out.print("Bark noise: ");
		Dog1.bark();
		System.out.println("Dog weight: " + Dog1.getWeight());
		System.out.println("Dog name : " + Dog2.getName());
		System.out.println("Dog breed : " + Dog2.getBreed());
		System.out.print("Bark noise: ");
		Dog2.bark();
		System.out.println("Dog weight: " + Dog2.getWeight());
	}// end main method
	
}// end class
