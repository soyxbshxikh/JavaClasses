public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("nothing");

        // sb.append("hello");
        System.out.println(sb.capacity()); // 16

        // sb.append("world");
        System.out.println(sb.capacity()); // 16

        sb.append("Nothing Java"); 
        System.out.println(sb); // 34 (old capacity*2)+2 or (old capacity+1)*2

        // delete
        sb.delete(2, 5);
        System.out.println(sb);

        // delete a specific character
        sb.deleteCharAt(5);
        System.out.println(sb);

        // insert charracter between the string
        sb.insert(5, "is the best");
        System.out.println(sb);

        // reverse the string
        System.out.println(sb.reverse());

        // replace the string
        System.out.println(sb.replace(2, 3, "not"));

        // subsequece
        System.out.println(sb.subSequence(2, 5));

        // to set the capacity
        System.out.println(sb.capacity());
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());

        // to set the character at any position
        sb.setCharAt(2, 'a');
        System.out.println(sb);

        // to set the maximum lenght of the string
        sb.setLength(10);
        System.out.println(sb);

        // trim the capacity of the string
        sb.ensureCapacity(100);
        sb.append("hello");
        sb.trimToSize();
        System.out.println(sb.capacity());

        StringBuilder sb1 = new StringBuilder();
        sb1.append("hello");
    }
}
