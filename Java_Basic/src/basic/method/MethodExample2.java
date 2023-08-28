package basic.method;

/*
# 매개 변수 (parameter, argument)

1. 매개변수는 메서드를 호출할 때, 메서드 실행에 필요한 값들을
 메서드 내부로 전달하는 매개체 역할을 합니다.
 
2. 메서드 호출부에서 어떤 매개값을 전달하느냐에 따라
 메서드의 실행 결과는 달라질 수 있습니다.
 
3. 매개값을 몇 개 받아서 사용할지는 메서드를 선언할 때 선언부에서
 ()안에 미리 개수와 타입을 지정합니다.
 
4. 매개변수의 이름을 지을 때는 호출자가 선언부로 돌아와서
매개값을 확인하지 않게, 어떠한 값을 담는 변수인지
그 뜻을 알기 쉽게 지어주면 서로에게 좋습니다.

5. 매개변수를 하나도 선언하지 않을 수도 있습니다. 이 때는 메서드의 선언부에
 () 내부를 비워둡니다. 그리고 호출할 때도 ()를 비워서 호출합니다.

*/

public class MethodExample2 {
	
	//x부터 y까지의 누적합계를 구하는 메서드
	static int calcRangeTotal(int start, int end) {
		int total = 0;
		for(int i=start; i<=end; i++) {
			total += i;
		}
		return total;
	}
	
	//매개변수가 필요없는 경우
	static String selectRandomFood() {
		double rn = Math.random();
		if(rn > 0.66) {
			return "치킨";
		} else if(rn > 0.33) {
			return "족발";
		} else {
			return "삼겹살";
		}
	}
	
	//정수 n개를 전달하면 그 정수들의 총 합을 리턴하는 메서드
	static int calcNumberTotal(int[] nums) {
		int total = 0;
		for(int i=0; i<nums.length; i++) {
			total += nums[i];
		}
		/*
		for(int n : nums) {
			total += n;
		}
		*/
		return total;
	}
	
	//가변인수(가변 파라미터)를 사용한 매개변수 작성.
	//콤마로 나열되어 들어오는 여러개의 값을 배열로 묶어서 내부로 전달합니다.
	static int calcNumberTotal2(int... nums) {
		int total = 0;
		for(int n : nums) {
			total += n;
		}
		return total;
	}
	
	
	
	public static void main(String[] args) {
	
		int result = calcRangeTotal(34, 96);
		System.out.println(result);
		
		System.out.println("오늘 점심 뭐먹지???: " + selectRandomFood());
		
		int[] arr = {10, 30, 50, 70, 90, 110, 130};
		int sum = calcNumberTotal(arr);
		System.out.println("누적합: " + sum);
		
		sum = calcNumberTotal(new int[] {1,2,3,4,5,6,7});
		System.out.println("누적합: " + sum);
		
		//가변 파라미터에 값을 보낼 때는 콤마로 쭉 나열하시거나
		//배열로 포장해서 보내도 됩니다.
		sum = calcNumberTotal2(1,2,3,4,5,6,7);
		System.out.println("누적합: " + sum);
		
	}

}







