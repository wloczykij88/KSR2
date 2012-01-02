/*
 * Klasa głównych operacji programu
 */
package mainlogic;

/**
 *
 * @author Ariel
 */
public class AppCentre {
    
    public void readData()
    {
        System.out.println("readData");
        DataOperations dataO = new DataOperations();
        dataO.createHistogramsOfColumns(dataO.read());
    }
    
    public void readColumn(Integer numberOfColumn)
    {
        System.out.println("readData");
        DataOperations dataO = new DataOperations();
        dataO.readColumn(numberOfColumn);
    }
    
}
