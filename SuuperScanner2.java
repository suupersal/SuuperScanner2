/*
 * To change this template"," choose Tools | Templates
 * and open the template in the editor.
 */
package suuperscanner2;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;


import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

/**
 *
 * @author Botanica
 */
public class SuuperScanner2 {

    /**
     * @param args the command line arguments
     */

    static ArrayList<Place> keepers = new ArrayList<Place>();
    static String[] keywords = {"car wash"
    };
    public static void main(String[] args) {
        
   
        
        
        
      for(String s : keywords){
            try {
                
                
                GooglePlaces places = new GooglePlaces( "AIzaSyBbw9vmaMDVmt0AzElRC0KFyN7bJXrLl7s" );
        PlacesResult result = places.searchNearby( 34.084916f, -117.968004f, 50000, PlacesQueryOptions.create( ).keyword( s ) );
        System.out.println( "\n --Results For: "+s+"  Status: "+result.getStatus() );
       System.out.println( "---------------------------------------------------" );
        for ( Place place : result ){
            //if(place.getRating()!=null){
            if(1<5.1){
           // System.out.println( place.getName( ) + "      " +" Rating: "+place.getRating()+"      "+place.getPlaceId() );
            System.out.printf("%-45s  %7.2f  %-27s", place.getName( ), place.getRating(), place.getPlaceId());
            System.out.println("");
            keepers.add(place);
           }//}
        }
        Thread.sleep(1200);
            } catch (InterruptedException ex) {
                Logger.getLogger(SuuperScanner2.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
      System.out.println("-----------------ALL Filtered-----------");
    //  Collections.sort(keepers,new ratingcomp());
      for(Place place:keepers.toArray(new Place[keepers.size()])){
          System.out.printf("%-45s  %7.2f  %-27s", place.getName( ), place.getRating(), place.getPlaceId());
          System.out.println("");
      }
      
    }
    }

