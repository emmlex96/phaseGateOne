public class MINIPARK {
  public static int CAPACITY = 20;
    public int[] slots; 
    
    public MINIPARK() {
        slots = new int[CAPACITY]; 
    }

    public int carEnter(int carNum) {
        for (int lambo = 0; lambo < CAPACITY; lambo++) {
            if (slots[lambo] == 0) {
                slots[lambo] = carNum;
                return lambo + 1; 
            }
        }
        return -1;
    }


    public boolean carExit(int carNum) {
        for (int lambo = 0; lambo < CAPACITY; lambo++) {
            if (slots[lambo] == carNum) {
                slots[lambo] = 0;
                return true;
            }
        }
        return false; 
    }


    public void display() {
        System.out.print("Slots: ");
        for (int lambo = 0; lambo < CAPACITY; lambo++) {
            System.out.print("[" + (lambo + 1) + ":" + slots[lambo] + "] ");
        }
        System.out.println();
    }

    public int freeSlots() {
        int count = 0;
        for (int s : slots) {
            if (s == 0) count++;
        }
        return count;
    }
}
