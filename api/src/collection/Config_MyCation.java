package collection; //20231120

/*
 * Properties 파일에 값을 숨겨놓고, 
 * 실제 class 소스코드에는 상수값을 넣지 않는다.
 */

/*
 * config.properties
 * ----------------------------------
 * email.server.ip=192.168.0.4
 * email.server.port=3000
 * email.server.user=admin
 * email.server.password=zxcv1234
 * 
 * 
 * config.yaml (*규칙: 2칸씩 들여쓰기 + name과 value 사이(:콜론 뒤)는 한칸 띄어쓰기
 * ----------------------------------
 * email:
 *   server:
 *     ip: 192.168.0.4
 *     port: 3000
 *     user: admin
 *     password: zxcv1234
 *     
 *     
 * config.json
 * ----------------------------------
 * {"email":
 *   {
 *    "ip":"192.168.0.4",
 *    "port":3000,
 *    "port":"admin",
 *    "port":zxcv1234,
 *   }
 * }
 * 
 * 
 * config.xml
 * ----------------------------------
 * <?xml version="1.0" encoding="utf-8"?>
 * <config>
 * 		<email>
 * 				<ip>192.168.0.4</ip>
 * 				<port>3000</port>
 * 				<admin>admin</admin>
 * 				<password>zxcv1234</password>
 * 		</email>
 * </config>
 */

public class Config_MyCation {

}
