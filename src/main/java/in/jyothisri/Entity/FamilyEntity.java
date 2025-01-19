package in.jyothisri.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "FAMILY_MEMBERS")
public class FamilyEntity {

	@Id
	@Column(name = "FAMILY_NUMBER")
	private Integer familynumber;

	@Column(name = "FAMILY_NAME")
	private String familyName;

	@Column(name = "FAMILY_AGE")
	private Integer familyAge;

	@Column(name = "FAMILY_PROFESSION")
	private String familyProfession;

	@Column(name = "FAMILY_GENDER")
	private String familyGender;

	
	
	
	
	public FamilyEntity() {
	
	}

	public Integer getFamilynumber() {
		return familynumber;
	}

	public void setFamilynumber(Integer familynumber) {
		this.familynumber = familynumber;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public Integer getFamilyAge() {
		return familyAge;
	}

	public void setFamilyAge(Integer familyAge) {
		this.familyAge = familyAge;
	}

	public String getFamilyProfession() {
		return familyProfession;
	}

	public void setFamilyProfession(String familyProfession) {
		this.familyProfession = familyProfession;
	}

	public String getFamilyGender() {
		return familyGender;
	}

	public void setFamilyGender(String familyGender) {
		this.familyGender = familyGender;
	}

	@Override
	public String toString() {
		return "FamilyEntity [familynumber=" + familynumber + ", familyName=" + familyName + ", familyAge=" + familyAge
				+ ", familyProfession=" + familyProfession + ", familyGender=" + familyGender + "]";
	}

	
	
}
