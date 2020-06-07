package Spring.di;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.login.AppConfigurationEntry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Spring.di.entity.Exam;
import Spring.di.entity.NewlecExam;
import Spring.di.ui.ExamConsole;
import Spring.di.ui.GridExamConsole;
import Spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {

		
		// 스프링에게 지시하는 방법으로 코드를 변경
		/*Exam exam = new NewlecExam();
		ExamConsole console = new InlineExamConsole(exam);
		
		console.setExam(exam); 
		console.print();*/
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("Spring/di/seting.xml");
		
		Exam exam = context.getBean(Exam.class);
		System.out.println(exam.toString());
		ExamConsole console = (ExamConsole) context.getBean("console");
		//ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
//		List<Exam> exams = new ArrayList<>();
//		exams.add(new NewlecExam(1,1,1,1));
//		
//		for (Exam e : exams) {
//			System.out.println(e);
//		}
		
	}

}
 