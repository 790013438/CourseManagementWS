package snippets.jee.ws.soap;

import java.util.List;

import javax.jws.WebService;

@WebService
public interface ICourseManagementService {

    public List<Course> getCourses();

}
