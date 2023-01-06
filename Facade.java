
public class Facade {
	private boolean log_or_not = false;
	private String user_name;
	private String where;
	private int when;
	private int age;
	private String address;
	private String phone_num;
	
	public Facade (Boolean log_or_not,String user_name,String where,int when){
		this.log_or_not = log_or_not;
		this.user_name = user_name;
		this.where = where;
		this.when = when;
	}
	
	public void view() {
		Log log = new Log(log_or_not);
		Reservation reservation = new Reservation(where);
		Weather weather = new Weather(when);
		
		
		//view
		System.out.print(user_name+"님이 ");
		log.Ask();
		reservation.Reser_accomo();
		reservation.Reser_car();
		reservation.Reser_flight();
		weather.Forecast();
	}
	
	public void setName(String user_name) {
		this.user_name = user_name;
	}
	public void setNum(String phone_num) {
		this.phone_num = phone_num;
	}
	public void setAdd(String address) {
		this.address = address;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setWhere(String where) {this.where=where;}
	public void setWhen(int when) {this.when=when;}
	public void getInfo() {
		System.out.println("================고객 정보===============");
		System.out.println("이름 :" + user_name);
		System.out.println("전화번호 : "+phone_num);
		System.out.println("주소 : "+address);
		System.out.println("나이 : "+age);
		System.out.println("=====================================");
	}
	
	
}
