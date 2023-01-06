
public class Reservation {
	public String where;
	
	public Reservation(String where) {
		this.where = where;
	}
	public void Reser_flight() {
		System.out.println(where+"행 항공편이 예약되었습니다.");
	}
	public void Reser_accomo() {
		System.out.println(where+"에서의 숙소가 예약되었습니다.");
	}
	public void Reser_car() {
		System.out.println(where+"에서의 렌터카가 예약되었습니다.");
	}
}
