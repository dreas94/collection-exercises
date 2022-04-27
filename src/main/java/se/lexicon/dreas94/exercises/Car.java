package se.lexicon.dreas94.exercises;

public class Car
{
    private int id;
    private String brand;
    private String model;

    private static int counter;

    public Car()
    {
        id = counter++;
    }

    public Car(String brand, String model)
    {
        this();
        setBrand(brand);
        setModel(model);
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }
}
