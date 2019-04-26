package com.infotel.TpMavenNote;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotel.TpMavenNote.metier.Devlogiciel;
import com.infotel.TpMavenNote.metier.Etudiant;
import com.infotel.TpMavenNote.metier.Formation;
import com.infotel.TpMavenNote.service.Iservice;
import com.infotel.TpMavenNote.service.ServiceImpl;




/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {	// injection xml
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

    	//Dev d = context.getBean("dev", Dev.class); 
    	//Dev d2 = context.getBean("dev2", Dev.class);
    	
    	Devlogiciel devlo = context.getBean("devlo", Devlogiciel.class);
    
    	
    	
    	System.out.println(devlo);
    	
    	// injection annotation
    	 
    	 
    	 
    	 Formation f1 = context.getBean("formation", Formation.class);    
    	 f1.setIdFormation(1);    
    	 f1.setNomFormation("java jee");
    	 
    	 
    	 Etudiant e = context.getBean("etudiant", Etudiant.class);
    	 
    	e.setIdEtudiant(1);
    	e.setNomE("Baroudi");
    	e.setPrenom("Zakarya");
        e.setFormation(f1);
    	
    	
   
	Iservice service = context.getBean("serviceImpl", ServiceImpl.class);
	service.ajouterEtudiant(e);
    System.out.println(e);	
	System.out.println("l'etudiant a bien été intégré a la formation" );
	context.close();
    }
}
