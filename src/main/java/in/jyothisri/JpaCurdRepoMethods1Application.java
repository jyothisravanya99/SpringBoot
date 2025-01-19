package in.jyothisri;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.jyothisri.Repository.FamilyInterface;
import in.jyothisri.Service.FamilyService;

@SpringBootApplication
public class JpaCurdRepoMethods1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(JpaCurdRepoMethods1Application.class, args);

		FamilyInterface fi = run.getBean(FamilyInterface.class);
		System.out.println(".....interface implementation class::" + fi.getClass().getName());

		FamilyService service = run.getBean(FamilyService.class);
		service.saveFamilyDetails();
		service.existRecordorNot(108);

		System.out.println("..WELCOME..");
		System.out.println(" 1. Find Family%n2.findAll family members%n3.insert family%n4.delete family");

		try (Scanner sc = new Scanner(System.in)) {

			int i=sc.nextInt();
			
			if (i == 1) {
				System.out.println(".. please enter family id ..");

				service.findFamilyById(sc.nextInt());
			} else if (i == 2) {

				service.findAllMembers();
			} else if (i == 4) {
				System.out.println(".. please enter family id .to insert.");
				int id = sc.nextInt();
				System.out.println(".. please enter family name to insert..");
				String name = sc.next();
				service.saveFamilyDetails(id, name);
			} else if (i == 4) {
				System.out.println(".. please enter family id to delete record..");
				service.deleteRecord(sc.nextInt());
			} else {
				System.out.println("...no changes...");
			}
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println(".information u provided is wrong..");
			// TODO: handle exception
		}
		
		
		

	}

}
