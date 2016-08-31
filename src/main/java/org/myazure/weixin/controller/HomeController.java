package org.myazure.weixin.controller;

import java.util.List;

import org.myazure.weixin.domain.MaOfficialAccount;
import org.myazure.weixin.domain.CurrentUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);


    @RequestMapping("/")
    public String getHomePage(@ModelAttribute("currentUser") CurrentUser currentUser, Model model,
    		@RequestParam(required = false) String error) {
        return "home";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView getLoginPage(@RequestParam(required = false) String error) {
        return new ModelAndView("login", "error", error);
    }
}