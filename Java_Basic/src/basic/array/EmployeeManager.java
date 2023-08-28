package basic.array;

import java.util.Scanner;

public class EmployeeManager {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//사원의 정보: 사번, 이름, 나이, 부서명
		String[] userNums = new String[100];
		String[] names = new String[100];
		int[] ages = new int[100];
		String[] departments = new String[100];
		
		//실제로 입력된 데이터(사원의 정보)의 개수를 체크하는 변수.
		int count = 0;
		
		while(true) {
			System.out.println("\n========== 사원 관리 프로그램 ==========");
			System.out.println("# 1. 사원 정보 신규 등록");
			System.out.println("# 2. 모든 사원 정보 보기");
			System.out.println("# 3. 사원 정보 검색");
			System.out.println("# 4. 사원 정보 수정");
			System.out.println("# 5. 사원 정보 삭제");
			System.out.println("# 6. 프로그램 종료");			
			System.out.println("====================================");
		
			System.out.print("> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				//사원 정보 4가지를 입력받아 각 배열에 저장하는 코드를 작성.
				//사번은 중복되면 안됩니다.
				//(무한루프를 구현해서 사번 중복이 발생하면 다시 입력받기.)
				System.out.println("# 사원 정보 등록을 시작합니다.");
				System.out.print("- 사번: ");
				String empNum = sc.next();
				while(true) {
					boolean flag = false;
					for(String nums : userNums) {
						if(nums == null) break;
						if(empNum.equals(nums)) {
							System.out.println("- 이미 중복된 사번입니다.");
							flag = true;
							break;
						}
					}
					if(!flag) { // flag == false? -> 중복 발생 x
						userNums[count] = empNum;
						break; //사번 확인용 무한 루프 탈출.
					} else { //flag == true? -> 중복 발생!
						System.out.print("- 사번 재입력: ");
						empNum = sc.next();
					}	
				}
				
				System.out.print("- 이름: ");
				names[count] = sc.next();
				
				System.out.print("- 나이: ");
				ages[count] = sc.nextInt();
				
				System.out.print("- 부서명: ");
				departments[count] = sc.next();
				
				System.out.println(names[count] + "님의 정보가 정상 등록되었습니다.");
				count++; //다음 사람은 다음 인덱스에 저장하기 위해 미리 조치.
				
			} else if(menu == 2) {
				//각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성. (count)
				//만약 사용자가 사원 등록을 한 명도 하지 않았다면
				//"등록된 사원 정보가 없습니다." 를 출력하시면 됩니다.
				if(count == 0) {
					System.out.println("# 등록된 사원 정보가 없습니다.");
				} else {
					System.out.println("=============== 전체 사원 정보 ===============");
					for(int i=0; i<count; i++) {
						System.out.printf("%s\t %s\t %d세\t %s\n"
								, userNums[i], names[i], ages[i], departments[i]);
					}
				}
				
			} else if(menu == 3) {
				//입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.
				//입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다." 를 출력.
				System.out.println("# 조회하실 사원의 번호를 입력하세요.");
				System.out.print("> ");
				String empNum = sc.next();
				
				boolean flag = false;
				for(int i=0; i<count; i++) {
					if(empNum.equals(userNums[i])) {
						System.out.println("========== 사원 정보 ==========");
						System.out.printf("%s\t %s\t %d세\t %s\n"
								, userNums[i], names[i], ages[i], departments[i]);
						flag = true;
						break;
					}
				}
				if(!flag) {
					System.out.println("조회하신 사원의 정보가 없습니다.");
				}
								
			} else if(menu == 4) {
				//해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록
				//프로그램을 구성하시고, 나이와 부서를 수정하는 코드를 작성하세요.
				//사번 입력 -> 존재하는 사번이 맞다면 -> [1. 나이변경 | 2. 부서변경 | 3.취소]
				//사번이 존재하지 않는다면 없다고 얘기해 주세요.
				System.out.println("# 수정하실 사원의 번호를 입력하세요: ");
				System.out.print("> ");
				String empNum = sc.next();
				
				boolean flag= false;
				for(int i=0; i<count; i++) {
					if(empNum.equals(userNums[i])) {
						System.out.println("# " + names[i] + "님의 정보를 변경합니다.");
						menu4: while(true) {
							System.out.println("[1. 나이 변경 | 2. 부서 변경 | 3. 취소]");
							System.out.print("> ");
							int sel = sc.nextInt();
							
							switch(sel) {
							case 1:
								System.out.println("# 변경하실 나이를 입력하세요.");
								System.out.print("> ");
								ages[i] = sc.nextInt();
								System.out.printf("# 나이가 %d세로 정상 변경되었습니다.\n", ages[i]);
								break;
								
							case 2:
								System.out.println("# 변경하실 부서를 입력하세요.");
								System.out.print("> ");
								departments[i] = sc.next();
								System.out.printf("# 부서가 %s로 정상 변경되었습니다.\n", departments[i]);
								break;
								
							case 3:
								System.out.println("# 정보 수정을 취소하고 메인 메뉴로 나갑니다.");
								break menu4;
								
							default:
								System.out.println("# 변경 메뉴를 잘못 입력하셨습니다.");
							}			
						}
						flag = true;
						break;
					}
				}
				
				if(!flag) {
					System.out.println("조회하신 사원의 정보가 없습니다.");
				}
		
			} else if(menu == 5) {
				//사번을 입력받아서
				//해당 사번과 일치하는 사원의 4가지 정보를 각 배열에서 모두 삭제하고
				//삭제하기 전에 "정말 삭제하시겠습니까? [Y/N]" 를 입력받아서
				//y를 눌렀을 시에 삭제가 되도록 코드를 구성하세요.
				//배열의 크기는 줄이지 않겠습니다. 삭제할 인덱스를 기준으로 뒤에 있는 값들을
				//앞으로 한칸씩 땡기신 다음 count를 하나 내려주시면 됩니다.
				System.out.println("# 삭제하실 사원의 번호를 입력하세요: ");
				System.out.print("> ");
				String empNum = sc.next();
				
				boolean flag = false;
				for(int i=0; i<count; i++) {
					if(empNum.equals(userNums[i])) {
						System.out.println("삭제할 사원 이름: " + names[i]);
						System.out.println("정말 삭제하시겠어요? [Y/N]");
						System.out.print("> ");
						String answer = sc.next();
						
						switch(answer) {
						case "Y": case "y": case "ㅛ":
							if(i == userNums.length-1) {
								userNums[i] = null;
								names[i] = null;
								ages[i] = 0;
								departments[i] = null;
							} else {
								for(int j=i; j<count; j++) {
									userNums[j] = userNums[j+1];
									names[j] = names[j+1];
									ages[j] = ages[j+1];
									departments[j] = departments[j+1];
								}								
							}
							count--;
							System.out.println("# 삭제가 정상적으로 진행되었습니다.");							
							break;
							
						case "N": case "n": case "ㅜ":
							System.out.println("# 삭제를 취소합니다.");
							break;
							
						default:
							System.out.println("# 잘못 입력하셨습니다.");
							System.out.println("# 메인 메뉴로 이동합니다.");
						}
						
						flag = true;
						break;
					}
				}
				
				if(!flag) {
					System.out.println("조회하신 사원의 정보가 없습니다.");
				}
				
	
			} else if(menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break; // while true break
			} else {
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			}
			
		} // end while true
	
	} // end main

}
















