package com.ruoyi.activiti.modeler;

import javax.servlet.ServletOutputStream;
import javax.servlet.WriteListener;
import java.io.*;

public class FilterServletOutputStream extends ServletOutputStream
{
    private DataOutputStream stream;

    @SuppressWarnings("unused")
    private WriteListener    writeListener;

    public FilterServletOutputStream(OutputStream output)
    {
        stream = new DataOutputStream(output);
    }

    @Override
    public void write(int b) throws IOException
    {
        stream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException
    {
        stream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException
    {
        stream.write(b, off, len);
    }

    @Override
    public void setWriteListener(WriteListener writeListener)
    {
        this.writeListener = writeListener;
    }

    @Override
    public boolean isReady()
    {
        return true;
    }
}