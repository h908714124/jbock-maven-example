package net.jbock.cp;

public class CopyFile {

    public static void main(String[] input) {
        Args args = new Args_Parser()
                .parseOrExit(input);
        System.out.println(args);
    }
}
