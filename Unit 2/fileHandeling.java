/*IMP FILE CLASSES:
        //READER AND WRITER CLASSES

        FileReader : INput stream that reads from the file
        FileWriter : Output streams that writes into the file
        BufferedReader : Buffered input haracter stream

        PIPE
        ->Unidirectional channel to transfer the contents to thread

        INPUT OUTPUT EXCEPTION

        IOexception - If an i/o error occurs, it is thrown
        FileNotFoundException - it is thrown if a file cant be opened (subclass of IOexception)
    */ 


//FILE IO EXCEPTION HANDELING
// import java.io.*;
// public class fileHandeling {
//     public static void main(String args[])
//     {
//         try{
//             File f =new File("newfile.dat");
//             FileReader fr = new FileReader(f);
//             int c;
//             //Read and display the file
//             while((c= fr.read())!=-1)//-1 indicates the end of file
//             {
//                 System.out.print((char) c);
//             }
//         }
//         catch(IOException e)
//         {
//             System.out.println("I/O exception "+e);
//         }
//     }
       
// }

//WRITING A CHARACTER TO FILE
// import java.io.*;

// class fileHandeling{
//     public static void main(String args[])
//     {
//         try{
//             File f = new File("file1.txt");
//             FileWriter fw = new FileWriter(f);
//             String source = "Now is the time for all good men to come to the aid of their country and pay their due taxes";
//             char buffer[] = new char [source.length()];
//             source.getChars(0, source.length(), buffer, 0);
//             for(int i =0; i<buffer.length; i++)
//             {
//                 fw.write(buffer[i]);
//             }
//             fw.close();
//         }
//         catch(IOException e)
//         {
//             System.out.println("I/O error: "+e);
//         }
//     }
// }

//RANDOM ACCESS FILE

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

class fileHandeling{
    public static void main(String args[])
    {
        try(RandomAccessFile r = new RandomAccessFile("data3.txt", "rw");)
        {
            r.writeChar('@');
            r.writeInt(7);
            r.writeDouble(4.5);
            r.seek(0);
            System.out.println(r.readChar());
            System.out.println(r.readInt());
            System.out.println(r.readDouble());
        }
        catch(IOException e)
        {
            
        }
    }
}