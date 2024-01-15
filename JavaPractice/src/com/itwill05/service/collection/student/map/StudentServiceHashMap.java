package com.itwill05.service.collection.student.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class StudentServiceHashMap {
	private static final int ArrayList = 0;
	private HashMap<String, List<Student>> studentMap;

	public StudentServiceHashMap() {
		List<Student> studentsa = Arrays.asList(new Student(1, "A", "KIM", 89, 93, 44),
				new Student(2, "A", "KIM", 88, 77, 98), new Student(3, "A", "AIM", 65, 87, 79),
				new Student(4, "A", "KIM", 75, 97, 72), new Student(5, "A", "XDM", 85, 98, 90),
				new Student(6, "A", "DIM", 95, 88, 76), new Student(7, "A", "PIM", 99, 93, 65),
				new Student(8, "A", "AFM", 83, 80, 100), new Student(9, "A", "NIM", 73, 90, 70),
				new Student(10, "A", "XIM", 67, 77, 89));
		List<Student> studentsb = Arrays.asList(new Student(1, "B", "KIM", 89, 93, 94),
				new Student(2, "B", "HIM", 88, 77, 98), new Student(3, "B", "AIM", 65, 87, 99),
				new Student(4, "B", "KIM", 75, 97, 60), new Student(5, "B", "ZFM", 85, 98, 40),
				new Student(6, "B", "TIM", 95, 88, 77), new Student(7, "B", "WIM", 99, 93, 95),
				new Student(8, "B", "CIM", 83, 80, 99), new Student(9, "B", "TIM", 73, 90, 80),
				new Student(10, "B", "QIM", 67, 77, 99));
		List<Student> studentsc = Arrays.asList(new Student(1, "C", "KIM", 89, 93, 74),
				new Student(2, "C", "GIM", 88, 77, 88), new Student(3, "C", "AIM", 65, 87, 59),
				new Student(4, "C", "KIM", 75, 97, 50), new Student(5, "C", "FFM", 85, 98, 80),
				new Student(6, "C", "FGM", 95, 88, 67), new Student(7, "C", "VVM", 99, 93, 35),
				new Student(8, "C", "DDM", 83, 80, 86), new Student(9, "C", "QIM", 73, 90, 50),
				new Student(10, "C", "CIM", 67, 77, 72));
		studentMap = new HashMap<String, List<Student>>();
		studentMap.put("A", studentsa);
		studentMap.put("B", studentsb);
		studentMap.put("C", studentsc);
		;

	}

	/*
	 *  1.전체학생출력
	 */
	public void print() {
		for (String ban : studentMap.keySet()) {
			System.out.println("---------------" + ban + " 반-------------------");
			Student.headerPrint();
			List<Student> studentBanList = studentMap.get(ban);
			for (Student student : studentBanList) {
				student.print();
			}
		}
	}

	/*
	 * 2.A(B,C)반학생출력
	 */
	public void printBan(String ban) {

		for (String sban : studentMap.keySet()) {
			if (sban.equals(ban)) {
				List<Student> studentBanList = studentMap.get(ban);
				for (Student student : studentBanList) {
					student.print();
				}
			}

		}

	}

	/*
	 * 3.학생객체추가
	 */
	public void addStudent(Student student) {

		/*	if (studentMap.containsKey(student.getBan())) {
				List<Student> a1 = studentMap.get(student.getBan());
				ArrayList<Student> aa = null;
				if (a1 instanceof ArrayList) {
					aa = (ArrayList) a1;
					aa.add(student);
					a1 = aa;
					for (Student student1 : a1) {
						System.out.println(student1);
					}
					studentMap.put(student.getBan(), a1);
				}
				
			}*/

		if (studentMap.containsKey(student.getBan())) {
			List<Student> a1 = studentMap.get(student.getBan());
			ArrayList<Student> aa = new ArrayList<>(a1);

			aa.add(student);

			studentMap.put(student.getBan(), (List<Student>) aa);
		}

	}

	/*
	 *4.전체학생총점,평균,평점계산
	 */
	public void calculate() {
		Iterator<Entry<String, List<Student>>> A1 = studentMap.entrySet().iterator();
		int tot = 0;
		while (A1.hasNext()) {
			Entry<String, List<Student>> temp = A1.next();
			List<Student> studentes = temp.getValue();
			for (Student student : studentes) {
				student.calculateTotal();
				student.calculateAvg();
				student.calculateGrade();

			}

		}

	}

	/*
	 * 5.A(B,C)반 학생총점,평균,평점계산
	 */
	public void calculateBan(String ban) {
		Iterator<Entry<String, List<Student>>> A1 = studentMap.entrySet().iterator();
		int tot = 0;
		double avg = 0.0;
		Student stu2 = new Student();
		while (A1.hasNext()) {
			Entry<String, List<Student>> temp = A1.next();
			if (temp.getKey().equals(ban)) {
				List<Student> studentes = temp.getValue();
				for (Student student : studentes) {
					student.calculateTotal();
					student.calculateAvg();
					student.calculateGrade();
					tot += student.getTot();
					avg += student.getAvg();
				}

				System.out.println("총점" + tot);

				System.out.printf("총 평균" + "%5.1f ", avg / studentMap.get(ban).size());
				stu2.setAvg((int) (avg / studentMap.get(ban).size()));

				char StudenGrade = stu2.calculateGrade();

				System.out.println("총 평점 :" + StudenGrade);
			}

		}

	}

	/*
	 * 6.전체학생 총점으로 전체석차계산
	 */
	public void calculateRank() {
		Iterator<Entry<String, List<Student>>> A1 = studentMap.entrySet().iterator();
		ArrayList<Student> aa = new ArrayList<Student>();
		while (A1.hasNext()) {
			Entry<String, List<Student>> temp = A1.next();
			List<Student> studentes = temp.getValue();

			for (Student student : studentes) {
				aa.add(student);
			}

		}

		for (int i = 0; i < aa.size(); i++) {
			aa.get(i).setRank(1);
			for (int j = 0; j < aa.size(); j++) {
				if (aa.get(i).getTot() < aa.get(j).getTot()) {
					aa.get(i).increaseRank();
				} else if (aa.get(i).getTot() == aa.get(j).getTot()) {
					if (aa.get(i).getMath() < aa.get(j).getMath()) {
						aa.get(i).increaseRank();
					}
				}
			}
		}

	}

	/*
	 * 7.  A(B,C)반 학생 총점으로 반석차계산
	 */
	public void calculateBanRank(String ban) {

		List<Student> A1 = studentMap.get(ban);
		ArrayList<Student> aa = new ArrayList<Student>();

		for (Student student : A1) {

			aa.add(student);

		}

		for (int i = 0; i < aa.size(); i++) {
			aa.get(i).setRank(1);
			for (int j = 0; j < aa.size(); j++) {
				if (aa.get(i).getTot() < aa.get(j).getTot()) {
					aa.get(i).increaseRank();
				} else if (aa.get(i).getTot() == aa.get(j).getTot()) {
					if (aa.get(i).getMath() < aa.get(j).getMath()) {
						aa.get(i).increaseRank();
					}
				}
			}
		}

	}

	/*
	 * 8. 전체학생반환
	 */
	public List<Student> getStudentList() {
		Iterator<Entry<String, List<Student>>> aa = studentMap.entrySet().iterator();
		List<Student> tempStudent = new ArrayList<Student>();
		while (aa.hasNext()) {
			Entry<String, List<Student>> temp = aa.next();
			for (Student student : temp.getValue()) {
				tempStudent.add(student);
			}

		}

		return tempStudent;
	}

	/*
	 * 9.전체학생중 A(B,C)반학생반환
	 */
	public List<Student> getBanStudentList(String ban) {
		Iterator<Entry<String, List<Student>>> aa = studentMap.entrySet().iterator();
		List<Student> tempStudent = new ArrayList<Student>();
		while (aa.hasNext()) {
			Entry<String, List<Student>> temp = aa.next();
			if (temp.getKey().equals(ban)) {
				for (Student student : temp.getValue()) {
					tempStudent.add(student);
				}
			}

		}

		return tempStudent;
	}

	/*
	 *10.A(B,C)반 번호3번 학생한명 반환    
	 */
	public Student findByStudent(String ban, int no) {
		Student findStudent = null;
		Iterator<Entry<String, List<Student>>> aa = studentMap.entrySet().iterator();
		while (aa.hasNext()) {
			Entry<String, List<Student>> temp = aa.next();
			if (temp.getKey().equals(ban)) {
				for (Student student : temp.getValue()) {
					if (student.getNo() == 3) {
						findStudent = student;
					}

				}

			}

		}

		return findStudent;
	}

	/*
	 * 11.전체학생중 학점A인 학생들 반환(List)
	 */
	public List<Student> findByGrade(char grade) {
		// ArrayList<Student> findStudents = new ArrayList<Student>();

		// return findStudents;

		Iterator<Entry<String, List<Student>>> aa = studentMap.entrySet().iterator();
		ArrayList<Student> findStudents = new ArrayList<Student>();
		while (aa.hasNext()) {
			Entry<String, List<Student>> temp = aa.next();
			for (Student student : temp.getValue()) {
				if (student.getGrade() == grade) {
					findStudents.add(student);
				}

			}

		}

		return findStudents;
	}

	/*
	 * 11.전체학생중 학점A인 학생들  반별맵으로반환(Map)
	 */
	public Map<String, List<Student>> findByGradeByMap(String ban, char grade) {
		Map<String, List<Student>> findStudentMap = new HashMap<String, List<Student>>();

		Iterator<Entry<String, List<Student>>> aa = studentMap.entrySet().iterator();
		List<Student> findStudents = new ArrayList<Student>();
		while (aa.hasNext()) {
			Entry<String, List<Student>> temp = aa.next();
			for (Student student : temp.getValue()) {
				if (student.getBan().equals(ban) && student.getGrade() == grade) {
					findStudents.add(student);
				}

			}
			findStudentMap.put(ban, findStudents);

		}

		return findStudentMap;
	}

	/*
	 *12.A(B,C)반 학점A인 학생들 반환
	 */
	public List<Student> findByBanGrade(String ban, char grade) {
		ArrayList<Student> findStudents = new ArrayList<Student>();

		Iterator<Entry<String, List<Student>>> aa = studentMap.entrySet().iterator();
		while (aa.hasNext()) {
			Entry<String, List<Student>> temp = aa.next();
			for (Student student : temp.getValue()) {
				if (student.getBan().equals(ban) && student.getGrade() == grade) {
					findStudents.add(student);
				}

			}

		}

		return findStudents;
	}

	/*
	 * 13.전체학생중 이름KIM 학생들 반환(List)
	 */
	public List<Student> findByName(String name) {
		ArrayList<Student> findStudents = new ArrayList<Student>();

		Iterator<Entry<String, List<Student>>> aa = studentMap.entrySet().iterator();
		while (aa.hasNext()) {
			Entry<String, List<Student>> temp = aa.next();
			for (Student student : temp.getValue()) {
				if (student.getName().equals(name)) {
					findStudents.add(student);
				}

			}

		}

		return findStudents;
	}

	/*
	 * 13.전체학생중 이름KIM 학생들 반별맵으로반환(Map)
	 */
	public Map<String, List<Student>> findByNameByMap(String name) {
		Map<String, List<Student>> findStudentMap = new HashMap<String, List<Student>>();

		Iterator<Entry<String, List<Student>>> aa = studentMap.entrySet().iterator();
		List<Student> findStudents = new ArrayList<Student>();
		while (aa.hasNext()) {
			Entry<String, List<Student>> temp = aa.next();
			String tempKey = temp.getKey();
			for (Student student : temp.getValue()) {
				if (student.getBan().equals(tempKey) && student.getName().equals(name)) {
					findStudents.add(student);
				}

			}
			findStudentMap.put(tempKey, findStudents);

		}

		return findStudentMap;
	}

	/*
	 * 14.  A(B,C)반 이름KIM 학생들 반환
	 */
	public List<Student> findByBanName(String ban, String name) {
		
		List<Student> findStudents = new ArrayList<Student>();
		Iterator<Entry<String, List<Student>>> aa = studentMap.entrySet().iterator();
		while (aa.hasNext()) {
			Entry<String, List<Student>> temp = aa.next();
			for (Student student : temp.getValue()) {
				if (student.getBan().equals(ban) && student.getName().equals(name)) {
					findStudents.add(student);
				}

			}

		}

		
		
		return findStudents;
	}

	/*
	 * 15.  A(B,C)반 학생총점으로 오름차순정렬
	 */
	public void sortByBanTotAsc() {

	}

	/*
	 8.  A(B,C)반 학생 이름순으로 오름차순정렬
	 */
	public void sortByBanNameAsc() {

	}

}