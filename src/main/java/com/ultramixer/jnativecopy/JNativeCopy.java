package com.ultramixer.jnativecopy;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;

import java.io.File;
import java.io.IOException;

/**
 * Created by TB on 27.06.16.
 */
public class JNativeCopy
{
    public static void copyDirectory(File srcDir, File destDir) throws JNativeCopyException
    {
        String line = "cp";
        CommandLine cmdLine = CommandLine.parse(line);
        cmdLine.addArgument("-a");
        cmdLine.addArgument("-p");
        cmdLine.addArgument(srcDir.getAbsolutePath());
        cmdLine.addArgument(destDir.getAbsolutePath());

        DefaultExecutor executor = new DefaultExecutor();
        try
        {
            int exitValue = executor.execute(cmdLine);
            //System.out.println("exitValue = " + exitValue);
            if (exitValue != 0)
            {
                throw new JNativeCopyException("Exit Value not 0: " + exitValue);
            }
        }
        catch (IOException e)
        {
            throw new JNativeCopyException(e);
        }
    }

}
