package Spring.di;

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

		
		// ���������� �����ϴ� ������� �ڵ带 ����
		/*Exam exam = new NewlecExam();
		ExamConsole console = new InlineExamConsole(exam);
		
		console.setExam(exam); 
		console.print();*/
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("Spring/di/seting.xml");
		
		ExamConsole console = (ExamConsole) context.getBean("console");
		//ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
	}

}
 