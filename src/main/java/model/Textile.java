package model;

public class Textile {
    private int id;
    private String name;
    private String compound;
    private String color;
    private String country;
    private String pattern;

    public Textile(int id, String name, String compound, String color, String country, String pattern)
    {
        this.id = id;
        this.name = name;
        this.compound = compound;
        this.color = color;
        this.country = country;
        this.pattern = pattern;
    }

    public Textile(String name, String compound, String color, String country, String pattern)
    {
        id = -1;
        this.name = name;
        this.compound = compound;
        this.color = color;
        this.country = country;
        this.pattern = pattern;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }

    public String getCompound()
    {
        return compound;
    }

    public String getColor()
    {
        return color;
    }

    public String getCountry()
    {
        return country;
    }

    public String getPattern()
    {
        return pattern;
    }

}
