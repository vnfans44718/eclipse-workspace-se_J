package file;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		/*
		 * 절대경로(absolute path)
		 * C; D; 드라이브를 기준으로 경로기술
		 * ex) C:\2023-12-JAVA-DEVELOPER\eclipse-workspace-se\20.입출력[IO]
		 * 
		 * 상대경로(relative path)
		 * 현재 경로를 기준으로 경로를 기술
		 * ex) .\a.txt  [a.txt] -->C:\2023-12-JAVA-DEVELOPER\eclipse-workspace-se\20.입출력[IO]\a.txt(붙여서 읽어줌,.\는 현재 경로라는 뜻)
		 * .\sample/a.txt  [sample\a.txt]  --> C:\2023-12-JAVA-DEVELOPER\eclipse-workspace-se\20.입출력[IO]\sample\a.txt
		 * 
		 * FileMain.class가 실행되고 있는 기준 경로
		 * <<C:\2023-12-JAVA-DEVELOPER\eclipse-workspace-se\20.입출력[IO]>>
		 * 
		 */

		System.out.println(File.separator);
		File file1=new File("C:\\2023-12-JAVA-DEVELOPER\\eclipse-workspace-se\\20.입출력[IO]\\데미안.txt");
		File file2=new File("죄와벌.txt");
		File file3=new File("sample/car1.jpg");
		File file4=new File("sample/subSample1/00.VariableDeclare.txt");
		File file5=new File("sample/subSample1/ForNested.java");
		
		System.out.println("------1.file path[relative]-----");
		System.out.println(file1.getPath());
		System.out.println(file2.getPath());
		System.out.println(file2.getPath());
		System.out.println(file3.getPath());
		System.out.println(file4.getPath());
		System.out.println(file5.getPath());
		System.out.println("------2.file path[absolute]-----");
		System.out.println(file1.getAbsolutePath());
		System.out.println(file2.getAbsolutePath());
		System.out.println(file3.getAbsolutePath());
		System.out.println(file4.getAbsolutePath());
		System.out.println(file5.getAbsolutePath());
		System.out.println("------3.filename-----");
		System.out.println(file1.getName());
		System.out.println(file2.getName());
		System.out.println(file3.getName());
		System.out.println(file4.getName());
		System.out.println(file5.getName());
	    
		File dir0=new File("C:/2023-12-JAVA-DEVELOPER/eclipse-workspace-se/20.입출력[IO]");
		File dir1=new File("sample");
		File dir2=new File("sample/subSample1");
		File dir3=new File("sample","subSample2");
		System.out.println("-----------isDierctory,isFile----------");
		System.out.println(dir0.isDirectory());
		System.out.println(dir1.isDirectory());
		System.out.println(dir0.isFile());
		System.out.println(dir1.isFile());
		System.out.println(file1.isDirectory());
		System.out.println(file2.isDirectory());
		System.out.println("--------------디렉토리안에 파일[디렉토리]목록(String[])-----------");
		String[] fileNameList=dir1.list();
		for (String fileName : fileNameList) {
			System.out.println("\t"+fileName);
		}
		System.out.println("--------------디렉토리안에 파일[디렉토리]목록(File[])-----------");
		File[] fileList=dir1.listFiles();
		for (File file : fileList) {
			if(file.isDirectory()) {
				System.out.println("D:"+file.getName());
				//Directory
				File[] subFileList = file.listFiles();
				for (File subFile : subFileList) {
					System.out.println("\t"+subFile.getName());
				}
			}else {
				System.out.println("F:"+file.getName());
			}
		}
		System.out.println("----디렉토리생성    ----");
		File newDir1=new File("newDir1");
		File newDir2=new File("newDir2");
		File newDir3=new File("sample", "subSample3");
		File newDir4=new File("sample/subSample4");
		System.out.println(">>newDir1 의 생성여부:"+newDir1.mkdir());
		System.out.println(">>newDir2 의 생성여부:"+newDir2.mkdir());
		System.out.println(">>newDir3 의 생성여부:"+newDir3.mkdir());
		System.out.println(">>newDir4 의 생성여부:"+newDir4.mkdir());
		System.out.println("----디렉토리이름변경----");
		System.out.println(">>newDir2 rename성공여부:"+newDir2.renameTo(new File("renameDir2")));
		System.out.println("----디렉토리삭제    ----");
		System.out.println(">>newDir3삭제여부:"+newDir3.delete());
		//newDir3.deleteOnExit();
		
		
	}
	

}
