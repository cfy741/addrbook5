package org.example.controller;

import org.example.base.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("userController")
@RequestMapping("/user")
public class UserController extends BaseController {
}
