import java.util.*;

public class RandomValue {

  public boolean RandomBoolean() {
      return randomBoolean();
  }

  public int RandomInt() {
      return randomInt();
  }

  public long RandomLong() {
      return randomLong();
  }

  public float RandomFloat() {
      return randomFloat();
  }

  public double RandomDouble() {
      return randomDouble();
  }

  private boolean randomBoolean() {
      Random random = new Random();
          boolean value = random.nextBoolean();
              return value;
  }

  private int randomInt() {
      Random random = new Random();
          int value = random.nextInt();
              return value;
  }

  private long randomLong() {
      Random random = new Random();
          long value = random.nextLong();
              return value;
  }

  private float randomFloat() {
      Random random = new Random();
          float value = random.nextFloat();
              return value;
  }

  private double randomDouble() {
      Random random = new Random();
          double value = random.nextDouble();
              return value;
  }

}
