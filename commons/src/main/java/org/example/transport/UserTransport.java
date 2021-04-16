package org.example.transport;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "provider")
@RequestMapping("/user/trans")
public interface UserTransport {
}
