package main.regex;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<String>> mp = new HashMap<>();
        mp.put(".*alpha*.", Arrays.asList("alpha", "my name is alpha","alpha males are born rare"));    // '.' represents a single character, '*' after any expression or character represents that it can be repeated 0 to any number of times.
        mp.put("[alp]", Arrays.asList("a", "l", "p", "al", "alp", "")); // [] means any of them, a or l or p
        mp.put("Ha[a-zA-Z0-9]*", Arrays.asList("Hacker", "Ha", "HackER", "HACKEr", "Ha0123", "HackE1", "Hacker$")); // alphanumeric characters can be repeated 0 to any number of times after Ha
        mp.put("Yas.+", Arrays.asList("Yash", "Yas$", "YasHU", "Yash8"));   // + means 1 or any number of times
        mp.put("Ha[cC]ker", Arrays.asList("Hacker", "HaCker", "HacCker"));
        mp.put("Ha[^a-z]ker", Arrays.asList("Hacker", "Ha$ker", "Ha4ker")); // [^a-z] means negation of a-z, exception from a-z any char is allowed
        mp.put("^My.*", Arrays.asList("My", "My name is hacker", "My name is $34eer")); // ^My.* start with 'My' and any number of characters after that.
        mp.put("^My", Arrays.asList("My", "My name"));  // ^My start with 'My'
        mp.put("bye$", Arrays.asList("see you later bye" ,"bye"));  // end with bye
        mp.put("OMG?", Arrays.asList("OMG", "OM", "OMGG")); // ? represents 0 or 1 character, G can appear 0 or 1 time
        mp.put("..CK..", Arrays.asList("HaCKER", "HACKER", "12CK$1","HCKER")); // '.' number of dots represents number of any characters
        mp.put("[6-9][0-9]{9}", Arrays.asList("9876543210", "8976543210", "6789054231", "7654321890", "987654321"));   // phone number validation starting with digits 6-9
        mp.put("^Hi.*bye$", Arrays.asList("Hi i am going outside, bye", "Hi bye", "Hibye"));    // Starts with Hi and end with bye , any num of chars can be there btw them
        mp.put("[A-Z][a-z]{2,}", Arrays.asList("Jasper", "J", "Ja", "Joe$", "Joey", ""));   // first letter should be capital and after that all small letters which should be atleast 2
        mp.put("[a-z]{2,3}", Arrays.asList("Joe", "Jo", "Joey"));   // a-z characters should be atleast 2 and at max 3
        mp.put("[A-Z]{3}", Arrays.asList("ABC", "PUQ", "AB"));  // number of chars should be exactly 3
        mp.put("[a-j[p-r]]", Arrays.asList("a", "p", "ap", "", "pa"));  // a-j or p-r
        mp.put("^(\\d){10}", Arrays.asList("9876543210", "1234567890", "12345"));   // 10 digits number validation
        mp.put("(\\d{3}[- .]?){2}(\\d){4}", Arrays.asList("123-456-7890","1234-567-890", "123-456-789", "987.654.3210", "9857463201")); // ph num with -, . seperation or with out them validation
        mp.forEach((pattern, textList) -> {
            textList.forEach(text -> {
                System.out.println("(" + pattern + " , " + text + ")" + "    " + Pattern.matches(pattern, text));
            });
        });

//        Pattern pattern = Pattern.compile(p);
//        Matcher matcher = pattern.matcher(t);
    }
}
