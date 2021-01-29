package Eighth;

public class ContainerManager {
    int base;
    int start;
    int range;
    int container;

    public void manage(int base, int start, int range) {
        this.base = base;
        this.start = start;
        this.range = range;
    }

    public int processContainer() {
        container = (int)(Math.random() * range) + start;

        System.out.println("물류 창고로 넘어온 화물의 개수 = " + container);

        return container & ~(base - 1);
    }

    public boolean isBaseOf64() {
        if((container & ~(base - 1)) % 64 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getBase() {
        return base;
    }

    public int getFinalContainerCount() {
        return (container & ~(base - 1)) / base;
    }
}
