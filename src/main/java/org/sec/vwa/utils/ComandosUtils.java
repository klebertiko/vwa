package org.sec.vwa.utils;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by kleber on 15/12/16.
 */
@Component
public class ComandosUtils {

    public String executarComando(String command) {

        StringBuffer stringBufferOutput = new StringBuffer();
        StringBuffer stringBufferErrorOutput = new StringBuffer();

        try {
            Process process = Runtime.getRuntime().exec(command);
            process.waitFor();
            BufferedReader bufferedReaderInput = new BufferedReader(new InputStreamReader(process.getInputStream()));

            BufferedReader bufferedReaderError = new BufferedReader(new InputStreamReader(process.getErrorStream()));

            String outputLine = "";
            System.out.println("Here is the standard output of the command:\n");
            while ((outputLine = bufferedReaderInput.readLine()) != null) {
                System.out.println(outputLine);
                stringBufferOutput.append(outputLine);
                stringBufferOutput.append("\n");
            }

            String errorLine = "";
            System.out.println("Here is the standard error of the command (if any):\n");
            while ((errorLine = bufferedReaderError.readLine()) != null) {
                System.out.println(errorLine);
                stringBufferErrorOutput.append(errorLine);
                stringBufferErrorOutput.append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return stringBufferOutput.toString();
    }
}
