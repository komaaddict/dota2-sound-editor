package dotaSoundEditor;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;

class Handler implements Thread.UncaughtExceptionHandler
{

    @Override
    public void uncaughtException(Thread t, Throwable e)
    {
        Writer writer = null;
        System.err.println(e.getMessage());
        e.printStackTrace(System.err);

        try
        {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("error.txt"), "utf-8"));
            writer.write(e.getMessage());
            e.printStackTrace(new PrintStream("stackTrace.txt"));
        }
        catch (IOException ex)
        {
            //well, now you're fucked
            ex.printStackTrace();
        }
        finally
        {
            try
            {
                writer.close();
            }
            catch (Exception ex)
            {
                //super fucked
                ex.printStackTrace();
            }
        }
    }
}
