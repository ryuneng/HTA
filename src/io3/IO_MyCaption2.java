package io3; //20231123

/*
 * Writer 계열의 스트림은 내부에 임시저장소 버퍼를 가지고 있다.
 *  - while() 메소드를 실행해서 텍스트 데이터를 출력시키면
 *    즉시 파일에 기록되는 것이 아니라 스트림의 임시저장소에 저장된다.
 *    임시저장소가 가득 채워지면 한번에 파일로 내려보낸다.(*임시저장소의 크기는 보통 8kb)
 *    만약 임시저장소가 채워지지 않으면 스트림이 종료되더라도 파일에 보내지지 않는다.
 * 
 *    flush() 메소드는 임시저장소가 가득 채워지지 않아도 임시저장소 저장된 텍스트 데이터를 파일로 내보낸다.
 *    *PrintWriter는 autoFlush기능이 있어 flush()를 하지 않아도 데이터를 즉시 파일로 내보낸다.
 */

/*
 * 표준 입력(키보드 입력)을 읽어오는 스트림
 *   class System {
 *       static InputStream in;  // 표준 입력 스트림 : 1byte씩 읽는다.
 *       static PrintStream out; // 표준 출력 스트림 : println() 메소드로 여러 종류의 데이터를 출력할 수 있다.
 *       static PrintStream err; // 표준 에러 출력 스트림 : println() 메소드로 여러 종류의 데이터를 출력할 수 있다.
 *   }
 *   
 * 키보드로 입력한 내용을 한줄씩 읽어오기
 *                                                * InputStreamReader: BufferedRead와 InputStream을 이어주는 Bridge Stream 
 *   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // System.in => InputStream을 넣은 것 => read.Line()으로 읽을 수 있음
 *   String text = reader.readLine();  // 키보드로 입력하고 Enter 키를 입력하면 입력한 내용을 읽어온다.
 */
public class IO_MyCaption2 { }
