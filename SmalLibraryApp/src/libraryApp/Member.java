package libraryApp;

public class Member {
	private String name;
	private Double currentMoney;
	
	public Member(String name, Double currentMoney) {
		this.name = name;
		this.currentMoney = currentMoney;
		
	}
	
	public Member() {
		this.name = "John";
		this.currentMoney = 100.0;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getCurrentMoney() {
		return currentMoney;
	}
	
	public void setCurrentMoney(Double currentMoney) {
		this.currentMoney = currentMoney;
	}
	
	
	
	public String toString() {
		return "Member name: " + name +
				"\nCurrent money: $" + currentMoney;
	}
}
