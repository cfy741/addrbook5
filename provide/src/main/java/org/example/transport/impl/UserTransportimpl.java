package org.example.transport.impl;

import org.example.transport.UserTransport;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("UserTransport")
@RequestMapping("/user/trans")
public class UserTransportimpl implements UserTransport {

}
