package io.github.jotabrc.ov_sanitizer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StringSanitizerTest {

    @Autowired
    Sanitizer<String, String> sanitizer;

    @Test
    void sanitize() {
        String result = sanitizer.sanitize("/test%4$#@!*&()\\");
        assertEquals("\\/test\\%4\\$#@!*&amp;\\(\\)\\\\", result);
    }
}