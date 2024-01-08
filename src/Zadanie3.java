import java.util.HashMap;

public class Zadanie3 {

    public HashMap<String, Integer> countWords(String word) {

        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus ullamcorper, libero nec faucibus porttitor, ipsum ipsum eleifend mi, vitae elementum augue nunc euismod tellus. Aenean tempor sapien ac molestie laoreet. In accumsan eros sed urna porta, quis rhoncus nisl convallis. Mauris sit amet dolor eu ante ornare euismod quis id erat. Morbi a est at odio lacinia viverra. Mauris in arcu libero. Aenean et vehicula ligula.\n" +
                "\n" +
                "Integer aliquet tellus enim, nec placerat erat interdum volutpat. Fusce tellus lacus, elementum ut elit a, aliquam sodales sem. Etiam lobortis, enim at varius eleifend, lacus metus semper lorem, a vulputate lorem quam id purus. Praesent viverra dictum vulputate. Nam quis nisi in velit vehicula tempor. Duis condimentum libero ut nibh porttitor elementum. Nulla ultricies ex ut purus sollicitudin sagittis. Praesent convallis vitae est vitae tincidunt. Vivamus in porta lectus. Fusce ornare id velit in bibendum. In blandit nibh quam, ac tincidunt velit euismod sit amet.\n" +
                "\n" +
                "Donec aliquet nisl mi, vel imperdiet risus lacinia ut. Phasellus aliquam rutrum commodo. Ut id metus at ante pharetra vestibulum. Nulla facilisi. Duis elementum sem nec urna aliquet lobortis. Praesent porttitor ante neque, at aliquet lorem consectetur in. Duis efficitur venenatis urna non sollicitudin. Proin sit amet mollis.";
        int lenght = text.split("\\s+").length;
        System.out.println("Text has this number of words: " + lenght);

        String[] a = text.split("\\s+");
        int counter = 0;

        for (int i = 0; i < a.length; i++) {
            if (word.equals(a[i])) {
                counter++;
            }
        }
        System.out.println(counter);
        return null;
    }
}


