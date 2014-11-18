/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package suuperscanner2;

import java.util.Comparator;

/**
 *
 * @author Botanica
 */
public class ratingcomp implements Comparator<Place> {
    @Override
    public int compare(Place o1, Place o2) {
        return o1.getRating().compareTo(o2.getRating());
    }
}
