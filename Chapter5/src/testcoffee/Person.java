package testcoffee;

public class Person {
	String name;
	int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buyStarCoffee(StarCoffee starCoffee, int money) {
		String message = starCoffee.brewing(money);
		
		if(message != null) {
			this.money -= money;
			System.out.println(name + "님이 " + money +"원을 내고 "  + message);
		}
	}
	
	public void buyBeanCoffee(BeanCoffee beanCoffee, int money) {
		String message = beanCoffee.brewing(money);
		
		if(message != null) {
			this.money -= money;
			System.out.println(name + "님이 " + money +"원을 내고 "  + message);
		}
	}
}
