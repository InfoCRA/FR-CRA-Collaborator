package fr.infocom.cra.collaborator.managers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import fr.infocom.cra.collaborator.doa.CollaboratorDAO;
import fr.infocom.cra.collaborator.models.Collaborator;

@Service
public class CollaboratorManagerImpl implements CollaboratorManager{
	
	@Autowired
	private CollaboratorDAO collaboratorDAO;

	@Override
	public Iterable<Collaborator> findAll() {
		return collaboratorDAO.findAll();
	}

	@Override
	public Collaborator createOrUpdate(Collaborator collaborator) {
		collaborator.setPassward(BCrypt.hashpw(collaborator.getPassward(), BCrypt.gensalt(10)));
		return collaboratorDAO.save(collaborator);
	}

	@Override
	public Optional<Collaborator> findById(int id) {
		return collaboratorDAO.findById(id);
	}

	@Override
	public void delete(Collaborator collaborator) {
		collaboratorDAO.delete(collaborator);
	}
}