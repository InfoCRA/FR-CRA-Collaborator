package fr.infocom.cra.collaborator.managers;

import java.util.Optional;

import fr.infocom.cra.collaborator.models.Collaborator;

public interface CollaboratorManager {
	public Iterable<Collaborator> findAll();
	public Optional<Collaborator> findById(int id);
	public Collaborator createOrUpdate(Collaborator collaborator);
	public void delete(Collaborator collaborator);
}