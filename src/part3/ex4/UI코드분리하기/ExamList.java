package part3.ex4.UI코드분리하기;

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
			// 1. 크기가 5개 정도 더 큰 새로운 배열을 생성
			Exam[] temp = new Exam[size + 5];
			// 2. 값을 이주시키기
			for (int i = 0; i < size; i++)
				temp[i] = exams[i];
			// 3. list.exams가 새로만든 temp 배열을 참조
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
