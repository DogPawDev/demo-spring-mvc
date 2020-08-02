package me.foodev.demospringmvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventController {

    @GetMapping("/events") //4.3 이상에서 사용 권장 함 (RequestMapping보다 이걸 권장)
    public String events(Model model){
        return "events";
    }
}
