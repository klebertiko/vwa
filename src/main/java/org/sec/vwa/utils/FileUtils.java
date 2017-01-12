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

    public File createFile(String fileName) {
        return new File(fileName);
    }

    public File writeInFile(String content, File file) throws IOException {
        return Files.write(file.toPath(), Arrays.asList(content), Charset.forName("UTF-8")).toFile();
    }

    public String fileToString(File file) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), "UTF-8");
        return IOUtils.toString(inputStreamReader);
    }
}
