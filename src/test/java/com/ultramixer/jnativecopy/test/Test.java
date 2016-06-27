package com.ultramixer.jnativecopy.test;

import com.ultramixer.jnativecopy.JNativeCopy;
import com.ultramixer.jnativecopy.JNativeCopyException;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;

import java.io.File;
import java.io.IOException;

/**
 * Created by TB on 27.06.16.
 */
public class Test
{
    @org.junit.Test
    public void test()
    {
        File destDir = new File("tests-copy");
        try
        {
            JNativeCopy.copyDirectory(new File("tests"), destDir);
        }
        catch (JNativeCopyException e)
        {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }

        Assert.assertTrue(destDir.exists());

        try
        {
            FileUtils.deleteDirectory(destDir);
        }
        catch (IOException e)
        {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }
    }
}
