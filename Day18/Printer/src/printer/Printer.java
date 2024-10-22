package printer;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import static printer.PrinterType.LASER;
import static printer.PrinterType.DOTMATRIX;
import static printer.PrinterType.INKJET;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.time.LocalDate.parse;
public class Printer implements Externalizable {

	
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
	public void setModelNo(Integer string) {
		this.modelNo = string;
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
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		
		out.writeObject(serialNo);
		out.writeObject(modelNo);
		out.writeObject(price);
		out.writeObject(pt);
		out.writeObject(mdate);
	}
	 @Override
	    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
	        this.serialNo = in.readUTF();
	        this.modelNo = in.readInt();
	        this.price = in.readDouble();
	        this.pt = PrinterType.valueOf(in.readUTF());
	        this.mdate = (LocalDate) in.readObject();
	    }
	
	
}
