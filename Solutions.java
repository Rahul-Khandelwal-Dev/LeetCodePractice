import Questions.IPO;
import Questions.PatchingArray;

public class Solutions {
    public static void main(String args[]) {
        IPO ipo = new IPO();
        PatchingArray patchingArray = new PatchingArray();
        System.out.println("Solutions");
        System.out.println("502) IPO" + ipo.findMaximizedCapital(2,0, new int[]{1, 2, 3}, new int[]{0, 1, 1}));
        System.out.println("330) Patching Array" + patchingArray.minPatches( new int[]{1,3}, 6));
    }
}
