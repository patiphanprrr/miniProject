package Contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService {
    @Autowired
    private userRepository repo;
    //public List<user> listAll(){
      //  return  repo.findALl();
    //}
    public void save(user us){
        repo.save(us);
    }

}
