package io.github.jotabrc.ov_sanitizer;

import org.springframework.stereotype.Component;

@Component
public class StringSanitizer implements Sanitizer<String, String> {

    @Override
    public String sanitize(String input) {

        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            sb.append(SANITIZE_MAP.getOrDefault(c, String.valueOf(c)));
        }

        return sb.toString();

    }

    @Override
    public String encode(String input) {

        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            sb.append(ENCODE_MAP.getOrDefault(c, String.valueOf(c)));
        }

        return sb.toString();
    }
}
