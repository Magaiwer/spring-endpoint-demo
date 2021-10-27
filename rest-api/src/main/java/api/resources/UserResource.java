package api.resources;

import br.magaiver.domain.model.User;
import br.magaiver.domain.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Magaiver Santos
 */
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserResource {

    private final UserService userService;

    @PostMapping("/user")
    public ResponseEntity<User> save(@RequestBody User user) {
        User userSave = userService.save(user);
        if (user != null) {
            return ResponseEntity.ok(userSave);
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/user")
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping("/user/{id}")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User user = userService.findById(id);
        if (user == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(user);
    }

}
