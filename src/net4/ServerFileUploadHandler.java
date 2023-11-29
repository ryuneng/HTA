package net4; //20231128

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 클라이언트가 보낸 메세지
 * 1[REQ_UPLOAD]2[파일명]3[파일크기]4[파일데이터]
 */
public class ServerFileUploadHandler implements Handler {
	@Override
	public void handle(DataInputStream in, DataOutputStream out) throws IOException {
		System.out.println("### 파일서버가 파일업로드요청을 시작함...");
		
		String filename = in.readUTF();
		long size = in.readLong();
		
		File file = new File("c:/repo", filename);
		FileOutputStream fos = new FileOutputStream(file);
		long readBytes = 0;
		int len = 0;
		byte[] buf = new byte[1024];
		while ((len = in.read(buf)) != -1) {
			fos.write(buf, 0, len);
			readBytes += len;
			
			if(readBytes == size) {
				break;
			}
		}
		fos.close();
		out.writeInt(Cmd.RES_MESSAGE);
		out.writeUTF("[" + filename + "] 파일의 업로드가 완료되었습니다.");
	}
}
