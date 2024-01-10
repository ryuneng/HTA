package net4; //20231129

/*
 * public class Client {
 *     // 필요한 객체를 직접 생성함
 *     private Scanner scanner = new Scanner(System.in);
 *     private Map<Integer, Handler> map = new HashMap<>();
 *     
 *     public Client() {
 *         // 메뉴번호를 Key, Handler구현객체를 Value로 구성해서 Map객체에 저장
 *         map.put(Cmd.MENU_FILE_LIST, new ClientFileListHandler());
 *         map.put(Cmd.MENU_DOWNLOAD, new ClientFileDownloadHandler(scanner));
 *         map.put(Cmd.MENU_UPLOAD, new ClientFileUploadHandler(scanner));
 *         map.put(Cmd.MENU_EXIT, new ClientExitHandler());
 *     }
 *     
 *     public void showMenu() {
 *         System.out.println("1.목록조회  2.다운로드  3.업로드  0.종료");
 *         System.out.print("### 메뉴선택: ");
 *         int menu = scanner.nextInt(); // 1, 2, 3, 0
 *         // 메뉴번호로 Handler 구현객체를 조회한다.
 *         Handler h = map.get(menu);
 *         h.handle(in, out);
 *     }
 * }
 * 
 * public class Server {
 *     Map<Integer, Handler> map = new HashMap<>();
 *     
 *     public Server() {
 *         // 요청명령을 Key, Handler구현객체를 Value로 구성해서 Map객체에 저장
 *         map.put(REQ_FILE_LIST, new ClientFileListHandler());
 *         map.put(REQ_DOWNLOAD, new ClientFileDownloadHandler());
 *         map.put(REQ_UPLOAD, new ClientFileUploadHandler());
 *         
 *         // REQ_FILE_LIST는 1, REQ_DOWNLOAD는 2, REQ_UPLOAD는 3이다.
 *     }
 *     
 *     public void startup() {
 *         ...
 *         
 *         // 클라이언트가 서버로 보내는 메세지
 *         //      [REQ_FILE_LIST]
 *         //      [REQ_DOWNLOAD][doc.pdf]
 *         //      [REQ_UPLOAD][a.png][22345][xxxxxxxxxxxxx]
 *         // 클라이언트가 서버로 보낸 메세지에서 요청 명령어(1, 2, 3 중 하나)를 읽어온다.
 *         int cmd = in.readInt(); // -> 1, 2, 3 중 하나
 *         // 클라이언트가 서버로 보낸 메세지의 첫번째 부분은 항상 요청 명령어
 *         // 서버는 메세지에서 요청명령어를 읽어서 Handler 구현객체를 Map에서 가져온다.
 *         Handler h = map.get(cmd);
 *         h.handle(in, out);
 *     }
 * }
 * 
 * public class ClientFileDownloadHandler implements Handler {
 *     // 필요한 객체를 연결하기 위한 멤버변수 선언
 *     private Scanner scanner;
 *     // 객체 생성직후 생성자 실행시에 Scanner객체를 전달받아서 멤버변수에 대입한다. (-> 생성자 메소드 의존성 주입)
 *     public ClientFileDownloadHandler(Scanner scanner) {
 *         this.scanner = scanner;
 *     }
 *     
 *     public void handle(DataInputStream in, DataOutputStream out) {
 *         out.writeInt(Cmd.REQ_DOWNLOAD);
 *         
 *         System.out.println("### 업로드할 파일경로 입력: ");
 *         String path = scanner.nextString();
 *         File file = new File(path);
 *         
 *         out.writeUTF(file.getName());
 *         out.writeLong(file.length());
 *     }
 * }
 * 
 * public class ClientFileUploadHandler implements Handler {
 *     private Scanner scanner;
 *     public ClientFileUploadHandler(Scanner scanner) {
 *         this.scanner = scanner;
 *     }
 * }
 */

/*
 * 객체를 만드는 이유
 * 1. 정보를 담기 위해
 *   1) VO(Value Object) : 정보의 갯수만큼 생성
 *   2) 콜렉션 객체
 */

public class MyCaption {}
