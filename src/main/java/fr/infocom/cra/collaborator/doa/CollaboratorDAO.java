package fr.infocom.cra.collaborator.doa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.infocom.cra.collaborator.models.Collaborator;

@Repository
public interface CollaboratorDAO extends CrudRepository<Collaborator, Integer> {
	
}