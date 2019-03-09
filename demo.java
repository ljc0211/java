import java.util.Scanner;

class Person
{
	int num;
	boolean in;
	
	Person(){
		this.num = 0;
		this.in = true;
	}
}

public class demo
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int n, s, m;
		
		n = input.nextInt();//������
		s = input.nextInt();//��ʼ����
		s = s - 2;//�൱���ϴγ��е�λ�á�
		m = input.nextInt();//������m�����˳�
		
		Person[] person = new Person[n];
		
		for (int i = 0; i < n; i++)
		{
			person[i] = new Person();
			person[i].num = i + 1;
			person[i].in = true;
		}
		
		for (int i = 0; i < n - 1; i++)
		{
			int m2 = m;
			while (m2 > 0)
			{
				s++;
				if (s > n - 1)
				{
					s = s - n;
				}
				if (person[s].in)
				{
					m2--;
				}
			}
			System.out.println(person[s].num);
			person[s].in = false;
		}
		for (int i = 0; i < n; i++)
		{
			if (person[i].in)
			{
				System.out.println(person[i].num);
				break;
			}
		}
		
	}
	

	
	
}