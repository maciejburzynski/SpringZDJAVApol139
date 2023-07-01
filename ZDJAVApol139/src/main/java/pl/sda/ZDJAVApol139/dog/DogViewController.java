package pl.sda.ZDJAVApol139.dog;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequiredArgsConstructor
@Slf4j
public class DogViewController {

    private final DogService dogService;

    @GetMapping(path = "/dogs")
    public String getDogs(Model model) {
        model.addAttribute("dogs", dogService.findAllDogs());
        return "dogs";
    }

    @GetMapping(path = "/index")
    public String getHomepage(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
//        log.info(httpServletRequest.getRemoteAddr());
//        log.info(httpServletRequest.getProtocol());
//        log.info(httpServletRequest.toString());

        httpServletResponse.addCookie(new Cookie("JAVA139PL", "THE_BEST_BYCZQ"));
        return "index";
//        IP -> Location (rest api - outer service) -> weather api -> display current temperature/pressure/weather
    }
}
