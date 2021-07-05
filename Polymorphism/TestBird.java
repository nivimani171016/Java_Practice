//Dynamic Polymorphism

class TestBird{
public static void main(String[]args){
	Animal myAni=new Animal();
	myAni.eat();
	
	Bird myBid=new Bird();
	myBid.eat();
	}
}