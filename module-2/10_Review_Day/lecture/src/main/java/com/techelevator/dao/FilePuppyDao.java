package com.techelevator.dao;

import com.techelevator.model.Puppy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilePuppyDao implements PuppyDao{
    private File file;
    private Scanner input;
    private int lastId;

    public FilePuppyDao(String fileName){
        file = new File(fileName);
        try{
            input = new Scanner(file);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Puppy> getAllPuppies() {
        List<Puppy> puppyList = new ArrayList<>();
        while(input.hasNext()){
            String puppyLine = input.nextLine();
            String [] thePuppyInfo = puppyLine.split(",");
            Puppy puppy = new Puppy(Integer.parseInt(thePuppyInfo[0]), thePuppyInfo[1], Integer.parseInt(thePuppyInfo[2]),
                    thePuppyInfo[3], thePuppyInfo[4],Boolean.parseBoolean(thePuppyInfo[5]));
            puppyList.add(puppy);
        }
       lastId =  puppyList.get(puppyList.size() - 1).getPuppyId();
        input.close();
        return puppyList;
    }

    @Override
    public Puppy getPuppyById(int puppyId)  {
        try{
            input = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (true) {

            String[] thePuppyInfo = input.nextLine().split(",");
            if (Integer.parseInt(thePuppyInfo[0]) == puppyId) {
                return new Puppy(Integer.parseInt(thePuppyInfo[0]), thePuppyInfo[1], Integer.parseInt(thePuppyInfo[2]),
                        thePuppyInfo[3], thePuppyInfo[4], Boolean.parseBoolean(thePuppyInfo[5]));
            }
            return null;
        }
    }

    @Override
    public Puppy savePuppy(Puppy puppy) {
        //Open a file
        try{
            input = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        //Write the puppy to the file
            if(!input.hasNext()){
                String[] lastLine = input.nextLine().split(",");
                int newId = lastId + 1;
                puppy.setPuppyId(newId);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                    PrintWriter out = new PrintWriter(fileOutputStream);

                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        //Return the puppy
        return null;
    }

    @Override
    public Puppy updatePuppy(Puppy puppy) {
        return null;
    }

    @Override
    public void removePuppy(int puppyId) {

    }
}
