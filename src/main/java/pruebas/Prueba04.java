package pruebas;

import java.util.List;

import daos.SubjectDaoImpl;
import daos.SubjectDao;
import model.Subject;
import model.Subject;

public class Prueba04 {

	public static void main(String[] args) {
		
		SubjectDao dao = new SubjectDaoImpl();
		//registrar
		Subject subject = new Subject();
		
		subject.setSubject("DESARROLO DE HABILIDADES PROFESIONALES");
		subject.setCredits("4");
		
		
		dao.registrar(subject);
		
		List<Subject> subjectList = dao.findAll(); 
		
		for(Subject s: subjectList) {
			System.out.println(s.getIdsubject());
			System.out.println(s.getSubject());
			System.out.println(s.getCredits());
			
			}
	}

}

