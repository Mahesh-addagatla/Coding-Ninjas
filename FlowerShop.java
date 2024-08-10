import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

 

        int arr[]=new int[n];

        for(int i=0;i<n;i++)

        arr[i]=sc.nextInt();

        

        Arrays.sort(arr);

        int count=1;

        int start=arr[0];

        for(int i=0;i<n;i++)

        {

            

            if(arr[i]>=start && arr[i]<=start+4)

            continue;

 

            start=arr[i];

            count++;

        }

        System.out.println(count);

	}

}
