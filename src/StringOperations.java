public class StringOperations {
    public static void main(String[] args) {
        String myName = "Julius";
        System.out.println(myName);
        String replaceFirst = myName.replace('J','A');
        //System.out.println(replaceFirst);
        String replaceLast = replaceFirst.replace('s','Z');
        System.out.println(replaceLast);
        String siteAddress = "www.gatech.edu";
        System.out.println(siteAddress);
        String partialString = siteAddress.substring(4,10); //first index is the first letter, second index is the one before the end of the substring
        //System.out.println(partialString);
        String moddedString = partialString.concat("1331");
        System.out.println(moddedString);
    }
}
