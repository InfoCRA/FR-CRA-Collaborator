package fr.infocom.cra.collaborator.managers;

import java.util.Optional;

import fr.infocom.cra.collaborator.models.TypeCollaborator;

public interface TypeCollaboratorManager {
	public Iterable<TypeCollaborator> findAll();
	public Optional<TypeCollaborator> findById(int id);
	public TypeCollaborator createOrUpdate(TypeCollaborator typeCollaborator);
	public void delete(TypeCollaborator typeCollaborator);
}