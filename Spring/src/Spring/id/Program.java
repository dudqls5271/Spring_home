package Spring.id;

import Spring.id.entity.Exam;
import Spring.id.entity.NewlecExam;
import Spring.id.ui.ExamConsole;
import Spring.id.ui.GridExamConsole;
import Spring.id.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {

		Exam exam = new NewlecExam();
		//ExamConsole console = new InlineExamConsole(exam); // DI 라는 작업 이다.
		ExamConsole console = new GridExamConsole(exam);
		console.print();
		
	}

}
