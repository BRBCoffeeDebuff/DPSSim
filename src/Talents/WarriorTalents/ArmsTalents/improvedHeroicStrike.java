package Talents.WarriorTalents.ArmsTalents;

import main.simsource.importableClass;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class improvedHeroicStrike extends armsTalent implements importableClass  {

    private int pointsIn;
    private String name = "improvedHeroicStrike";
    

    public improvedHeroicStrike() {
        this.pointsIn = 0;
        localParse();
    }

    // Constructor
    public improvedHeroicStrike(int pointsIn) {
        this.pointsIn = pointsIn;
    }



    @Override
    public void importCSVMembers(String[] dataToImport) {
        // TODO Auto-generated method stub
        


    }
    
    /**
     * @param file
     * @return
     */
    private void localParse(){
        // System.out.println(super.csvFileLocation);
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(super.csvFileLocation));
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();

        }
        String line;
        int lineCount = -1;
        try{
            
            while((line = br.readLine()) != null){
                lineCount+=1;
                // System.out.println(lineCount);
                switch(lineCount){

                    case 0:
                        continue;
                        

                    case 1: //this is the headerlist
                        continue;
                        
                    case 2:
                        continue;  //in this case we have a data type not needed if we can just send the data to the right class
                    default:
                        String[] params = line.split(",");
                        
                        if(params[0].equals(this.name)){
                            Boolean playerTakeBoolean = (Boolean.parseBoolean( params[5]));
                            if (playerTakeBoolean){
                                // System.out.println(params[2]);
                                this.pointsIn = Integer.parseInt(params[2]);
                            }
                        }
                }

                
            }
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
        try {
            br.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
    }


    public int getPointsIn() {
        return this.pointsIn;
    }



    public String getName() {
        return this.name;
    }
    
}
