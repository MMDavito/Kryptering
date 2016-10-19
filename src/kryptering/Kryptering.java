/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kryptering;

import javax.swing.JOptionPane;

/**
 *
 * @author daca97002
 */
public class Kryptering {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        String rövartext = JOptionPane.showInputDialog("Sätt in din rövartext här");
        String fultext = codeR(rövartext);
        String avKryp = deCryptR(fultext);
        System.out.println("Rövartext: "+rövartext);
        System.out.println("Avkrypt ä: "+avKryp);
        System.out.println("Crypttext: "+ fultext);
        
        
    }

    private static String codeR(String text) {
        for (int i = 0; i < text.length(); i++) {
            //kontroll om konsonant
            
            if (checkC(text.charAt(i))) {
               //lägg in 0+konsonant
              text = text.substring(0,i+1) + "o"+text.charAt(i)+text.substring(i+1);
              i+=2;
            }

        }
        return text;
    }

    private static boolean checkC(char c) {
        switch (c) {
            case 'a':
                return false;
            case 'A':
                return false;
            case 'e':
                return false;
            case 'E':
                return false;
            case 'i':
                return false;
            case 'I':
                return false;
            case 'o':
                return false;
            case 'O':
                return false;
            case 'u':
                return false;
            case 'U':
                return false;
            case 'y':
                return false;
            case 'Y':
                return false;
            case 'å':
                return false;
            case 'Å':
                return false;
            case 'ä':
                return false;
            case 'Ä':
                return false;
            case 'ö':
                return false;
            case 'Ö':
                return false;
            case ' ':
                return false;
            default:
                return true;
        }
    }
    private static String deCryptR(String rövare){
        String temp = "";
        int j= 0;
        for (int i = 0; i < rövare.length(); i++) {
            if(checkC(rövare.charAt(i))){
               temp += rövare.substring(j, i);
               i += 2;
               j = i;
            }
            else{
                temp += rövare.substring(j, i);
            j = i;}
                        
        }return temp+rövare.charAt(rövare.length()-1);
       

    }


   /* public static void main(String[] args) {
        
        
        String skit = JOptionPane.showInputDialog("Mata in vad du vill krypta");
        skit = skit.toLowerCase();
        int i = 0;
        String bygge ="";
        for (int j = 0; j < skit.length(); j++) {      
            bygge = bygge + iron(konstKrypt(skit.charAt(j)));
        
        }
     /*   for (int j = 0; j < bygge.length(); j++) {
          //lägg in saker för att ändra runt lite   
        }
        System.out.println(""+bygge);
    }
    public static char iron(int beast){
    if (beast>0){
        

    switch(beast){
        case 1: return 'a';
        case 2: return 'b';
        case 3: return 'c';
        case 4: return 'd';
        case 5: return 'e';
        case 6: return 'f';
        case 7: return 'g';
        case 8: return 'h';
        case 9: return 'i';
        case 10: return 'j';
        case 11: return 'k';
        case 12: return 'l';
        case 13: return 'm';
        case 14: return 'n';
        case 15: return 'o';
        case 16: return 'p';
        case 17: return 'q';
        case 18: return 'r';
        case 19: return 's';
        case 20: return 't';
        case 21: return 'u';
        case 22: return 'v';
        case 23: return 'w';
        case 24: return 'x';
        case 25: return 'y';
        case 26: return 'z';
        case 27: return 'å';
        case 28: return 'ä';
        case 29: return 'ö';
        case 30: return '.';
        
    }
    
    
    }
    return ' ';
    }
    
    
    public static int konstKrypt(char bokstav){
        int index = 0;
    switch(bokstav){
        case'a':  index = 1;break;
        case'b': index =2;break;
        case'c': index =3;break;
        case'd': index =4;break;
        case'e': index =5;break;
        case'f': index =6;break;
        case'g': index =7;break;
        case'h': index =8;break;
        case'i': index =9;break;
        case'j': index =10;break;
        case'k': index =11;break;
        case'l': index =12;break;
        case'm': index =13;break;
        case'n': index =14;break;
        case'o': index =15;break;
        case'p': index =16;break;
        case'q': index =17;break;
        case'r': index =18;break;
        case's': index =19;break;
        case't': index =20;break;
        case'u': index =21;break;
        case'v': index =22;break;
        case'w': index =23;break;
        case'x': index =24;break;
        case'y': index =25;break;
        case'z': index =26;break;
        case'å': index =27;break;
        case'ä': index =28;break;
        case'ö': index =29;break;
        case' ': index =30;break;
        default: index =-1;
            }    
        index += index + 6;
        
        if (index > 30){
        index = index -6*6 ;}
           
            return index;*/
    }
    