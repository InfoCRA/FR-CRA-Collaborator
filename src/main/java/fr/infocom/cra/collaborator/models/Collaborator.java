package fr.infocom.cra.collaborator.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * <b>Collaborator is a representation of a staff member of Infocom Group.</b>
 * <p>
 * A collaborator is identified with this informations :
 * <ul>
 * <li>A unique identificator id.</li>
 * <li>A last name</li>
 * <li>A first name</li>
 * <li>An email address</li>
 * <li>A password</li>
 * <li>A date of entry</li>
 * <li>A date of release</li>
 * <li>A type, internal, external, commercial, etc.</li>
 * </ul>
 * </p>
 * 
 * @see 
 * 
 * @author ibenhsine
 * @version 1.0
 */

@Entity
public class Collaborator {
	@Id // clé primaire
	@GeneratedValue(strategy=GenerationType.IDENTITY) // Pour l'auto-incrément
	private int id;
	private String lastName;
	private String firstName;
	private String email;
	private String password;
	private LocalDateTime dateOfEntry;
	private LocalDateTime dateOfRelease;
	@ManyToOne
	private TypeCollaborator typeCollaborator;
	
	/**
	 * Create a new instance of Collaborator object with no arguments
	 */
	public Collaborator() {
	}
	
	/** Create a new instance of Collaborator object
	 * @param id the int representing a unique identification Collaborator
	 * @param lastName a String representing the last name of the Collaborator
	 * @param firstName a String representing the first name of the Collaborator
	 * @param email a String representing the email address of the Collaborator
	 * @param passward a String representing the password of the Collaborator
	 * @param dateOfEntry a LocalDateTime representing the date of entry of the Collaborator
	 * @param dateOfRelease a LocalDateTime representing the date of release of the Collaborator
	 * @param typeCollaborator an instance of TypeCollaborater, allowing to determine the type of the Collaborator
	 * @see TypeCollaborator
	 */
	public Collaborator(int id, String lastName, String firstName, String email, String passward,
			LocalDateTime dateOfEntry, LocalDateTime dateOfRelease, TypeCollaborator typeCollaborator) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.password = passward;
		this.dateOfEntry = dateOfEntry;
		this.dateOfRelease = dateOfRelease;
		this.typeCollaborator = typeCollaborator;
	}

	/** Returns an int representing a unique identification Collaborator
	 * @return id int
	 */
	public int getId() {
		return id;
	}

	/** Allows you to update the value of the id
	 * @param id int representing a unique identification Collaborator
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/** Returns a String representing the last name of the Collaborator
	 * @return lastName String
	 */
	public String getLastName() {
		return lastName;
	}

	/** Allows you to update the value of the lastName
	 * @param lastName a String representing the Last name of the Collaborator
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/** Returns a String representing the first name of the Collaborator
	 * @return firstName String
	 */
	public String getFirstName() {
		return firstName;
	}

	/** Allows you to update the value of the firstName
	 * @param firstName a String representing the first name of the Collaborator
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassward() {
		return password;
	}

	public void setPassward(String passward) {
		this.password = passward;
	}

	public LocalDateTime getDateOfEntry() {
		return dateOfEntry;
	}

	public void setDateOfEntry(LocalDateTime dateOfEntry) {
		this.dateOfEntry = dateOfEntry;
	}

	public LocalDateTime getDateOfRelease() {
		return dateOfRelease;
	}

	public void setDateOfRelease(LocalDateTime dateOfRelease) {
		this.dateOfRelease = dateOfRelease;
	}

	public TypeCollaborator getTypeCollaborater() {
		return typeCollaborator;
	}

	public void setTypeCollaborater(TypeCollaborator typeCollaborator) {
		this.typeCollaborator = typeCollaborator;
	}

	@Override
	public String toString() {
		return "Collaborater [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", email=" + email
				+ ", password=" + password + ", dateOfEntry=" + dateOfEntry + ", dateOfRelease=" + dateOfRelease
				+ ", typeCollaborator=" + typeCollaborator + "]";
	}
}