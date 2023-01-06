
public class Weather {
	private int when = 0;
	
	public Weather(int when) {
		this.when = when;
	}
	public void Forecast() {
		switch(when) {
		case 1:
		case 2:
		case 3:
		case 12:
			System.out.println(when+"월은 춥습니다.");
			break;
		case 4:
		case 5:
			System.out.println(when+"월은 따뜻합니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(when+"월은 덥습니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(when+"월은 선선합니다.");
			default :
				System.out.println("1부터 12까지 #월을 입력하세요.");
		}
		
	}
}
