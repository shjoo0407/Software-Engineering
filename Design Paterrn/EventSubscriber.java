
public class EventSubscriber implements Observer{
	private String newsString;
	private Publisher publisher;
	
	public EventSubscriber(Publisher publisher) {
		this.publisher = publisher;
		publisher.add(this);
	}
	public void update(String title,String news) {
		this.newsString= title + " \n ------------------------- \n"+news;
		display();
	}
	public void display() {
		System.out.println("\n\n===이벤트 유저 ===");
		System.out.println("\n\n"+newsString);
	}

}
