package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.ConvertService;

@Controller
public class ConvertController {
    @Autowired
    ConvertService convertService;
    @GetMapping("/convert")
    public String tinhtoan(@RequestParam String number , Model model) {
        double result = convertService.convert(Double.parseDouble(number));
        model.addAttribute("tinhtoan",result);
        return "result";
    }
}
