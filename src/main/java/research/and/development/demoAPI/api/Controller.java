package research.and.development.demoAPI.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kkularatne on 21/08/2017.
 */

@RestController
public class Controller {

        @RequestMapping("api/greeting")
        public String greeting() {
                return "Hello";
        }
}
