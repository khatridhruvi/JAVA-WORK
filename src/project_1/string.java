package project_1;

public class string {
	public static void main(String[] args) {
		String name =" Hello world";
		System.out.println("\nString is :-" +name);
		System.out.println("\nLength of string is :-"+name.length());
		System.out.println("\nCharacter of index 1 is :-"+name.charAt(1));
		System.out.println("\nString in lowercase"+name.toLowerCase());
		System.out.println("\nString in uppercase"+name.toUpperCase());
		
		String name1 ="java";
		String name2 ="Java";
		
		System.out.println("\nConcat the string:-"+name1.concat(name2));
		System.out.println("\nCompare the string:-"+name1.compareTo(name2));
		System.out.println("\nCompare the string:-"+name.compareTo(name2));
		System.out.println("\nCompare the string to ignore the case:-"+name1.compareToIgnoreCase(name2));
		System.out.println("\nEqual :-"+name1.equals(name2));
		System.out.println("\nEqual to ignore the case:-"+name1.equalsIgnoreCase(name2));
		System.out.println("\nEmpty :-"+name1.isEmpty());
		System.out.println("\nTrim :-"+name.trim());
		System.out.println("\nlast index of  :-"+name1.endsWith("va"));
		
		
	}
}
