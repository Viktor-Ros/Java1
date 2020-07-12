package HomeWork3;

import java.time.LocalDate;

public class Securities {

	private Object id;
	private LocalDate endDate;
	private Object currency;
	
	public Securities(Object id, LocalDate endDate, Object currency){
		this.id = id;
		this.endDate = endDate;
		this.currency = currency;
	}
	
	public long getId() {
		return (long) id;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	public String getCurrencyCod() {
		return (String) currency;
	}
}