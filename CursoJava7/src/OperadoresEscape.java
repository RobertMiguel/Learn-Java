
public class OperadoresEscape {
	
	public static void main(String[] args) {
		
		String tabExample = "This is just an \t example";
        String backspaceExample = "This is just an \bexample";
        String newLineExample = "This is just an \n example";
        String carriageReturnExample = "This is just an example \r We got into a new line ";
        String formFeedExample = "This is just an example \f We got into a new line ";
        char singleQuoteExample = '\'';
        String doubleQuotesExample = "\"This string is surrounded with double quotes\"";
        String backslashExample = "This string is surrounded with a \\ backslash ";

        System.out.println("1.: " + tabExample);
        System.out.println("2.: " + backspaceExample);
        System.out.println("3.: " + newLineExample);
        System.out.println("4.: " + carriageReturnExample);
        System.out.println("5.: " + formFeedExample);
        System.out.println("6.: " + singleQuoteExample);
        System.out.println("7.: " + doubleQuotesExample);
        System.out.println("8.: " + backslashExample);
	}

}
