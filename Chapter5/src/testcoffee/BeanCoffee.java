package testcoffee;

public class BeanCoffee {
	int money;
	
	public String brewing(int money) {
	
		this.money += money;
		if(money == Menu.BEANAMERICANO) {
			return "��ٹ濡�� �Ƹ޸�ī�븦 �����߽��ϴ�";
		}
		else if(money == Menu.BEANLATTE) {
			return "��ٹ濡�� �󶼸� �����߽��ϴ�";
		}
		else {
			return null;
		}
	}
}
