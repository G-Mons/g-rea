package sec01.exam04;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		//변수 설정
		String data1 = "100";
		String data2 = "a100";
		//할당
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		//계산
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);
	}
}

