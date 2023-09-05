package etc.api.util.arrays;

import java.util.Arrays;

public class ArraysQuiz {
	
	public static String solution(String[] participant, String[] completion) {
		
		/*
		 - 참가한 사람의 이름이 담긴 배열 participant와
		 완주한 사람의 이름이 담긴 배열 completion이 주어질 때
		 완주하지 못한 선수의 이름을 return하는 solution 함수를 완성하세요.
		 완주하지 못한 자는 1명이라고 가정합니다.
		*/
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for(int i=0; i<completion.length; i++) {
			if(!participant[i].equals(completion[i])) {
				return participant[i];
			}
		}
		
		return participant[participant.length - 1];
		
			
	}

	public static void main(String[] args) {
		
		String[] participant = {"홍길동", "김길동", "김철수", "최철수", "박영희"};
		String[] completion = {"김철수", "박영희", "김길동", "최철수"};
		
		System.out.println("완주하지 못한 자: " + solution(participant, completion));

	}

}
