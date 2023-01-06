
public class Log {
	private boolean log_or_not;
	public Log(Boolean log_or_not) {
		this.log_or_not = log_or_not;
	}
	
	public void Ask() {
		if(log_or_not) {
			System.out.println("입장 하셨습니다.");
		}else {
			System.out.println("퇴장 하셨습니다.");
		}
		
	}
}
