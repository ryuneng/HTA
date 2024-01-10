package io6; //20231123

import java.io.File;
import java.io.IOException;

public class FileApp2 {
	public static void main(String[] args) throws IOException {
		/*
		 * File 객체 생성하는 3가지 방법
		 *  1. File(String path)
		 *  2. File(String parent, String child)
		 *  3. File(File parent, String child)
		 *  
		 *  - 현재 존재하지 않는 파일이나 디렉토리에 대해서 File객체를 생성할 수 있다.
		 *  - createNewFile() 메소드는 사이즈가 0인 파일을 생성한다.
		 *  - mkdir() 메소드는 디렉토리를 생성한다.
		 *  - mkdirs() 메소드는 한번에 하위 디렉토리까지 포함시켜서 생성할 수 있다.
		 *  - delete() 메소드는 파일, 디렉토리를 삭제한다.
		 *    디렉토리는 디렉토리 안에 파일이나 하위 디렉토리가 있면 삭제되지 않음
		 */
		File file1 = new File("src/io6/sample1.txt");
		File file2 = new File("src/io6", "sample2.txt");
		File file3 = new File(new File("src/io6"), "sample3.txt");
		
		// 새 파일 만들기 (크기가 0인 빈 파일 생성됨)
		file1.createNewFile();
		file2.createNewFile();
		file3.createNewFile();
		
		// 디렉토리 만들기
		File dir1 = new File("src/io6/app");
		File dir2 = new File("src/io6/app.sample/files");
		
		dir1.mkdir();  // 현재 폴더에서 새로운 폴더 1개만 만들 때
		dir2.mkdirs(); // 현재 폴더 안에 여러 단계의 폴더 n개 한꺼번에 만들 때
		
		// 파일 삭제하기
		file1.delete(); // sample.txt 삭제됨
		
		// 디렉토리 삭제하기
		dir2.delete(); // src/io6/app.sample/files 경로에서 files만 삭제되고,
					   // src/io6/app.sample 는 남아있음 (맨끝의 디렉토리만 삭제되는 것)
		
		dir1.delete(); // 디렉토리를 삭제하기 위해서는 디렉토리 내부에 아무것도 없어야 한다.
	}
}
