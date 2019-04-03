package WorkSpace;

public class apcs {
    public static void main( String [] args) {
        String s = "Ithaca, New York, 10543";
       System.out.print(extract(s)); 
    }
    public static String extract(String s) {
        int index  =0,  i =0 ;
        while(',' != s.charAt(i)) {
            s.charAt(i);
            index++;
            i++;
        }
        return s.substring(0, index);
    }
}
