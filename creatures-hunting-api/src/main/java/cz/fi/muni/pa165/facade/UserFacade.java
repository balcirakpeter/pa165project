package cz.fi.muni.pa165.facade;

import cz.fi.muni.pa165.dto.UserDTO;

import java.util.List;

/**
 * Facade interface for UserDTO entities.
 *
 * @author Balcirak Peter <peter.balcirak@gmail.com>
 */
public interface UserFacade {

	List<UserDTO> getAllUsers();

	boolean isAdmin(UserDTO user);

	UserDTO findUserById(Long userId);

	UserDTO findUserByEmail(String email);

	void removeUser(UserDTO user);

	Long createUser(UserDTO user);
}
