public class AcademyStudent extends AcademyMember {
/*
 * 	public int no;
	public String name;
	
	public void print() {
		System.out.println(this.no+"\t"+this.name+"\t");
	}
	

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
 */
	public String ban;
	public AcademyStudent() {
		
	}
	public AcademyStudent(int no, String name,String ban) {
		this.no=no;
		this.name=name;
		this.ban=ban;
	}
	
	
	public void studentPrint() {
		this.print();
		System.out.println(this.ban);
	}
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getBan() {
		return ban;
	}
	public void setBan(String ban) {
		this.ban = ban;
	}
	

	
	
	
}
