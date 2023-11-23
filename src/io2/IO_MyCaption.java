package io2; //20231122

/*
 * 컨텐츠 종류
 *  한글 파일
 *  엑셀 파일, ppt, word, pdf
 *  사진, 동영상, 오디오
 *  압축파일
 *  텍스트 파일
 *   - XML
 *   - csv
 *   - json
 *   - yaml
 *   - properties
 * 
 * 데이터 종류
 *  비정형데이터 - 사진, 영상, 신문기사
 *  반정형데이터 - 로그 파일
 *  정형데이터  - csv, XML, json ... (텍스트 데이터를 처리한다 => 정형데이터) => Reader, Write 사용
 */

/*
 * ByteStream
 *   InputStream
 *       FileInputStream      - 파일과 연결해서 파일의 내용을 1byte씩 읽어오는 스트림
 *       BufferedInputStream  - 다른 스트림과 연결해서 읽기 성능을 향상시키는 스트림
 *       DataInputStream      - DataOutputStream으로 출력한 내용을 값을 그대로 읽어오는 스트림
 *                              readInt(), radLong(), readDouble(), readUTF()
 *       ObjectInputStream    - 
 *       
 *   OutputStream
 *       FileOutputStream     - 파일과 연결해서 1byte씩 파일에 기록하는 스트림
 *       BufferedOutputStream - 다른 스트림과 연결해서 쓰기 성능을 향상시키는 스트림
 *       DataOutputStream     - 값을 데이터타입(기본자료형이나 String 형태) 그대로 출력하는 스트림
 *                              write(int value), write(byte[] arr, int offset, int l)
 *                              writeInt(int value), writeLong(long value), writeDouble(double value), writeUTF(String value)
 *       ObjectOutputStream   - 
 *       PrintStream          - 쓰기 전용 스트림 (System.out.println ...)
 *       
 * CharacterStream 텍스트 전용 스트림 (한글 깨짐)
 *   Reader
 *       FileReader           - 파일과 연결해서 파일의 내용을 1글자씩 읽어오는 스트림
 *    ***BufferedReader       - 다른 스트림과 연결해서 읽기 성능을 향상시키는 스트림
 *                              텍스트를 한 줄씩 읽어오는 스트림 (텍스트 읽어올 땐 항상 이거 사용)
 *                              *** 텍스트 읽기에 최적화되어 있는 스트림
 *       InputStreamReader    - InputStream과 연결가능한 Reader 객체 (ByteStream과 ChracterStream을 이어주는 Bridge Stream)
 *   
 *   Writer
 *       FileWriter           - 파일과 연결해서 1글자씩 파일에 기록하는 스트림
 *       BufferedWriter       - 다른 스트림과 연결해서 쓰기 성능을 향상시키는 스트림
 *       OutputStreamWriter   - OutputStream과 연결가능한 Writer 객체 (PrintWriter 쓸 때는 필요없음)
 *    ***PrintWriter          - 쓰기 전용 스트림, ***텍스트 기록에 최적화되어 있는 스트림 (System.out.println ...)
 *    						    한 줄씩 출력하는 println() 메소드 제공, autoFlush 기능 제공
 */
/*
 * class BufferedReader {
 *     // 생성자
 *     public BufferedReader(Reader reader) { ... }
 * }
 * 
 * class InputStreamReader extends Reader {
 *     public InputStreamReader(InputStream in) { ... }
 * }
 */

public class IO_MyCaption { }
