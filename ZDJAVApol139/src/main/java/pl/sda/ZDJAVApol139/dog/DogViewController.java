package pl.sda.ZDJAVApol139.dog;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class DogViewController {

    private final DogService dogService;

    @GetMapping(path = "/dogs")
    public String getDogs(Model model) {
        model.addAttribute("dogs", dogService.findAllDogs());
        return "dogs";
    }

    @GetMapping(path = "/index")
    public String getDogs() {
        return "index";
    }
}
