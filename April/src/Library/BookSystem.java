package Library;

import java.util.Scanner;

public class BookSystem {
	public static void main(String[] args) {
		ListFunction lf = new ListFunction();
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.�����߰� | 2.�������� | 3.������ȸ | 4.�����뿩 | 5.�����ݳ� | 6. ����");
			System.out.println("----------------------------------------------------------");
			System.out.print("���� > ");

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
		System.out.println("���α׷��� �����մϴ�.");
	}
}