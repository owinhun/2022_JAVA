package part2.ex3�����ͱ���ȭ;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Exam[] exams = new Exam[3];
		int current = 0;

		int menu;
		int[] korsList = new int[3];
		boolean keepLoop = true;

		while (keepLoop) {
			menu = InputMenu();

			switch (menu) {
			case 1:

				InputList(exams, current);

				break;
			case 2:

				PrintList(exams, current);

				break;
			case 3:
				System.out.println("Bye~~");

				keepLoop = false;
				break;

			default:
				System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�. �޴��� 1~3�����Դϴ�.");
			}

		}
	}

	private static void PrintList(Exam[] exams,int size) {
		System.out.println("����������������������������������������");
		System.out.println("��     ���� ���      ��");
		System.out.println("����������������������������������������");
		System.out.println();

		for (int i = 0; i < size; i++) {
			Exam exam = exams[i];
			int kor = exam.kor;
			int eng = exam.eng;
			int math = exam.math;

			int total = kor + eng + math;
			float avg = total / 3.0f;

			System.out.printf("���� : %d\n", kor);
			System.out.printf("���� : %d\n", eng);
			System.out.printf("���� : %d\n", math);

			System.out.printf("���� : %3d\n", total);
			System.out.printf("��� : %6.2f\n", avg);
			System.out.println("����������������������������������������������������������������������");
		}
	}

	private static void InputList(Exam[] exams, int current) {
		Scanner scan = new Scanner(System.in);

		System.out.println("����������������������������������������");
		System.out.println("��     ���� �Է�      ��");
		System.out.println("����������������������������������������");
		System.out.println();

		int kor, eng, math;

		do {
			System.out.printf("���� : ");
			kor = scan.nextInt();

			if (kor < 0 || 100 < kor) {
				System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");
			}
		} while (kor < 0 || 100 < kor);

		do {
			System.out.printf("���� : ");
			eng = scan.nextInt();

			if (eng < 0 || 100 < eng) {
				System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");
			}
		} while (eng < 0 || 100 < eng);

		do {
			System.out.printf("���� : ");
			math = scan.nextInt();

			if (math < 0 || 100 < math) {
				System.out.println("���м����� 0~100������ ������ �Է��� �����մϴ�.");
			}
		} while (math < 0 || 100 < math);

		Exam exam = new Exam();
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;

		exams[current] = exam;
		current++;

	}

	static int InputMenu() {

		Scanner scan = new Scanner(System.in);

		System.out.println("����������������������������������������");
		System.out.println("��     ���� �޴�      ��");
		System.out.println("����������������������������������������");
		System.out.println("\t1. �����Է� ");
		System.out.println("\t2. ������� ");
		System.out.println("\t3. ���� ");
		System.out.println("\t����> ");
		int menu = scan.nextInt();

		return menu;
	}

}
