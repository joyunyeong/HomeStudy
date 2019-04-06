package Library;

import java.util.Scanner;

public class BookSystem {
	public static void main(String[] args) {
		ListFunction lf = new ListFunction();
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.도서추가 | 2.도서삭제 | 3.도서조회 | 4.도서대여 | 5.도서반납 | 6. 종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택 > ");

			int selectNo = scan.nextInt();
			scan.nextLine();
			if (selectNo == 1)
				lf.addBook();
			else if (selectNo == 2)
				lf.delBook();
			else if (selectNo == 3)
				lf.searchBook();
			else if (selectNo == 4)
				lf.loanBook();
			else if (selectNo == 5)
				lf.returnBook();
			else if (selectNo == 6)
				run = false;
		}
		System.out.println("프로그램을 종료합니다.");
	}
}