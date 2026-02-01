package CollectionFramework.GarbageCollection;

import java.util.WeakHashMap;

public class WeakHashMapDemo {

    public static void main(String[] args) {

        WeakHashMap<String, Image> imageCache = new WeakHashMap<>();
        imageCache.put("img1", new Image("Image 1"));
        imageCache.put("img2", new Image("Image 2"));
        System.out.println(imageCache);

    }

}

class Image {

    private String name;

    public Image(String name) {
        this.name = name;
    }

}
