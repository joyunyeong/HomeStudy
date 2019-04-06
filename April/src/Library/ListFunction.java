package Library;

import java.util.ArrayList;
import java.util.Scanner;

public class ListFunction {
	private ArrayList<Book> booklist;
	private Scanner scan;

	public ListFunction() {
		booklist = new ArrayList<Book>();
		scan = new Scanner(System.in);
	}

	public void addBook() {
		System.out.println("�߰��� ������ ������ �����ϼ��� 1.SF 2.Novel 3.Poet");
		int i = scan.nextInt();
		scan.nextLine();

		if (i == 1)
			booklist.add(new ScienceFiction());
		else if (i == 2)
			booklist.add(new Novel());
		else if (i == 3)
			booklist.add(new Poet());
		else {
			System.out.println("�߸� �� �Է��Դϴ�.");
			return;
		}

		System.out.println("bookID �� �Է��ϼ���");
		String s = scan.nextLine();

		if (findId(s)) {
			System.out.println("�ߺ��� ID�� �ֽ��ϴ�. ó������ �ٽ� �����մϴ�.");
			booklist.remove(booklist.size() - 1);
			return;
		}

		booklist.get(booklist.size() - 1).setBookId(s);

		System.out.println("������ �Է��ϼ���");
		s = scan.nextLine();
		booklist.get(booklist.size() - 1).setSubject(s);

		System.out.println("���ڸ� �Է��ϼ���");
		s = scan.nextLine();
		booklist.get(booklist.size() - 1).setAuthor(s);
		booklist.get(booklist.size() - 1).setLoaned(false);
	}

	public void delBook() {
		if (booklist.size() == 0) {
			System.out.println("���� �� ������ �����ϴ�.");
			return;
		}
		System.out.println("������ å�� ID �� �Է��ϼ���.");
		String s = scan.nextLine();
		int idx = findListIndex(s);
		if (idx == -1)
			System.out.println("ID�� �߸��Ǿ����ϴ�.");
		else {
			booklist.remove(idx);
			System.out.println(s + "������ �����Ǿ����ϴ�.");
		}

	}

	public void searchBook() {
		System.out.println("������ ��ȸ�մϴ�.");
		for (Book i : booklist) {
			System.out.print("ID : " + i.getBookId());
			System.out.print("\t���� : " + i.getSubject());
			System.out.print("\t���� : " + i.getAuthor());
			System.out.println("\t�뿩���� : " + (i.isLoaned() ? "�뿩�Ұ�" : "�뿩����"));
		}
	}

	public void loanBook() {
		System.out.println("�뿩�� å�� ID �� �Է��ϼ���.");
		String s = scan.nextLine();
		int idx = findListIndex(s);
		if (idx == -1)
			System.out.println("��ϵ��� ���� ID �Դϴ�.");
		else {
			if (booklist.get(idx).isLoaned())
				System.out.println("�뿩���Դϴ�. ������ �̿��ϼ���.");
			else {
				System.out.println("�뿩 �����մϴ�. �̿��� �ּż� �����մϴ�.");
				booklist.get(idx).setLoaned(true);
			}
		}
	}

	public void returnBook() {
		System.out.println("�ݳ��� å�� ID �� �Է��ϼ���.");
		String s = scan.nextLine();
		int idx = findListIndex(s);
		if (idx == -1)
			System.out.println("��ϵ��� ���� ID �Դϴ�.");
		else {
			if (booklist.get(idx).isLoaned()) {
				System.out.println("�̿��� �ּż� �����մϴ�.");
				System.out.println("7�ϰ� �뿩��� " + booklist.get(idx).getLateFees(7) + "�Դϴ�.");
				booklist.get(idx).setLoaned(false);
			} else
				System.out.println("�뿩���� ������ �ƴմϴ�.");
		}
	}

	public int findListIndex(String id) {
		for (int i = 0; i < booklist.size(); i++) {
			if (booklist.get(i).equals(id))
				return i;
		}
		return -1;

	}

	public boolean findId(String id) {
		for (int i = 0; i < booklist.size() - 1; i++) {
			if (booklist.get(i).equals(id))
				return true;
		}
		return false;

	}
}
