import java.util.Scanner;
public class test1{
	public static void main(String[] args){
		System.out.println("*".repeat(15)+"Test 1"+"*".repeat(15));
		Scanner sc = new Scanner(System.in);

		// //乘法表输出
		// System.out.println("Please enter a number(1-9): ");
		// int z=sc.nextInt();
		// int x=1;
		// while(x<=z){
		// 	int y=1;
		// 	while (y<=x){
		// 		System.out.print(x+"*"+y+"="+(x*y)+" ");
		// 		y+=1;
		// 	}
		// 	System.out.println();
		// 	x+=1;
		// }
		// sc.close();


		// //学生成绩统计
		// System.out.println("Please enter the number of your student: ");
		// int x=sc.nextInt();
		// int i=1;
		// int a=0,b=0,c=0,d=0;
		// float h=0,l=100;
		// float s=0;
		// while(i<=x){
		// 	System.out.print("Name:\t");
		// 	sc.nextLine();
		// 	String name=sc.nextLine();
		// 	System.out.print("Score:\t"  );
		// 	float j=sc.nextFloat();	
		// 	int n=(int)(j / 10)+1;
		// 	System.out.println("Grace:\t"+"*".repeat(n));
		// 	s+=j;
		// 	if (j>h){
		// 		h=j;
		// 	}
		// 	if (j<l){
		// 		l=j;
		// 	}
		// 	if (j<60){
		// 		d+=1;
		// 	}
		// 	else if (60<j&&j<70||j==60){
		// 		c+=1;
		// 	}
		// 	else if (70<j&&j<80||j==70){
		// 		b+=1;
		// 	}
		// 	else{
		// 		a+=1;
		// 	}
		// 	i+=1;
		// }
		// sc.close();
		// float p=(s/x);
		// System.out.println("平均分为：  "+p);
		// System.out.println("最高分为：  "+h);
		// System.out.println("最低分为：  "+l);
		// System.out.println("成绩分布情况为：");
		// System.out.println("不及格："+"*".repeat((d*10)/x));
		// System.out.println("合格  ："+"*".repeat((c*10)/x));
		// System.out.println("良好  ："+"*".repeat((b*10)/x));
		// System.out.println("优秀  ："+"*".repeat((a*10)/x));

		//数组
		int[] nums = new int[5];//数组大小不可变
		int i=0,m=4;
		while(i<5){
			nums[i]=sc.nextInt();
			i+=1;
		}
		while(m>=0){
			System.out.print(nums[m]+" ");
			m--;
		}

	}
}