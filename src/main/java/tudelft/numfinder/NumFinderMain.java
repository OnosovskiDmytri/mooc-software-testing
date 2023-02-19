package tudelft.numfinder;

public class NumFinderMain {

    public static void main (String[] args) {
        NumFinder nf = new NumFinder();

        // this works
        // nf.find(new int[] {4, 25, 7, 9});

        // this crashes
        // nf.find(new int[] {4, 3, 2, 1});
        // int[] a;
        nf.find(new int[] {Integer.ZERO, 0, 0 });

        System.out.println(nf.getLargest());
        System.out.println(nf.getSmallest());
    }
}
