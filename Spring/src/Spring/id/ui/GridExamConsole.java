package Spring.id.ui;

import Spring.id.entity.Exam;

public class GridExamConsole implements ExamConsole {

	private Exam exam;

	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}

	@Override
	public void print() {
		
	}

}
