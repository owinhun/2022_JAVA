package part3.ex4.UI�ڵ�и��ϱ�;

public class ExamList {
	private Exam[] exams;
	private int current;

	public Exam get(int i) {
		return this.exams[i];
	}

	public void add(Exam exam) {

		Exam[] exams = this.exams;
		int size = this.current;

		if (exams.length == size) {
			// 1. ũ�Ⱑ 5�� ���� �� ū ���ο� �迭�� ����
			Exam[] temp = new Exam[size + 5];
			// 2. ���� ���ֽ�Ű��
			for (int i = 0; i < size; i++)
				temp[i] = exams[i];
			// 3. list.exams�� ���θ��� temp �迭�� ����
			this.exams = temp;
		}

		this.exams[this.current] = exam;
		this.current++;

	}

	public ExamList() {
		this.exams = new Exam[3];
		this.current = 0;

	}

	public int size() {
		return current;
	}

}
