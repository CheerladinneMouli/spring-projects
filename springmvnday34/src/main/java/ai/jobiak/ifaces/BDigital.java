package ai.jobiak.ifaces;

public class BDigital {
	
	Printable printable;
	PackingIface packing;
	
	public BDigital() {
		
	}
public BDigital(PackingIface packing) {
	this.packing=packing;	
	}

	public Printable getPrintable() {
		return printable;
	}

	public void setPrintable(Printable printable) {
		this.printable = printable;
	}
public void publish() {
	printable.print();
	packing.doPacking();
}

public void doInit() {
	System.out.println("from init().....");
}
public void doDestroy() {
	System.out.println("from destroy...");
}
}
