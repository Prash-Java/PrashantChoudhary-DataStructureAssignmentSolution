package com.greatlearning.assignment.dsaprojectthree.skyscrapperserviceques1;

//Service Class
public class SkyscrapperBuildService {
    public void arrangeFloorsBottomUpDescInSkyscapper(int[] floorsArray, int totalFloorSizes) {
        //Initialising Variable To Iterate And Map Correct Floor Size To Correct Day Such That Large Floor Is At Bottom Always
        int j = totalFloorSizes;
        //My Flag To Ascertain Each Value Mapped Such That It Follows Decreasing Order Of Floor Size In Bottom Up Approach
        boolean myStatus;
        System.out.println("The order of construction is as follows ");
        for (int i = 1; i <= totalFloorSizes; i++) {
            myStatus = false;
            System.out.println("Day: " + i);
                /*1st Day nth Floor Size, 2nd Day (n-1)th Floor Size And So On.. If Correct Mapping Not Present It Will Not Print
                    Until Correct Mapping Is Found, and once found it will always print floor size in decreasing order as larger
                    floor will come first followed by decreasing order*/
            while (j >= 1 && floorsArray[j] <= i) {
                myStatus = true;
                System.out.print(j + " ");
                //Decrementing j so that next larger floor is considered and in loop upto j==1, the smallest floor size
                --j;
            }
            if (myStatus == true) {
                System.out.println();
            }
        }
    }
}
