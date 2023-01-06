// Facade pattern으로 여행 맞춤 서비스를 구현해보았습니다.
// 60160478 주세현
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facade facade = new Facade(true,"주세현","전주",7);
		facade.view();
		facade.setName("배정희");
		facade.setAdd("경상남도 창원");
		facade.setNum("010-7777-7777");
		facade.setAge(50);
		facade.setWhen(1);
		facade.getInfo();
		facade.view();
	}

}
