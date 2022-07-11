package Yogesh;

public class Encapsulation {
	private int eid;
	
	public static void main(String args[])
	{
		Encapsulation a=new Encapsulation();
		a.eid=101;
		System.out.println(a.eid);
	}

	public int getEid() {
		return eid;
		//System.out.println(eid);
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

}
