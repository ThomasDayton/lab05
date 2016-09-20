
/**
 * Write a description of class PersonCreator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PersonCreator
{
    // Your class begins here!
    // The person's name.
    private String name;
    // The person's age.
    private int age;
    // The person's sex.
    private String sex;
    // The person's height.
    private int height;
    // The person's weight.
    private int weight;
    // The person's Social Security number.
    private String socialSecurityNumber;
    // The person's Address.
    private String address;
    // The person's phone number.
    private String phoneNumber;
    // The person's dateOfBirth.
    private String dateOfBirth;
    
    /**
     * Description: Makes the person based on a first and last name.
     * Input: String personFirstName, String personLastName
     * Output: void
     * Purpose: To create the person and give it a name.
     * Example: Thomas Dayton
     */
    public void PersonCreator(String personFirstName, String personLastName)
    {
        name = personFirstName + " " + personLastName;
    }
    /**
     * Description: Defines the person's name.
     * Input: int personAge
     * Output: void
     * Purpose: To give the person a valid age.
     * Example: 17
     */
    public void PersonAge(int personAge)
    { 
        if (personAge < 0)
        {
            System.err.println("You must enter a valid age.");
        }
        else
        {
            age = personAge;
        }
    }
    /**
     * Description: Defines the person's sex.
     * Input: String personSex
     * Output: void
     * Purpose: To give the person a gender.
     * Example: Male
     */
    public void PersonSex(String personSex)
    {
        sex = personSex;
    }
    /**
     * Description: Defines the person's height.
     * Input: int personHeight
     * Output: void
     * Purpose: To give the person a valid height.
     * Example: 72
     */
    public void PersonHeight(int personHeight)
    {
             if (personHeight <= 0)
        {
            System.err.println("You must enter a valid height.");
        }
        else
        {
            height = personHeight;
        }
    }
    /**
     * Description: Defines the person's weight.
     * Input: int personWeight
     * Output: void
     * Purpose: To give the person a valid height.
     * Example: 191
     */
    public void PersonWeight(int personWeight)
    {
             if (personWeight <= 0)
        {
            System.err.println("You must enter a valid weight.");
        }
        else
        {
            weight = personWeight;
        }
    }
    /**
     * Description: Defines the person's Social Security Number.
     * Input: int firstThreeNumbers, int middleTwoNumbers, int lastFourNumbers
     * Output: void
     * Purpose: To give the person a valid Social Security Number.
     * Example: 111-11-1111
     */
    public void PersonSocialSecurityNumber (int firstThreeNumbers, int middleTwoNumbers, int lastFourNumbers)
    {
        if (firstThreeNumbers < 100 || firstThreeNumbers > 999)
        {
            System.err.println("You must enter three numbers for the first part.");
        }
        else if (middleTwoNumbers < 10 || middleTwoNumbers > 99)
        {
            System.err.println("You must enter two numbers for the second part.");
        }
        else if (lastFourNumbers < 1000 || lastFourNumbers > 9999)
        {
            System.err.println("You must enter four numbers for the third part.");
        }
        else
        {
            socialSecurityNumber = firstThreeNumbers + "-" + middleTwoNumbers + "-" + lastFourNumbers;
        }
    }
     /**
     * Description: Defines the person's address.
     * Input: String personAddress
     * Output: void
     * Purpose: To give the person an address.
     * Example: 17 Summit Street
     */
    public void PersonAddress(String personAddress)
    {
        address = personAddress;
    }
    /**
     * Description: Defines the person's phone number.
     * Input: int areaCode, int numBegin, int numEnd
     * Output: void
     * Purpose: To give the person a valid phone number.
     * Example: 516-702-1226
     */
    public void PersonPhoneNumber(int areaCode, int numBegin, int numEnd)
    {
        if (areaCode < 100 || areaCode > 999)
        {
             System.err.println("You must enter three numbers for the area code.");
        }
        else if (numBegin < 100 || numBegin > 999)
        {
            System.err.println("You must enter three numbers for the first group of identification numbers.");
        }
        else if (numEnd < 1000 || numEnd > 9999)
        {
            System.err.println("You must enter four numbers for the last group of identification numbers.");
        }
        else
        {
            phoneNumber = areaCode + "-" + numBegin + "-" + numEnd;
        }
    }
    /**
     * Description: Defines the person's birth date,
     * Input: int monthDate, int dayDate, int yearDate
     * Output: void
     * Purpose: To give the person a valid date of birth.
     * Example: 11 4 1998
     */
    public void PersonDateOfBirth(int monthDate, int dayDate, int yearDate)
    {
        if (monthDate < 1 || monthDate > 12)
        {
            System.err.println("You must enter a valid month number.");
        }
        else if (dayDate < 1 || dayDate > 31)
        {
            System.err.println("You must enter a valid day number.");
        }
        else if (yearDate < 1)
        {
            System.err.println("You must enter a valid year number.");
        }
         else
        {
            dateOfBirth = monthDate + ", " + dayDate + ", " + yearDate;
        }
    }
    /**
     * Description: Prints the information about the person.
     * Input: none
     * Output: void
     * Purpose: To show the user the information about the person.
     * Example: Person's name: Thomas Dayton, Person's age: 17, etc.
     */
    public void PrintPerson()
    {
        System.out.println("Person's name: " + name);
        System.out.println("Person's age: " + age);
        System.out.println("Person's gender: " + sex);
        System.out.println("Person's height: " + height + " inches");
        System.out.println("Person's weight: " + weight + " pounds");
        System.out.println("Person's Social Security Number: " + socialSecurityNumber);
        System.out.println("Person's address: " + address);
        System.out.println("Person's phone number: " + phoneNumber);
        System.out.println("Person's date of birth: " + dateOfBirth);
    }
}
//age = personAge;
        //sex = personSex;
        //height = personHeight;
        //weight = personWeight;
        //socialSecurityNumber = personSocialSecurityNumber;
        //address = personAddress;
        //phoneNumber = personPhoneNumber;
        //dateOfBirth = personDateOfBirth;