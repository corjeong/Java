package testcoffee;

public class StarCoffee {

	int money;
	
	public String brewing(int money) {
	
		this.money += money;
		if(money == Menu.STARAMERICANO) {
			return "���ٹ濡�� �Ƹ޸�ī�븦 �����߽��ϴ�";
		}
		else if(money == Menu.STARLATTE) {
			return "���ٹ濡�� �󶼸� �����߽��ϴ�";
		}
		else {
			return null;
		}
	}
}
