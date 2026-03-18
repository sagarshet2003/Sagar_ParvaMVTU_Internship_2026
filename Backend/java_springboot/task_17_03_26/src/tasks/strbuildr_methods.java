package tasks;

public class strbuildr_methods {
	public static void main(String[] args) {
		
        // STRING METHODS
       
        System.out.println("---- STRING METHODS ----");

        String str1 = "Hello";
        String str2 = "World";

        // length
        System.out.println("Length of str1: " + str1.length());

        // concat
        String str3 = str1.concat(" ").concat(str2);
        System.out.println("Concatenation: " + str3);

        // toUpperCase
        System.out.println("Uppercase: " + str1.toUpperCase());

        // toLowerCase
        System.out.println("Lowercase: " + str2.toLowerCase());

        // charAt
        System.out.println("Character at index 1: " + str1.charAt(1));

        // substring
        System.out.println("Substring from index 1 to 4: " + str1.substring(1,4));

        // equals
        System.out.println("str1 equals str2: " + str1.equals(str2));

        // equalsIgnoreCase
        String str4 = "hello";
        System.out.println("str1 equalsIgnoreCase str4: " + str1.equalsIgnoreCase(str4));

        // contains
        System.out.println("str3 contains 'World': " + str3.contains("World"));

        // replace
        System.out.println("Replace 'Hello' with 'Hi': " + str3.replace("Hello", "Hi"));


        
        // STRINGBUILDER METHODS
      
        System.out.println("\n---- STRINGBUILDER METHODS ----");

        StringBuilder sb = new StringBuilder("Java");

        // append
        sb.append(" Programming");
        System.out.println("Append: " + sb);

        // insert
        sb.insert(5, "Language ");
        System.out.println("Insert: " + sb);

        // replace
        sb.replace(5, 13, "Coding ");
        System.out.println("Replace: " + sb);

        // delete
        sb.delete(5, 12);
        System.out.println("Delete: " + sb);

        // reverse
        sb.reverse();
        System.out.println("Reverse: " + sb);

        // length
        System.out.println("Length: " + sb.length());

        // capacity
        System.out.println("Capacity: " + sb.capacity());


       
        // STRINGBUFFER METHODS
        
        System.out.println("\n---- STRINGBUFFER METHODS ----");

        StringBuffer sbf = new StringBuffer("Learning");

        // append
        sbf.append(" Java");
        System.out.println("Append: " + sbf);

        // insert
        sbf.insert(9, " Core");
        System.out.println("Insert: " + sbf);

        // replace
        sbf.replace(0, 8, "Studying");
        System.out.println("Replace: " + sbf);

        // delete
        sbf.delete(8, 13);
        System.out.println("Delete: " + sbf);

        // reverse
        sbf.reverse();
        System.out.println("Reverse: " + sbf);

        // length
        System.out.println("Length: " + sbf.length());

        // capacity
        System.out.println("Capacity: " + sbf.capacity());

	}

}
