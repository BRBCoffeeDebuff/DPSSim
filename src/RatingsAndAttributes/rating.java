package RatingsAndAttributes;

import java.util.HashMap;
import java.util.Map;

/*
 * the ratings class will hold ratings for 
 */
public class ratings implements importableClass{
    private String name;
    private String valueType; // this will be multiplier or a percentage
    private double converter; //this will be the fully processed value in percentage of flat number
    
    // TODO add model for data importation from a file
    // rating_name,convert_to,conversion_to_percent
    // string, string, double
    public void importCSVMembers(String[] dataToImport){
        for(int i = 0; i < dataToImport.length; i++){
            if(i == 0){
                this.name = dataToImport[i];
            }
            if(i == 1){
                this.valueType = dataToImport[i];
            }
            if(i == 2){
                this.converter = Double.parseDouble(dataToImport[i]);
            }
        }
    }
    

    /***
     * 
     * @param skill the rating to be converted. Armor for ArmorPen, WeaponSpeed for haste, critRating for crit, hit Rating for hit, Dodge or parry for expertise
     * @return this will return adjusted Armor for ArmorPen, WeaponSpeed for haste, crit for critRating, hit Rating for hit, Dodge or parry for expertise
     */
    
    public double convertRating(double skill){
        if(this.name == "ArmorPen"){
            return skill * this.converter;
        }
    }
}


