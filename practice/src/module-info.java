class Car{
	String name;
	float price;
	float mil;
	void insert(String s, float p, float m) {
		name = s;
		price =p;
		mil =m;
		
	}
	void display() {
		System.out.println(name+" "+price+" "+mil);
	}
}
class Test{
public static void main(String[] args){
		Car c1= new Car();
		c1.insert("Volvo",6,21);
		c1.display();
			
	}
	}
