import processing.core.PApplet;

public class Sketch extends PApplet {
  public void setup()
  {
    String lines[] = loadStrings("palindromes.txt");
    System.out.println("there are " + lines.length + " lines");
    for (int i=0; i < lines.length; i++) 
    {
      if(palindrome(lines[i])==true)
      {
        System.out.println(lines[i] + " IS a palindrome.");
      }
      else
      {
        System.out.println(lines[i] + " is NOT a palindrome.");
      }
    }
  }
public boolean palindrome(String word)
{
  String s="";
  for (int i=word.length()-1; i>=0; i--) {
    s=s+word.substring(i, i+1);
  }
  if (s.equals(word)) {
    return true;
  }
  return false;
}

public String reverse(String str)
{
  String sNew = new String();
  for (int i=str.length()-1; i>=0; i--) {
    sNew=sNew+str.substring(i, i+1);
  }

  return sNew;
}
public String noSpaces(String sWord) {
  String s="";
  for (int i=0; i<sWord.length(); i++) {
    if (!sWord.substring(i, i+1).equals(" ")) {
      s= s+sWord.substring(i, i+1);
    }
  }
  return s;
}
public String noCapitals(String sWord) {
  return sWord.toLowerCase();
}
public String onlyLetters(String sString) {
  String s="";
  for (int i=0; i<sString.length(); i++) {
    if (Character.isLetter(sString.charAt(i))==true) {
      s=s+sString.charAt(i);
    }
  }
  return s;
}
}
