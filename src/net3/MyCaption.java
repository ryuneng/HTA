package net3; //20231128

/*
 * 파일 업로드 요청
 *     [Command.REQ_UPLOAD][sample.png][5000][xxxxxxxxxxxxx]
 *     // 업로드할 파일명 조회
 *     String filename = in.readUTF();
 *     // 업로드된 파일의 사이즈 조회
 *     long size = in.readLong();
 *     
 *     // 업로드된 파일데이터 처리
 *     long readBytes = 0;
 *     int len = 0;
 *     byte[] buf = new byte[1024];
 *     while ((len = in.read(buf)) != -1) {
 *         fos.write(buf, 0, len);
 *         readBytes += len;
 *         
 *         if (readBytes == size) {
 *             break;
 *         }
 *     }
 *     fos.close();
 *     
 *     
 * 파일 다운로드 요청
 *     [Command.REQ_DOWNLOAD][doc.pdf]
 *     // 다운로드할 파일명 조회
 *     String filename = in.readUTF();
 *     
 *     // 파일 다운로드 처리
 *     [RES_FILE][파일명][사이즈][xxxxxxxxxxxxxxxxx]
 *     File file = new File("c:/repo/" + filename);
 *     long size = file.length();
 *     
 *     // 명령어, 파일명, 파일사이즈 응답으로 보내기
 *     out.writeInt(Command.RES_FILE);
 *     out.writeUTF(filename);
 *     out.writeLong(size);
 *     
 *     // 파일 데이터 응답으로 보내기
 *     FileInputStream fis = new FileInputStream(file);
 *     int len = 0;
 *     byte[] buf = new byte[1024];
 *     while ((len = fis.read(buf)) != -1) {
 *         out.write(buf, 0, len);
 *     }
 *     fis.close();
 *     
 * 파일 목록 요청
 *     [Command.REQ_FILES]
 */

public class MyCaption {}
