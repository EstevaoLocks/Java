package animalshop;

/*
 * Classe Dog criada para prática de 
 * uso de Classes em java
 */
public class Dog {

	// Declarando Campos da instancia
	private String name;
	private String breed;
	private String barkNoise = "Woof";
	private double weight;
	
	/*
	 *  Metodos
	 */
	// Construtor
	public Dog(String name, String breed, double weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}// end Construtor
	
	public Dog(String name, String breed, String noise, double weight) {
		this.name = name;
		this.breed = breed;
		barkNoise = noise;
		this.weight = weight;
	}// end Construtor
	
	// Getters
	public String getName() {
		return name;
	}
	public String getBreed() {
		return breed;
	}
	public double getWeight() {
		return weight;
	}
	
	// Setters
	public void setName(String name) {
		this.name = name;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	// Funcionais
	public void bark() {
		System.out.println(barkNoise);
	}
	public void bark(String barkNoise) {
		System.out.println(barkNoise);
	}
	public void displayFields() {
		System.out.println("Dog name: " + name);
		System.out.println("Dog breed: " + breed);
		System.out.println("Bark Noise: " + barkNoise);
		System.out.println("Dog weight: " + weight);
	}
}// end class Dog
