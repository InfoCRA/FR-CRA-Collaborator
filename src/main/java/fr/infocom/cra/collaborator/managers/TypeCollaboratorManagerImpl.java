package fr.infocom.cra.collaborator.managers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.infocom.cra.collaborator.doa.TypeCollaboratorDAO;
import fr.infocom.cra.collaborator.models.TypeCollaborator;

@Service
public class TypeCollaboratorManagerImpl implements TypeCollaboratorManager {

	@Autowired
	private TypeCollaboratorDAO typeCollaboratorDAO;

	@Override
	public Iterable<TypeCollaborator> findAll() {
		return typeCollaboratorDAO.findAll();
	}

	@Override
	public Optional<TypeCollaborator> findById(int id) {
		return typeCollaboratorDAO.findById(id);
	}

	@Override
	public TypeCollaborator createOrUpdate(TypeCollaborator typeCollaborator) {
		return typeCollaboratorDAO.save(typeCollaborator);
	}

	@Override
	public void delete(TypeCollaborator typeCollaborator) {
		typeCollaboratorDAO.delete(typeCollaborator);
	}
}