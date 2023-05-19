package os2project;

public class Philosopher implements Runnable{
    State hlp;
    Chopstick l, r;
    int id;
    public Philosopher(int id, Chopstick l, Chopstick r, State i) {
    this.hlp = i;
    this.l = l;
    this.r = r;
    this.id = id;
  }    
    private void eat() {
        try {
          Thread.sleep(2000);
        } catch (Exception e) {
        }
      }
    
      private void think() {
        try {
          Thread.sleep(2000);
        } catch (Exception e) {
        }
      }
    
      public void run() {
        while (true) {
          hlp.grabChopsticks(id, l, r);
          eat();
          hlp.releaseChopsticks(id, l, r);
          think();
        }
    }

    }
    
