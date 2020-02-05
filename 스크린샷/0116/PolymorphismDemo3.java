
public class PolymorphismDemo3 {
	public static void main(String[] args) {
		//Dog [] array = new Dog[3]
		//Mammal [] array = new Mammal[4];
		//Heterogeneous Collection
		//array[0] = new Dog();   array[1] = new Cat();
		//array[2] = new Korean();  array[3] = new American();
		//for(Mammal m : array)  m.saySomething();
		
		Object [] array = {
				90, 89.5, false, 'A', new Sonata("현대 소나타"), new Dog(), 
				"Hello, World"
		};
		print(array);
	}
	static void print(Object [] array) {
		for(Object obj : array)  {
			if(obj instanceof Sonata) {
//				Sonata sonata = (Sonata)obj;
//				System.out.println(sonata.getName());
				System.out.println(((Sonata) obj).getName());
			}
			else if(obj instanceof Dog) {
				((Dog) obj).saySomething();
			}
			else System.out.println(obj);
		}
	}
}




