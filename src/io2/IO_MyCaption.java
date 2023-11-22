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
 * InputStream
 *     FileInputStream      - 파일과 연결해서 파일의 내용을 1byte씩 읽어오는 스트림
 *     BufferedInputStream  - 다른 스트림과 연결해서 읽기 성능을 향상시키는 스트림
 *     DataInputStream      - 
 *     ObjectInputStream    - 
 *     
 * OutputStream
 *     FileOutputStream     - 파일과 연결해서 1byte씩 파일에 기록하는 스트림
 *     BufferedOutputStream - 다른 스트림과 연결해서 쓰기 성능을 향상시키는 스트림
 *     DataOutputStream     - 
 *     ObjectOutputStream   - 
 *     PrintStream          - 쓰기 전용 스트림 (System.out.println ...)
 * 
 * Reader
 *     FileReader           - 파일과 연결해서 파일의 내용을 1글자씩 읽어오는 스트림
 *  ***BufferedReader       - 다른 스트림과 연결해서 읽기 성능을 향상시키는 스트림
 *                            텍스트를 한 줄씩 읽어오는 스트림 (텍스트 읽어올 땐 항상 이거 사용)
 *                            *** 텍스트 읽기에 최적화되어 있는 스트림
 *     InputStreamReader    - 
 * 
 * Write
 *     FileWriter           - 파일과 연결해서 1글자씩 파일에 기록하는 스트림
 *     BufferedWriter       - 다른 스트림과 연결해서 쓰기 성능을 향상시키는 스트림
 *     OutputStreamWriter   - 
 *  ***PrintWriter          - 쓰기 전용 스트림, ***텍스트 기록에 최적화되어 있는 스트림 (System.out.println ...)
 */

public class IO_MyCaption { }
