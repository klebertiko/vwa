package org.sec.vwa.utils;

import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * Created by kleber on 11/01/17.
 */
public class FileUtils {

    public File createFile(String content, String fileName) throws IOException {
        Path file = Paths.get("/tmp/" + fileName + ".txt");
        return Files.write(file, Arrays.asList(content), Charset.forName("UTF-8")).toFile();
    }

    public String fileToString(Path filePath) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath.toFile()), "UTF-8");
        return IOUtils.toString(inputStreamReader);
    }
}
