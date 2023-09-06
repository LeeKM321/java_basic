package etc.api.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		/*
		 # ArrayList
		 - 배열과 다르게 크기가 자동으로 조절되는 자료구조 클래스.
		 - 배열과 유사한 형태이기 때문에 순차적으로 데이터에 접근하기가 좋다.
		 - 인덱스를 활용하며, 객체의 중복 저장을 허용한다.
		 */
		
		// <> -> 제네릭 (타입의 형식을 지정하여 타입 안정성을 꾀하기 위한 문법)
		List<String> nick = new ArrayList<>();
		
		String str = "야옹이";
		
		//add(객체): 리스트에 객체를 추가하는 메서드
		nick.add(str);
		nick.add("멍멍이");
		nick.add(new String("개구리"));
		nick.add("짹짹이");
		nick.add("야옹이");
		System.out.println(nick);
		
		//add(인덱스, 객체): 특정 인덱스에 객체를 삽입하는 메서드
		nick.add(3, "어흥이");
		System.out.println(nick);
		
		//get(인덱스): 리스트 내부의 객체를 참조하는 메서드
//		String name = nick[3]; (x) 배열의 방법
		String name = nick.get(3);
		System.out.println("3번 인덱스의 값: " + name);
		
		//size(): 리스트의 크기 반환
		System.out.println("nick의 크기: " + nick.size());
		
		//set(인덱스, 수정할 객체): 리스트 내부의 객체를 수정
		nick.set(2, "삐약이");
		System.out.println(nick);
		
		//remove(인덱스), remove(객체)
		nick.remove(5);
		System.out.println(nick);
		nick.remove(str);
		System.out.println(nick);
		
		//리스트의 반복문 처리
		for(int i=0; i<nick.size(); i++) {
			System.out.println(nick.get(i));
		}
		
		System.out.println("-----------------------------------------");
		
		//향상 for문 (forEach)
		for(String n : nick) {
			System.out.println(n);
		}
		
		//contains(객체): 리스트 내의 객체의 존재 유무를 파악하는 메서드.
		System.out.println(nick.contains("메뚜기"));
		
		//indexOf: 특정 객체의 인덱스 탐색
		int idx = nick.indexOf("어흥이");
		System.out.println("어흥이의 인덱스: " + idx);
		
		//clear(): 리스트 내부 요소를 전체 삭제
		nick.clear();
		System.out.println(nick);
		
		//isEmpty(): 리스트가 비어있는지의 여부 확인
		System.out.println(nick.isEmpty());
		
		/*
		 # 컬렉션 객체들은 Collections의 기능을 사용할 수 있습니다.
		 Collections는 컬렉션 객체들의 부가 기능들을 지원합니다.
		 */
		
		List<Integer> score = new ArrayList<>();
		score.add(65);

		//한번에 객체 많이 추가하기
		Collections.addAll(score, 78, 100, 88, 79, 100, 21, 56, 100);
		System.out.println(score);
		
		//컬렉션에서의 등장 횟수 구하기
		System.out.println("100점 학생 수: " + Collections.frequency(score, 100));
		
		//최대값, 최소값 구하기
		System.out.println("최대값: " + Collections.max(score));
		System.out.println("최소값: " + Collections.min(score));
		
		//오름차 정렬 (작은값부터 순서대로 커지는 정렬)
//		Collections.sort(score);
//		System.out.println(score);
		
		//내림차 정렬 (큰 값부터 순서대로 작아지는 정렬)
//		Collections.reverse(score); //역순 정렬
		Collections.sort(score, Collections.reverseOrder());
		System.out.println(score);
		
		//두 요소의 위치를 교체: swap(리스트, i, j)
		Collections.swap(score, 3, 7);
		System.out.println(score);
		
		//리스트 내의 요소를 무작위로 섞기
		Collections.shuffle(score);
		System.out.println(score);
		
		//원하는 값으로 컬렉션 초기화
		Collections.fill(score, 100);
		System.out.println(score);
		
		
		
		
	}

}








