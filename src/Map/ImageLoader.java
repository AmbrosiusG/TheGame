/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Map;

import java.awt.Image;
import java.awt.Toolkit;

public class ImageLoader {

    public static Image[] imageA = new Image[4];

    public ImageLoader(String path) {
        for (int i = 0; i < imageA.length; i++) {
            imageA[i] = switch (i) {
                case 0 ->
                    Toolkit.getDefaultToolkit().getImage("src/GUI/res/grass.png");
                case 1 ->
                    Toolkit.getDefaultToolkit().getImage("src/GUI/res/grass.png");
                case 2 ->
                    Toolkit.getDefaultToolkit().getImage("src/GUI/res/grass.png");
                case 3 ->
                    Toolkit.getDefaultToolkit().getImage("src/GUI/res/grass.png");
                default ->
                    Toolkit.getDefaultToolkit().getImage("src/GUI/res/grass.png");
            };
        }

    }

}
