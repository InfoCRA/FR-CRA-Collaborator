package fr.infocom.cra.collaborator.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.infocom.cra.collaborator.managers.TypeCollaboratorManager;
import fr.infocom.cra.collaborator.models.TypeCollaborator;

@RestController
@RequestMapping("/typescollaborateurs")
public class TypeCollaboratorController {

	@Autowired
	private TypeCollaboratorManager typeCollaboratorManager;

	/**
	 * This Get method returns the list of all types of collaborators in your
	 * database
	 * 
	 * @return list<TypeCollaborator>
	 * @see TypeCollaborator()
	 */
	@GetMapping("/lister")
	public List<TypeCollaborator> listTypeCollaborater() {
		return (List<TypeCollaborator>) typeCollaboratorManager.findAll();
	}

	/**
	 * This Get method returns an existing collaborator type in your database based
	 * on his unique identification
	 * 
	 * @param id representing a unique identification of collaborator's type
	 * @return TypeCollaborator
	 * @see TypeCollaborator()
	 */
	@GetMapping("/lister/{id}")
	public Optional<TypeCollaborator> getOneTypeCollaboratorById(@PathVariable int id) {

		Optional<TypeCollaborator> typeCollaborator = typeCollaboratorManager.findById(id);
		return typeCollaborator;
	}

	/**
	 * This Post method allows you to update the list of collaborator's type in your
	 * database by adding the type if he is new or update the informations in case
	 * the type already exist in your database.
	 * 
	 * @param TypeCollaborator
	 */
	@PostMapping("/ajouterTypeCollaborateur")
	public void addTypeCollaborator(@RequestBody TypeCollaborator typecollaborator) {
		typeCollaboratorManager.createOrUpdate(typecollaborator);
	}

	/**
	 * This delete method allows you to delete a given collaborator's type from
	 * your database
	 * 
	 * @param collaborator
	 * @see Collaborator()
	 */
	@DeleteMapping("/supprimerTypeCollaborateur")
	public void deleteTypeCollaborator(@RequestBody TypeCollaborator typecollaborator) {
		typeCollaboratorManager.delete(typecollaborator);
	}
}