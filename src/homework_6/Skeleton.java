package homework_6;
//7.
public class Skeleton extends Boss{
    //8.
    private int arrowsCount;

    public int getArrowsCount() {
        return arrowsCount;
    }

    public void setArrowsCount(int arrowsCount) {
        this.arrowsCount = arrowsCount;
    }

    //9.
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Arrows Count: " + arrowsCount);
    }
}
