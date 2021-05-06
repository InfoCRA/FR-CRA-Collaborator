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

import fr.infocom.cra.collaborator.exceptions.CollaboratorNotFoundExecption;
import fr.infocom.cra.collaborator.managers.CollaboratorManager;
import fr.infocom.cra.collaborator.models.Collaborator;

@RestController
@RequestMapping("/collaborateurs")
public class CollaboratorController {

	@Autowired
	private CollaboratorManager collaboratorManager;
	
	/**
	 * This Get method returns the list of all collaborators in your database
	 * 
	 * @return list<Collaborator>
	 * @see Collaborator()
	 */
	@GetMapping("/lister")
	public List<Collaborator> listCollaborator() {
		return (List<Collaborator>) collaboratorManager.findAll();
	}

	/**
	 * This Get method returns an existing collaborator in your database based on
	 * his unique identification
	 * 
	 * @param id representing a unique identification Collaborator
	 * @return Collaborator
	 * @see Collaborator()
	 */
	@GetMapping("/lister/{id}")
	public Optional<Collaborator> getOneCollaboratorById(@PathVariable int id) {

		Optional<Collaborator> collaborator = collaboratorManager.findById(id);

		if (!collaborator.isPresent())
			throw new CollaboratorNotFoundExecption("Le collaborateur correspondant à l'id " + id + " n'existe pas.");

		return collaborator;
	}

	/**
	 * This Post method allows you to update the list of all collaborators in your
	 * database by adding the collaborator if he is new or update his informations
	 * in case he already exist in your database.
	 * 
	 * @param collaborator
	 * @see Collaborator()
	 */
	@PostMapping("/ajouter")
	public void addCollaborator(@RequestBody Collaborator collaborator) {
		collaboratorManager.createOrUpdate(collaborator);
	}

	/**
	 * This delete method allows you to delete a given collaborator from your
	 * database
	 * 
	 * @param collaborator
	 * @see Collaborator()
	 */
	@DeleteMapping("/supprimer")
	public void deleteCollaborator(@RequestBody Collaborator collaborator) {
		collaboratorManager.delete(collaborator);
	}
}