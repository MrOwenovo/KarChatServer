package com.example.karchatspringboot;

import com.Karchat.util.BeansUtil.KarConfiguration;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = KarConfiguration.class)
@SpringBootTest
class KarChatSpringBootApplicationTests {

//    @Resource
//    ChatService chatService;

    @Test
    void contextLoads() {

    }

}
