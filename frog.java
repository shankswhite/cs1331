public class Frog {
    private String name;
    private int age;
    private double tongueSpeed;
    private boolean isFroglet;
    public static String species = "Rare Pepe";


    public Frog(String name) {
        this(name, 5, 5);
    }
    
    public Frog(String name, double ageInYears) {
        this(name, (int) (ageInYears * 12), 5);
    }

  public Frog(String name, int age, double tongueSpeed){
    this.name = name;
    this.age = age;
    this.tongueSpeed = tongueSpeed;
    if (age > 1 & age < 7) {
      this.isFroglet = true;
    }
    else {
      this.isFroglet = false;
    }
  }

  public void grow(int addAge) {
    if (this.age < 12) {
      if (this.age + addAge < 12) {
        this.age += addAge;
        this.tongueSpeed += addAge;
      }
      else {
        this.age += addAge;
        this.tongueSpeed += 12 - this.age;

      }
    }

    else if (this.age > 30) {
      this.age += addAge;
      this.tongueSpeed -= addAge;
    }

    if (this.age > 1 & this.age < 7) {
      this.isFroglet = true;
    }
    else {
      this.isFroglet = false;
    }

    if (this.tongueSpeed < 5) {
      this.tongueSpeed = 5;
    }



  }

    public void eat(Fly fly) {
        if (!fly.isDead()) {
            if (this.tongueSpeed > fly.getSpeed()) {
                if (fly.getMass() >= this.age * 0.5)
                    this.grow(1);
                fly.setMass(0);
            } else {
                fly.setMass(fly.getMass() + 1);
            }
        }
    }

    public String toString() {
        return String.format(
            "My name is %s and I’m a rare frog%s. I’m %d months old and my tongue has a speed of %.2f",
            this.name, this.isFroglet ? "let" : "", this.age, this.tongueSpeed);
    }

    public static void setSpecies(String str) {
        species = str;
    }

    public static String getSpecies() {
        return species;
    }




}