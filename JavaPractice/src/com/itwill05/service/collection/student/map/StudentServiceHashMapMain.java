package com.itwill05.service.collection.student.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentServiceHashMapMain {
	private static final String Student = null;

	public static void main(String[] args) {

		StudentServiceHashMap studentServiceHashMap = new StudentServiceHashMap();

		studentServiceHashMap.print();
		/*
		 * 1.전체학생출력
		 * 2.A(B,C)반학생출력
		 * 
		 * 
		 * 3.학생객체추가
		 * 4.전체학생총점,평균,평점계산
		 * 5.A(B,C)반 학생총점,평균,평점계산
		 * 6.전체학생 총점으로 전체석차계산
		 * 7.A(B,C)반 학생 총점으로 반석차계산
		 * 8.전체학생반환
		 * 9.전체학생중 A(B,C)반학생반환
		 * 10.A(B,C)반 번호3번 학생한명 반환    
		 * 11.전체학생중 학점A인 학생들 반환(List)
		 * 11.전체학생중 학점A인 학생들  반별맵으로반환(Map)
		 * 12.A(B,C)반 학점A인 학생들 반환
		 * 13.전체학생중 이름KIM 학생들 반환(List)
		 * 13.전체학생중 이름KIM 학생들 반별맵으로반환(Map)
		 * 14.A(B,C)반 이름KIM 학생들 반환
		 * 15.A(B,C)반 학생총점으로 오름차순정렬
		 * 16.A(B,C)반 학생 이름순으로 오름차순정렬(
		 */

		// * 2.A(B,C)반학생출력
		studentServiceHashMap.printBan("A");
		// * 3.학생객체추가

		Student stu1 = new Student(11, "A", "DFSA", 50, 50, 50);
		studentServiceHashMap.addStudent(stu1);
		studentServiceHashMap.printBan("A");

		// * 4.전체학생총점,평균,평점계산
		studentServiceHashMap.calculate();
		studentServiceHashMap.print();
		// * 5.A(B,C)반 학생총점,평균,평점계산
		studentServiceHashMap.calculateBan("A");
		System.out.println();
		// * 6.전체학생 총점으로 전체석차계산
		studentServiceHashMap.calculateRank();
		studentServiceHashMap.print();

		System.out.println();
		// * 7.A(B,C)반 학생 총점으로 반석차계산
		studentServiceHashMap.calculateBanRank("A");
		studentServiceHashMap.printBan("A");

		System.out.println("전체학생반환");
		// * 8.전체학생반환
		List<Student> studentes = studentServiceHashMap.getStudentList();
		for (int i = 0; i < studentes.size(); i++) {
			studentes.get(i).print();
			System.out.println();

		}
		// * 전체학생중 A(B,C)반학생반환

		List<Student> studentes1 = studentServiceHashMap.getBanStudentList("A");
		for (int i = 0; i < studentes1.size(); i++) {

			studentes1.get(i).print();

		}
		System.out.println("10.A(B,C)반 번호3번 학생한명 반환 ");
		// 10.A(B,C)반 번호3번 학생한명 반환
		Student studentes3 = studentServiceHashMap.findByStudent("A", 3);
		studentes3.print();

		System.out.println("11.전체학생중 학점A인 학생들 반환(List)");
		// 11.전체학생중 학점A인 학생들 반환(List)
		List<Student> studentesA = studentServiceHashMap.findByGrade('A');
		for (int i = 0; i < studentesA.size(); i++) {

			studentesA.get(i).print();

		}
		System.out.println("11.전체학생중 학점A인 학생들 반별맵으로반환(Map)");
		// * 11.전체학생중 학점A인 학생들 반별맵으로반환(Map)
		Map<String, List<Student>> studentesAMap = studentServiceHashMap.findByGradeByMap('A');
		for (String ban : studentesAMap.keySet()) {
			System.out.println("---------------" + ban + " 반-------------------");

			List<Student> studentBanList = studentesAMap.get(ban);
			for (Student student : studentBanList) {
				if (student.getBan().equals(ban)) {
					student.print();
				}
				
			}
		}
System.out.println("12.A(B,C)반 학점A인 학생들 반환");
		// * 12.A(B,C)반 학점A인 학생들 반환
		List<Student> studentesABan = studentServiceHashMap.findByBanGrade("A",'A');
		for (int i = 0; i < studentesABan.size(); i++) {

			studentesABan.get(i).print();

		}
		System.out.println("13.전체학생중 이름KIM 학생들 반환(List)");
		// 13.전체학생중 이름KIM 학생들 반환(List)
		List<Student> studentesfindByName = studentServiceHashMap.findByName("KIM");
		for (int i = 0; i < studentesfindByName.size(); i++) {

			studentesfindByName.get(i).print();

		}

		System.out.println("13.전체학생중 이름KIM 학생들 반별맵으로반환(Map)");
		// 13.전체학생중 이름KIM 학생들 반별맵으로반환(Map)
		Map<String, List<Student>> findByNameByMap1 = studentServiceHashMap.findByNameByMap("KIM");
		for (String ban : findByNameByMap1.keySet()) {
			System.out.println("---------------" + ban + " 반-------------------");

			List<Student> studentBanList = findByNameByMap1.get(ban);
			for (Student student : studentBanList) {
				if (student.getBan().equals(ban)) {
					student.print();
				}
			}

		}
System.out.println("A(B,C)반 이름KIM 학생들 반환");
		List<Student> findByBanName2 = studentServiceHashMap.findByBanName("A", "KIM");
		for (int i = 0; i < findByBanName2.size(); i++) {

			findByBanName2.get(i).print();

		}

	}
}