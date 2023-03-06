package com.beliefdavid.onmaumchildren.controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class memberManageController {

    @GetMapping("/memberList")
    public String memberListController() {
        return "membership/memberlist";
    }
}
