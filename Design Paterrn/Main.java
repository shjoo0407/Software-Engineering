
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewsMachine newsMachine = new NewsMachine();
		AnnualSubscriber as = new AnnualSubscriber(newsMachine);
		EventSubscriber es = new EventSubscriber(newsMachine);
		
		newsMachine.setNewsInfo("오늘 한파", "전국 영하 18도 입니다.");
		newsMachine.setNewsInfo("벚꽃 축제힙니다", "다같이 벚꽃보러~");
	}

}
