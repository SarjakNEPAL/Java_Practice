public class VariableClass {
    /*
    Instance variable
    access with object 
    is not shared with other object
    
    */    
    int instanceVariable = 120;
    /*Static variable
     * access with class
     * is shared with  other object
     */
    static int staticVariable=200;
    public static void main(String[] args) {
        /*primitive datatype
         * Declaration
         */
        byte byteValue;
        /*initialization */
        byteValue=10;
        /*declaration and initialization */
        short shortValue=100;
        /*multiple declaration */
        int intValue1, intValue2;
        intValue1=-99;intValue2=99;
        /*Multiple declaration and initialization */
        long longValue1=-999,longValue2=999;
        float floatValue=1.90f; // the letter 'f' is required
        double doubleValue=28.88d;// the letter 'd' is optional
        char charValue=28; // single letter in single quote
        boolean boolValue=false; // true/false lowercase
        
    /*Non primitive data type */
    //string
    String stringInfo1="This is a variable";
    /*using class */
    String stringInfo2= new String("Class");
    /*Object ise the same class as written above */
    VariableClass variableObj=new VariableClass();
    
    /*
     *  I LLEGAL ACTIONS FOLLOWING:
     * byte byteValue= 10; //you cannot redeclare
     * byteValue=20;//instead reassign not illegal
     * boolean boolVal3='false';// wrong datatype
     * short shortVal=10000000;// cannot exceed min or max
     */

    }
}
