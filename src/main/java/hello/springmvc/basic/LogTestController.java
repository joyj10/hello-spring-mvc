package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * LogTestController
 * <pre>
 * Describe here
 * </pre>
 *
 * @version 1.0,
 */
@RestController
@Slf4j
public class LogTestController {
    // 로그 선언 방식 3가지 (@Slf4j 로도 가능)
//    private final Logger log = LoggerFactory.getLogger(getClass());
//    private static final Logger log2 = LoggerFactory.getLogger(LogTestController.class);

    @GetMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);

        log.trace(" trace log = {} ", name);
        log.debug(" debug log = {} ", name);
        log.info(" info log = {} ", name);
        log.warn(" warn log = {} ", name);
        log.error(" error log = {} ", name);

        // 로그를 사용하지 않아도 a+b 계산 로직이 먼저 실행됨, 이런 방식으로 사용하면 X
        log.debug("String concat log = " + name);

        return "ok";
    }
}
