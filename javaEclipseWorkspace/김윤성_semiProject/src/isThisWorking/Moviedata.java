package isThisWorking;

public class Moviedata {
	private String ranking;
	private String title;
	private String point;
	
	public Moviedata(String ranking, String title, String point) {
		this.ranking = ranking;
		this.title = title;
		this.point = point;
	}
	
	public String getRanking() { return ranking; }
	public void setRanking(String ranking) { this.ranking = ranking; }
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
	public String getPoint() { return point; }
	public void setPoint(String point) { this.point = point; }
}
