package printer;

import java.io.Serializable;
import java.time.LocalDate;

public class Printer implements Serializable {

	
	private static final long serialVersionUID = 7038317864636135099L;
	String serialNo;
	Integer modelNo;
	Double price;
	PrinterType pt;
	LocalDate mdate;
	public Printer() {
		super();
	}
	public Printer(String serialNo, Integer modelNo, Double price, PrinterType pt, LocalDate mdate) {
		super();
		this.serialNo = serialNo;
		this.modelNo = modelNo;
		this.price = price;
		this.pt = pt;
		this.mdate = mdate;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public Integer getModelNo() {
		return modelNo;
	}
	public void setModelNo(Integer modelNo) {
		this.modelNo = modelNo;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public PrinterType getPt() {
		return pt;
	}
	public void setPt(PrinterType pt) {
		this.pt = pt;
	}
	public LocalDate getMdate() {
		return mdate;
	}
	public void setMdate(LocalDate mdate) {
		this.mdate = mdate;
	}
	@Override
	public String toString() {
		return "Printer [serialNo=" + serialNo + ", modelNo=" + modelNo + ", price=" + price + ", pt=" + pt + ", mdate="
				+ mdate + "]";
	}
	
}
