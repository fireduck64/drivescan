import java.io.*;
import com.google.common.primitives.Bytes;

public class DriveScan
{
  public static void main(String args[]) throws Exception
  {

    if (args.length != 3)
    {
      System.out.println("DriveScan <src_drive> <search_string> <dest_path>");
      System.out.println("Example: DriveScan \\\\\\\\.\\\\c: snow:123 c:\\\\solutions");
      return;

    }
    String src=args[0];
    String search=args[1];
    String dest=args[2];

    File dst_dir = new File(dest);
    if (!dst_dir. isDirectory())
    {
      System.out.println("Dest is not directory: " + dest);
      return;
    }


    DataInputStream in = new DataInputStream(new FileInputStream(src));
    byte[] content = new byte[1048576];
    byte[] search_b = search.getBytes();
    long mb=0;
    try
    {
      while(true)
      {
        in.readFully(content);
        if (Bytes.indexOf(content, search_b)>0)
        {
          System.out.println("String found in mb " + mb);

          File out = new File(dest,"mb_" + mb);
          FileOutputStream fout = new FileOutputStream(out,false);
          fout.write(content);
          fout.flush();
          fout.close();

        }
        mb++;
      }
    }
    catch(EOFException e)
    {
      System.out.println("Completed read");
    }


  }

}
