package pruebas;

import java.util.List;

import daos.SubjectDaoImpl;
import daos.SubjectDao;
import model.Subject;
import model.Subject;

public class Prueba08 {

	public static void main(String[] args) {
		
		SubjectDao dao = new SubjectDaoImpl();
		//EDITAR
		Subject subject = new Subject();
		subject.setIdsubject(1);
		subject.setSubject("BASE DE DATOS AVANZADO 2"); 
		subject.setCredits("4");
		
		
		dao.editar(subject);
		
		List<Subject> subjectList = dao.findAll(); 
		
		for(Subject s: subjectList) {
			System.out.println(s.getIdsubject());
			System.out.println(s.getSubject());
			System.out.println(s.getCredits());
			
			}
	}

}

