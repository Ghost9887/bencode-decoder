package ghost.torrent;

import ghost.torrent.encode.Bencode;
import java.nio.file.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        
        try {
            byte[] torrentBytes = Files.readAllBytes(Path.of("big-buck-bunny.torrent"));
            String decoded = new Bencode(torrentBytes).decode();
            System.out.println("Decoded: " + decoded);
        }catch (IOException e){
            System.out.println(e);
        }
    }

    private static void printArgs(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
