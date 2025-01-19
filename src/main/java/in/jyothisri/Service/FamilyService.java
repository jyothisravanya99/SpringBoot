package in.jyothisri.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.jyothisri.Entity.FamilyEntity;
import in.jyothisri.Repository.FamilyInterface;

@Service
public class FamilyService {
	
	@Autowired
	private FamilyInterface familyInterface;
	
	public FamilyService() {
		System.out.println("....familyservice constructor...");
	}
	
	
	public void saveFamilyDetails() {
	
		/* single object
		 * FamilyEntity familyEntity=new FamilyEntity();
		 * familyEntity.setFamilynumber(1); familyEntity.setFamilyName("JAX");
		 * familyEntity.setFamilyGender("male"); familyEntity.setFamilyAge(5);
		 * familyEntity.setFamilyProfession("security");
		 * familyInterface.save(familyEntity);
		 */
		
		//list of family members added save all method
		
		FamilyEntity familyEntity1=new FamilyEntity();
		familyEntity1.setFamilynumber(101);
		familyEntity1.setFamilyName("lucy");
		familyEntity1.setFamilyGender("fmale"); 
		familyEntity1.setFamilyAge(3);
		familyEntity1.setFamilyProfession("securitycat");
		  
		  
		
		FamilyEntity familyEntity2=new FamilyEntity();
		familyEntity2.setFamilynumber(102);
		familyEntity2.setFamilyName("0AX");
		familyEntity2.setFamilyGender("fmale"); 
		familyEntity2.setFamilyAge(5);
		familyEntity2.setFamilyProfession("securitycat1");
		  
		
		FamilyEntity familyEntity3=new FamilyEntity();
		familyEntity3.setFamilynumber(103);
		familyEntity3.setFamilyName("chinnari");
		familyEntity3.setFamilyGender("fmale"); 
		familyEntity3.setFamilyAge(25);
		familyEntity3.setFamilyProfession("timepass");
		
		
		FamilyEntity familyEntity4=new FamilyEntity();
		familyEntity4.setFamilynumber(104);
		familyEntity4.setFamilyName("sri");
		familyEntity4.setFamilyGender("male"); 
		familyEntity4.setFamilyAge(29);
		familyEntity4.setFamilyProfession("sleeping");
		
		
		
   List<FamilyEntity> familyList=Arrays.asList(familyEntity1,familyEntity2,familyEntity3,familyEntity4);
   familyInterface.saveAll(familyList);
	
	}
	
	
	public FamilyEntity findFamilyById(Integer id) {
		System.out.println("...findfamilybyid method..");
		Optional<FamilyEntity> obj=	familyInterface.findById(id);
		if(obj.isPresent()) {
			
		return obj.get();
		}
		else {
			return null;
		}
	
		
	}
	
	
	public void findAllMembers() {
		System.out.println("...findallmembers method..");
		Iterable<FamilyEntity> list=	familyInterface.findAll();
		
		list.forEach(l -> System.out.println(l));
	}
	
	
	
	
	public void existRecordorNot(Integer id) {
		
		System.out.println(".....exist or not.....");
		boolean existsById = familyInterface.existsById(id);
		System.out.println(".....exist or not....."+existsById);
		
	}
	
	public void deleteRecord(Integer id) {
		System.out.println("...delete method..");
		familyInterface.deleteById(id);
		System.out.println("...successfully deleted..");
	}
	
	
	public void saveFamilyDetails(Integer id,String familyNmae) {
		System.out.println("...insertmembers method..");
		FamilyEntity familyEntity5=new FamilyEntity();
		familyEntity5.setFamilynumber(id);
		familyEntity5.setFamilyName(familyNmae);
		familyInterface.save(familyEntity5);
		System.out.println("..sucessfully inserted...");
	}
	
	
	
}
