package ua.goit.Module3;

public class CaptainDisputeAgain {
    public int findMin(int[] triple) {
        int localMinOne = triple[0] <= triple[1] ? triple[0] : triple[1];
        int localMinTwo = triple[1] <= triple[2] ? triple[1] : triple[2];
        return localMinOne <= localMinTwo ? localMinOne : localMinTwo;
    }
}

