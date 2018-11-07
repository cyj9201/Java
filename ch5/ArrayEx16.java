// 커맨드라인(cmd창)을 통해 입력받기(예시 path dir>java java파일명 ~~~)
// 환경변수에 Java path 설정

package ch5;

public class ArrayEx16 {

	public static void main(String[] args) {
		
		System.out.println("매개변수의 개수:"+args.length);
		for(int i=0; i < args.length; i++) {
			System.out.println("args["+ i +"]= \"" + args[i] + "\"");
		}
				
	}

}
