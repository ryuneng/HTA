package lang; //20231114

import java.util.Arrays;

public class SystemApp2 {
	public static void main(String[] args) {
		
		/*
		 * void arraycopy(Object src, int srcPos,
		 * 				  Object dest, int destPos, int length)
		 *  - 배열을 다른 배열에 복사한다.
		 *  - src     : 원본 배열
		 *    srcPos  : 원본 배열 복사 시작 위치
		 *    dest    : 대상 배열
		 *    destPos : 대상 배열 저장 시작 위치
		 *    length  : 원본 배열에서 복사할 원소의 갯수
		 */
		
		int[] src1 = {10, 20, 30, 40, 50};
		int[] src2 = {111, 222, 333};
		int[] dest = new int[10];
		
		System.out.println("### 복사전 배열의 상태");
		System.out.println("원본배열: " + Arrays.toString(src1));
		System.out.println("원본배열: " + Arrays.toString(src2));
		System.out.println("대상배열: " + Arrays.toString(dest));
		
		System.arraycopy(src1, 0, dest, 0, src1.length); //	원본배열 src1 0index부터의 값이 대상배열 dest의 0index부터 src1의 길이만큼 복사됨
		System.arraycopy(src2, 0, dest, src1.length, src2.length);
		
		System.out.println("\n### 복사후 배열의 상태");
		System.out.println("원본배열: " + Arrays.toString(src1));
		System.out.println("원본배열: " + Arrays.toString(src2));
		System.out.println("대상배열: " + Arrays.toString(dest));
	}
}
