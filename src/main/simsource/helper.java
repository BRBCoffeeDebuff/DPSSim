package main.simsource;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Buffs.buff;
import RatingsAndAttributes.attributes;
import RatingsAndAttributes.ratings;
import Talents.talent;
import Talents.talentSpec;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * helper class will provide basic utility funcitons used across other classes
 */
public class helper {
    private CSVParser myParser = new CSVParser();

        private attributes myAttributes;
        private buff myBuff;
        private ratings myRatings;
        private characterClass myCharacterClass;
        private character myCharacter;
        private spell mySpell;
        private talent myTalent;
        private talentSpec myTalentSpec;
    /***
     * 
     * @param file the CSV file to search 
     * @return Map of data that contains contents of a line with first item in CSV for that line matches search term with mappings to the header row.
     */
    public void csvRead(String filePath) {
        CSVParser myCSVParser = new CSVParser();
        myCSVParser.localParse("src/main/simsource/ratings.csv");
    }




    private class CSVParser {
        private Map<String, String> headerMap = new HashMap<String, String>();
        private String[] headerList;
        private String csvClass;
        private attributes myAttributes;
        private buff myBuff;
        private ratings myRatings;
        private characterClass myCharacterClass;
        private character myCharacter;
        private spell mySpell;
        private talent myTalent;
        private talentSpec myTalentSpec;
        // private importableClass tmpClass;


        public String localParse(String file){
            BufferedReader br;
            try {
                br = new BufferedReader(new FileReader(file));
            } catch (FileNotFoundException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();

            }
            String line;
            try{
                int lineCount = 0;
                while((line = br.readLine()) != null){
                    switch(lineCount){

                        case 0:
                            csvClass = line;
                            switch(csvClass){
                                case "class=attributes":
                                    this.myAttributes = new attributes();
                                case "class=buffs":
                                    this.myBuff= new buff();
                                case "class=ratings":
                                    this.myRatings = new ratings();
                                case "class=characterClass":
                                    this.myCharacterClass = new characterClass();
                                case "class=character":
                                    this.myCharacter = new character();
                                case "class=talents":
                                    this.myTalent = new talent();
                                case "class=spells":
                                    this.mySpell = new spell();
                                case "class=talentspec":
                                    this.myTalentSpec = new talentSpec();
                            }
                            

                        case 1: //this is the headerlist
                            continue;
                            
                        case 2:
                            continue;  //in this case we have a data type not needed if we can just send the data to the right class
                        default:
                            switch(csvClass){
                                case "class=attributes":
                                    this.myAttributes.importCSVMembers(line.replace(" ", "").split(","));;
                                case "class=buffs":
                                    this.myBuff.importCSVMembers(line.replace(" ", "").split(","));
                                case "class=ratings":
                                    this.myRatings.importCSVMembers(line.replace(" ", "").split(","));
                                case "class=characterClass":
                                    this.myCharacterClass.importCSVMembers(line.replace(" ", "").split(","));
                                case "class=character":
                                    this.myCharacter.importCSVMembers(line.replace(" ", "").split(","));
                                case "class=talents":
                                    this.myTalent.importCSVMembers(line.replace(" ", "").split(","));
                                case "class=spells":
                                    this.mySpell.importCSVMembers(line.replace(" ", "").split(","));
                                case "class=talentspec":
                                    this.myTalentSpec.importCSVMembers(line.replace(" ", "").split(","));
                            }
                    }
                    lineCount++;
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
    


    public CSVParser getMyParser() {
        return this.myParser;
    }

    public void setMyParser(CSVParser myParser) {
        this.myParser = myParser;
    }

    public attributes getMyAttributes() {
        return this.myAttributes;
    }

    public void setMyAttributes(attributes myAttributes) {
        this.myAttributes = myAttributes;
    }

    public buff getMyBuff() {
        return this.myBuff;
    }

    public void setMyBuff(buff myBuff) {
        this.myBuff = myBuff;
    }

    public ratings getMyRatings() {
        return this.myRatings;
    }

    public void setMyRatings(ratings myRatings) {
        this.myRatings = myRatings;
    }

    public characterClass getMyCharacterClass() {
        return this.myCharacterClass;
    }

    public void setMyCharacterClass(characterClass myCharacterClass) {
        this.myCharacterClass = myCharacterClass;
    }

    public character getMyCharacter() {
        return this.myCharacter;
    }

    public void setMyCharacter(character myCharacter) {
        this.myCharacter = myCharacter;
    }

    public spell getMySpell() {
        return this.mySpell;
    }

    public void setMySpell(spell mySpell) {
        this.mySpell = mySpell;
    }

    public talent getMyTalent() {
        return this.myTalent;
    }

    public void setMyTalent(talent myTalent) {
        this.myTalent = myTalent;
    }

    public talentSpec getMyTalentSpec() {
        return this.myTalentSpec;
    }

    public void setMyTalentSpec(talentSpec myTalentSpec) {
        this.myTalentSpec = myTalentSpec;
    }

    }

}

