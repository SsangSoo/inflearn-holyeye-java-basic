package access.ex;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if(maxValid()) {
            count++;
        } else {
            System.out.println("최댓값을 초과할 수 없습니다.");
        }
    }

    public int getCount() {
        return count;
    }

    private boolean maxValid() {
        return count < max;
    }


}
