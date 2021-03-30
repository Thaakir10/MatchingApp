package za.ac.cput;


/**@author Shaheed Cloete - 213239442
 *
 * Test cases
 *
 * 29 March 2021
 */
public class Names {

    String name;

    public Names(String name){
        this.name = name;
    }

    public String getNameDisabled(){return name;}

    public String getNameEquality(){return name;}

    public String getNameFailing(){return name;}

    public String getNameTimeout(){return name;}
}
