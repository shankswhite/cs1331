public class Fly {
  private double mass, speed;



  public Fly(double mass, double speed) {
    this.mass = mass;
    this.speed = speed;
  }

  public Fly(double mass) {
    this(mass, 10);
  }

  public Fly() {
    this(5);
  }

  public double getMass() {
    return this.mass;
  }

  public double getSpeed() {
    return this.speed;
  }

  public void setMass(double mass) {
    this.mass = mass;
  }

  public void setSpeed(double speed) {
    this.speed = speed;
  }

  public String toString() {
    if (this.mass == 0) {
      return String.format("I’m dead, but I used to be a fly with a speed of %.2f.", this.speed);
    }
    return String.format("I’m a speedy fly with %.2f speed and %.2f mass.", this.speed, this.mass);
  }

  public void grow(int addMass) {
    if (this.mass < 20) {
      while (this.mass < 20 & addMass > 0) {
        this.speed += 1;
        this.mass += 1;
        addMass -= 1;
      }
    }
    else {
      this.speed -= 0.5 * (addMass + this.mass - 20);
    }
  }

  public boolean isDead() {
    return this.mass <= 0;
  }



}






}