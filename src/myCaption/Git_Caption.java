package myCaption; //20231109

/*
 * Git 과 GitHub
 * 
 * Git : 분산형 버전관리 프로그램
 *  - 3가지 영역
 *  	1. Working Directory : 새로 생성한 파일, 수정한 파일이 위치하는 영역(현재 작업중인 파일)
 *  			↓ git add (파일을 커밋할 준비를 한다)
 *  	2. Staging Area		 : commit 할 준비가 된 파일들이 위치하는 영역
 *  			↓ git commit (파일을 로컬 저장소에 안전하게 저장한다)
 *  	3. Repository 		 : commit 이 완료되어 버전 관리를 받는 파일들이 위치하는 영역
 *  
 *  - 파일의 상태
 *  	1. modified : 파일을 수정하고 아직 commit 하지 않은 상태
 *  	2. staged	: 수정한 파일 혹은 새로 생성한 파일 중에서 Commit 할 것이라고 표시된 상태
 *  	3. commited : 로컬저장소에 파일이 안전하게 저장된 상태
 *  
 *  - 명령어
 *  	1. git init 			: 해당 폴더에 git 로컬 저장소를 생성한다. -> 해당 폴더에 .git 숨김폴더가 추가된다.
 *  				  			  예) C:\workspace\java-workspace\oop1>git init
 *  
 *  	2. git branch -M main   : 메인 브랜치의 이름을 main 으로 변경한다.
 *  							  - git init으로 로컬 저장소를 생성하면 master 라는 이름의 메인 브랜치가 생성되는데, 이 브랜치의 이름을 main 으로 변경하는 것
 *  							  - GitHub 원격 저장소의 메인 브랜치 이름이 main이기 때문에 원격저장소와 로컬저장소의 메인브랜치 이름을 맞춰주는 것
 *  							  예) C:\workspace\java-workspace\oop1>git branch -M main
 *  
 *  	3. git remote add 	    : 원격저장소를 추가하는 명령어
 *  							  - origin 은 원격저장소의 이름
 *  							  - https://github.com/ryuneng/oop1.git : 원격저장소의 경로
 *  							  예) git remote add origin https://github.com/ryuneng/oop1.git
 *  
 *  	4. git push origin main : 로컬저장소 main 브랜치에 저장된 내용을 원격저장소(origin)에 업로드 시킨다.
 *  							  예) C:\workspace\java-workspace\oop1>git push origin main
 *  
 *  
 * GitHub : 원격저장소를 제공하는 사이트
 *  - git push  : 로컬저장소의 변경 내용을 원격저장소에 저장하기
 *  - git pull  : 원격저장소의 최신 내용을 로컬저장소로 내려받기
 *  - git clone : 원격저장소를 내 컴퓨터에 복제하기 (내 컴퓨터 로컬 저장소에 저장됨)
 *  
 */

/*
 * 20231113
 *  1. GitHub의 원격 저장소를 복제해서 내 컴퓨터에 로컬 저장소 생성하기
 *   - java-workspace에 원격저장소를 복제한 로컬저장소가 생성된다.
 *   - java-workspace에 api라는 폴더가 추가된다.
 *    예) C:\workspace\java-workspace>git clone https://github.com/ryuneng/oop1.git
 *    
 *  2. 이클립스에서 프로젝트 추가하기
 *   java-workspace의 api 프로젝트를 이클립스에서 추가하기
 *    1) 이클립스의 package explorer 창에서 오른쪽마우스 클릭
 *      -> import 클릭
 *      -> General > Existing project into workspace 클릭
 *      -> next 버튼 클릭
 *      -> select root directory 입력창의 browse 버튼 클릭
 *      -> C:\workspace\java-workspace 디렉토리를 선택
 *      -> projects 창에 표시된 프로젝트 중에서 import 시킬 프로젝트를 선택하고 finish 버튼 클릭
 * 
 */

public class Git_Caption {

}
