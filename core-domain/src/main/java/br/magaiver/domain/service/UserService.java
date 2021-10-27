package br.magaiver.domain.service;

import br.magaiver.domain.model.User;
import br.magaiver.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Magaiver Santos
 */
@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserService {

    private final UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }

    public User findById(long id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
