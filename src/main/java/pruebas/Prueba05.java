package pruebas;

import java.util.List;

import daos.SubjectDaoImpl;
import daos.SubjectDao;
import model.Subject;
import model.Subject;

public class Prueba05 {

	public static void main(String[] args) {
		
		SubjectDao dao = new SubjectDaoImpl();
		//EDITAR
		Subject subject = new Subject();
		subject.setIdsubject(4);
		subject.setSubject("ARQUITECTURA DE ENTORNO WEB"); 
		subject.setCredits("5");
		
		
		dao.editar(subject);
		
		List<Subject> subjectList = dao.findAll(); 
		
		for(Subject s: subjectList) {
			System.out.println(s.getIdsubject());
			System.out.println(s.getSubject());
			System.out.println(s.getCredits());
			
			}
	}

}

