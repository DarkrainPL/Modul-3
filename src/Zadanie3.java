import java.util.HashMap;

public class Zadanie3 {

    public HashMap<String, Integer> countWords(String word) {

        HashMap<String, Integer> wordMap = new HashMap<>();
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce convallis, quam quis ornare lobortis, mauris velit dictum ex, vel finibus ante felis eget lacus. Proin erat orci, efficitur a lobortis nec, ultrices et nibh. Vivamus porttitor iaculis nunc, ac ullamcorper leo lobortis a. Sed consectetur quam eget tristique vulputate. Praesent tempor feugiat finibus. Curabitur vel velit nisi. Sed id mi ut leo suscipit luctus vitae nec enim.\n" +
                "\n" +
                "Nulla ut odio et ipsum pellentesque lobortis sed eu nulla. Maecenas vel dapibus enim. Aenean sit amet enim nunc. Suspendisse ultricies dapibus augue, quis tristique odio tempor at. Proin efficitur quam odio, eget fermentum odio hendrerit et. Vivamus tortor nisi, convallis at scelerisque in, aliquet et augue. Curabitur imperdiet ligula in nibh efficitur vehicula. Nullam aliquet risus erat, sed ultricies eros accumsan sit amet. In ante ipsum, cursus vel elit vel, commodo sodales dolor. Nulla sed sem eu erat facilisis porta ac et mauris. Pellentesque in quam ultricies, lacinia velit suscipit, dictum velit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi ac feugiat tellus. Proin placerat bibendum purus, ac mattis elit mollis ut.\n" +
                "\n" +
                "Nulla tempor odio a leo cursus faucibus. Etiam feugiat massa ut felis consectetur, non accumsan enim tristique. Cras metus turpis, convallis sed arcu molestie, hendrerit mollis lacus. Praesent leo turpis, molestie vitae facilisis facilisis, fringilla eget urna. Duis sit amet nunc sed lectus sollicitudin pretium ac id sem. Nam justo justo, iaculis accumsan ipsum id, mollis sodales ipsum. Ut leo felis, sollicitudin nec faucibus eget, molestie ac lorem. Donec luctus nulla quis orci volutpat venenatis. Aenean nec sem semper, molestie nibh a, pellentesque ex. Aliquam bibendum erat quis lectus volutpat, eget ultrices mauris tempor. In in laoreet ligula. Sed faucibus semper odio, pulvinar semper lectus scelerisque in.\n" +
                "\n" +
                "Aenean placerat tortor ornare, elementum nibh id, dapibus metus. Morbi rutrum dignissim mi a dapibus. Sed eu feugiat sapien. Ut posuere scelerisque ligula nec mollis. Mauris sed velit ex. Nunc rutrum eros ac tellus hendrerit venenatis. In et ex eu nibh consectetur varius vitae quis ex. Morbi facilisis ante orci. Maecenas sit amet nisl sed lectus ultricies scelerisque. Etiam mattis ac augue dapibus dictum. Nullam vel blandit ex. Pellentesque egestas pretium pharetra. Cras a mattis urna. In rhoncus egestas quam, id vehicula velit molestie quis. Duis lacinia libero ac erat ultrices pulvinar.\n" +
                "\n" +
                "Curabitur euismod viverra semper. Ut sollicitudin ante nisl, quis dapibus tellus facilisis nec. Duis quis diam facilisis, aliquet ex aliquet, sagittis nunc. Cras vitae euismod velit. Nulla facilisi. Quisque egestas nisl vitae eros varius semper. Praesent non odio purus. Aliquam in nisl non odio rutrum tempor nec non augue. Phasellus sit amet tincidunt lectus, eu ornare felis.\n" +
                "\n" +
                "Nunc in dapibus magna. Sed vehicula, magna in dapibus pellentesque, eros massa luctus nunc, non sodales quam felis ac erat. Aenean laoreet ut ante ac commodo. Vestibulum porta a turpis vitae venenatis. Suspendisse est dui, egestas quis hendrerit vel, scelerisque vitae nulla. Ut mollis libero vitae turpis condimentum mollis sed vitae eros. Morbi eu vulputate justo. Donec vel purus sed augue sagittis commodo.";
        text = text.replaceAll(",", "");
        text = text.replaceAll("\\.", ""); // dlaczego sama kropka "." nie działa?
        String[] stringToArray = text.split("\\s+");
        int wordCounter = 1;

        for (int i = 0; i < stringToArray.length; i++) {
            if (wordMap.containsKey(stringToArray[i])) {
                wordMap.merge(stringToArray[i], 1, Integer::sum);

            } else {
                wordMap.put(stringToArray[i], 1);
            }
        }
        if (wordMap.containsKey(word)) {
            System.out.println("String has word: " + word + " " + wordMap.get(word) + " times.");
        } else {
            System.out.println("String has word: " + word + " 0 times.");

        }
        System.out.println(wordMap);
        return null;
    }
}







