package pruebas;

import java.util.List;

import daos.SubjectDaoImpl;
import daos.SubjectDao;
import model.Subject;

public class Prueba03 {

	public static void main(String[] args) {
		
		SubjectDao dao = new SubjectDaoImpl();
		List<Subject> subjectList = dao.findAll(); 
		//listar
		for(Subject s: subjectList) {
			
			System.out.println(s.getIdsubject());
			System.out.println(s.getSubject());
			System.out.println(s.getCredits());
			
			}
	}

}
