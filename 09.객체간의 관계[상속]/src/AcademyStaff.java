public class AcademyStaff extends AcademyMember {
public String depart;
public AcademyStaff() {
	// TODO Auto-generated constructor stub
}
public AcademyStaff(int no, String name, String depart) {
	this.no=no;
	this.name=name;
	this.depart = depart;
}


public void staffPrint() {
	this.print();
	System.out.println(depart);
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


public String getDepart() {
	return depart;
}
public void setDepart(String depart) {
	this.depart = depart;
}







}
