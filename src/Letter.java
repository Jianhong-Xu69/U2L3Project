public class Letter
{
    /** Prints out a complete letter by printing the greeting,
     Followed by the special message, followed by the closing */
    private String name;
    private String fromName;
    public void writeLetter(String name, String fromName)
    {
        this.name = name;
        this.fromName = fromName;
        greeting();
        specialMessage();
        closing();
        from();
    }

    public void greeting()
    {
        System.out.println("Hello, " + name);
    }

    public void specialMessage()
    {
        System.out.println("Java is pretty cool, wouldn't you say?");
    }

    public void closing()
    {
        System.out.println("See you later!");
    }
    public void from()
    {
        System.out.println("From, " + fromName);
    }
}
