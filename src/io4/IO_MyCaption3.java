package io4; //20231123

/*
 * <직렬화>
 *   - ObjectOutputStream : 직렬화
 *   - ObjectInputStream  : 역직렬화
 *   - 직렬화 가능한 객체를 만들기 위해 implements Serializable
 * 
 * <마샬링과 언마샬링>
 *   - 마샬링 : 객체를 출력이 쉬운 다른 형태로 변환(객체->text)
 *   - 언마샬링 : text를 객체 형태로 변환 => text 형태는 조작, 분석이 어렵기 때문에
 *   
 */

/*   
 *  // 파일에 대한 정보가 필요한 경우, 데이터베이스에 파일에 대한 정보도 저장하고, 파일도 업로드한다.
 *  // File객체를 생성하면 파일명, 사이즈, 최종수정일자 ... 등의 정보를 조회할 수 있다.
 *  // 위의 정보를 조회하기 위해서 File객체를 생성했고, 스트림객체 생성될 때도 File객체를 활용했다.
 *  File file = new File("sample.txt");
 *  File.length();
 *  File.lastModified();
 *  FileInputStream in = new FileInputStream(file);
 * 
 * 
 *  // 파일에 대한 구체적인 정보가 필요하지 않음. 단순한 스트림객체를 생성할 때 파일명이나 경로만 이용한다.
 *  FileInputStream in = new FileInputStream("sample.txt");
 */

public class IO_MyCaption3 { }
