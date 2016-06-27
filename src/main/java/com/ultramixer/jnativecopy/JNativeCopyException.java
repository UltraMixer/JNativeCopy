package com.ultramixer.jnativecopy;

/**
 * Created by TB on 27.06.16.
 */
public class JNativeCopyException extends Exception
{
    public JNativeCopyException()
    {
    }

    public JNativeCopyException(String message)
    {
        super(message);
    }

    public JNativeCopyException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public JNativeCopyException(Throwable cause)
    {
        super(cause);
    }

    public JNativeCopyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
    {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
