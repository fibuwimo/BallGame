import java.util.*;
public class AkitaMain{
	public static void main(String[] args){
		int[] nums = new int[100];
		for(int i =0;i<100;i++){
			nums[i]=i;
		}
		for(int i =0;i<nums.length-1;i++){
			int rnd = new Random().nextInt(nums.length-i)+i;
			int temp = nums[i];
			nums[i] = nums[rnd];
			nums[rnd] = temp;
		}
		for(int i =0;i<10;i +=2){
			for(int j =i;j<i+2;j +=2){
				System.out.println(i/2+1+"回戦");
				int a = nums[j];
				int b = nums[j+1];
				System.out.printf("A:%d,B:%d…",a,b);
				System.out.println(a>b?"Aの勝ち":"Bの勝ち");
			}
		}
	}
}