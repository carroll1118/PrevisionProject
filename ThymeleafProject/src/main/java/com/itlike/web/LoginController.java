package com.itlike.web;

import com.mysql.cj.util.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

  /*  @GetMapping("/login")
    public String login(){
        return "/login";
    }*/

  @PostMapping("/userLogin")
    public String userLogin(String username, String password, Model model, HttpSession session){
      if (!StringUtils.isNullOrEmpty(username)&& "123456".equals(password)){
          //记录登录状态
          session.setAttribute("user",username);
          //跳转主页
          return "redirect:/main";
      }else{
          model.addAttribute("msg","用户名或密码错误");
          return "login";
      }
  }

}
