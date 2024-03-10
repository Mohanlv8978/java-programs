package project_1;

public class patterns {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++) {
				System.out.println(i+" ");
			}
		}
		System.out.println("------------------");
for(int i=1;i<=5;i++) 
{
	for(int j=1; j<=i;j++) 
	{
	System.out.println(j+"");	
	}
}
System.out.println("--------------------------");
int k =1;
for (int i = 1; i <=5;i++)
{

for (int j = 1; j <=i;j++)
{
System.out.print(k + " ");
k++;
}
}
	}
}

