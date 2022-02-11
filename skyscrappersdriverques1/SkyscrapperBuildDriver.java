package com.greatlearning.assignment.dsaprojectthree.skyscrappersdriverques1;

import com.greatlearning.assignment.dsaprojectthree.skyscrapperserviceques1.SkyscrapperBuildService;

import java.util.Scanner;

//Driver Class
public class SkyscrapperBuildDriver {
    public static void main(String args[]) {
        //Service Class Object Reference
        SkyscrapperBuildService skyscrapperBuildService = new SkyscrapperBuildService();
        //Scanner Class Instantiation Pointing To Object Reference
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the total number of floors in the building ");
        //This value will determine n floored skyscrapper and must be mapped with n days for floor construction
        int totalFloorSizes = sc.nextInt();
        int[] floorsArray = new int[totalFloorSizes + 1];
        //Providing Floor Size Mapped With Corresponding Day and storing the same, index represents floor size
        for (int i = 1; i <= totalFloorSizes; i++) {
            System.out.println("enter the floor size given on day : " + i);
            int floorSize = sc.nextInt();
            floorsArray[floorSize] = i;
        }
        //calling service class method to determine the mapping of floor size with respective day, bottom up approach on floors
        skyscrapperBuildService.arrangeFloorsBottomUpDescInSkyscapper(floorsArray, totalFloorSizes);
    }
}