package Java2021_10_26_data;

import java.util.Scanner;

public class Data {
	
	public static void printDatas(int index, String[] datas) {
		System.out.println("현재 저장돼있는 값:");
		System.out.println("=============");
		
		for (int i = 0; i < index; i++) {
			System.out.println((i+1) +"."+ datas[i]);										
		}
		
		System.out.println("=============");
		
	}
	
	public static void main(String[] args) {
		
		String[] datas = new String[10];
		int index = 0;
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			// alt + shift + a = 세로모드 적용시켜보자!!
	 		System.out.println("1. 데이터 저장");
	 		System.out.println("2. 데이터 조회");
	 		System.out.println("3. 데이터 수정");
	 		System.out.println("4. 데이터 삭제");
	 		System.out.println("5. 종료");
	 		System.out.println("명령어를 입력해주세요 : ");
			int menu = Integer.parseInt(sc.nextLine());
			
			if(menu == 1) {
				System.out.println("데이터 저장");
				System.out.println("저장할 값을 입력해주세요:");
				datas[index] = sc.nextLine();
				System.out.println(datas[index] + "이/가 저장되었습니다.");
				index++;
			}
			
			
			else if(menu == 2) {
				printDatas(index, datas);				
			}
			
			
			else if(menu == 3) {
				printDatas(index, datas);
				System.out.println("몇번째 데이터를 수정하시겠습니까: ");
				int target = Integer.parseInt(sc.nextLine());
				System.out.println("어떤 값으로 수정하시겠습니까?:");
				String newtarget = sc.nextLine();
				
				datas[target - 1] = newtarget;
			}
			
			
			else if(menu == 4) {
				printDatas(index, datas);
				System.out.println("몇번째 데이터를 삭제하시겠습니까: ");
				int target = Integer.parseInt(sc.nextLine());
				
				for (int i = target; i < datas.length - 1; i++) {
					datas[i] = datas[i + 1];
				}
				
				index--;
				
			}
			
			
			else if(menu == 5) {
				System.out.println("종료");
			}
			
			
			
			
			
		}
		
		
	}

}
