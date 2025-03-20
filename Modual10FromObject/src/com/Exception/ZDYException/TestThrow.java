package com.Exception.ZDYException;

public class TestThrow {
    public static void main(String[] args) {
        int[] arr = null;
        arr = new int[]{};
        try {
            System.out.println(getMax(arr));
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }

        System.out.println("瘦皮猴和马哥");
    }


    public static int getMax(int[] nums) throws NullPointerException,ArrayIndexOutOfBoundsException
    {
        if (nums==null){
            throw new NullPointerException();
        }
        if(nums.length==0){
            throw new ArrayIndexOutOfBoundsException();
        }
        System.out.println("看看我执行了吗");
        int a =nums[0];
        int temp;
        for (int i = 1; i < nums.length; i++) {
            if(a<nums[i]){
                a=nums[i];
            }

        }
        return a;
    }
}
