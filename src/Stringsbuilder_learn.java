public class Stringsbuilder_learn {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Ritik");
        System.out.println(sb);
        // char at index 0
        System.out.println(sb.charAt(0));
        // set char at index 0
        sb.setCharAt(0,'p');
        System.out.println(sb);
        // insert any character
        sb.insert(0,'s');
        System.out.println(sb);
        // change setbuilder name
        sb.insert(2,'i');
        System.out.println(sb);
        sb.delete(0,3);
        System.out.println(sb);
        // appending in setbuilder
        sb.append("s");
        sb.append("h");
        System.out.println(sb);
    }
}
