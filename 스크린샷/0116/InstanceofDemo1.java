
public class InstanceofDemo1 {
	public static void main(String[] args) {
		//Sonata sonata = new Sonata("현대 소나타");   remake(sonata);
		//Carnival carnival = new Carnival("기아 카니발");  remake(carnival);
		Matiz matiz = new Matiz("쉬보레 마티즈");    remake(matiz);
	}
	static void remake(Car car) {    //Polymorphic Parameter
		if(car instanceof Sonata) {
			System.out.println("소나타가 수리됐습니다.");
		}else if(car instanceof Carnival) {
			System.out.println("카니발이 수리됐습니다.");
		}else if(car instanceof Matiz) {
			System.out.println("마티즈가 수리됐습니다.");
		}	
	}  
}
