package fgdfg;

public class Animal {
	private String color;
	private String kind;
	private int age;
	
	
	Animal() {
		
	}
	
	@Overload	
	Animal(String color, String k, int a) {
		this.color = color;
		this.kind = k;
		this.age = a;
	}
	
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void makeSound() {
		System.out.println("Buuu!");
	}
	
	
	
}
