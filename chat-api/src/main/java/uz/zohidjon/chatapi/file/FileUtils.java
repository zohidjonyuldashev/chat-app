package uz.zohidjon.chatapi.file;

import io.micrometer.common.util.StringUtils;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Slf4j
public class FileUtils {

    private FileUtils() {
    }

    public static byte[] readFileFromLocation(String filePath) {
        if (StringUtils.isBlank(filePath)) {
            return new byte[0];
        }
        try {
            Path file = new File(filePath).toPath();
            return Files.readAllBytes(file);
        } catch (IOException e) {
            log.warn("No file Found in the path: {}", filePath);
        }
        return new byte[0];
    }
}
