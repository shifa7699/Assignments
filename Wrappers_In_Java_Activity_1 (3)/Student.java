package pack.com;

import java.util.Scanner;

public class Student 
{
	void CalculateFeesStructure(Long StudentId,Character StudentGrade,Double MonthlyFees,Boolean isScholarshipEligible)
	{
		int fees;
		//if else conditions
		if(StudentId!=0 && StudentGrade== 'A' &&  isScholarshipEligible== true)
		{
			fees =(int)(MonthlyFees -((MonthlyFees *10)/100)) ;
			System.out.println("10% of fees is exempted, the calculated fees is "+fees);
		}
		else if(StudentId!= 0 &&  StudentGrade =='B' && isScholarshipEligible==true)
		{
			fees =(int)(MonthlyFees -((MonthlyFees * 8)/100)) ;
			System.out.println("8% of fees is exempted, the calculated fees is "+fees);
		}
		else if(StudentId!= 0 &&  StudentGrade=='C' && isScholarshipEligible==true)
		{
			fees =(int)(MonthlyFees -((MonthlyFees * 6)/100)) ;
			System.out.println("6% of fees is exempted, the calculated fees is "+fees);
		}
		else if(StudentId!= 0 &&  StudentGrade=='D' && isScholarshipEligible==true)
		{
			fees =(int)(MonthlyFees -((MonthlyFees * 4)/100)) ;
			System.out.println("4% of fees is exempted, the calculated fees is "+fees);
		}
		else
		{
			System.out.println("NOT ELIGIBLE FOR EXCEMPTION");
		}
	}
	//problem statement 2
	//method to compare math and english marks
	void CompareMarks(Long Maths,Double English)
	{
		Integer mathnum=(int)Maths.longValue(); //converting long value to integer 
		Integer engnum=(int)English.doubleValue();	//converting double value to integer
		//conditions to compare 
		if(English>Maths)
		{
			System.out.println("English marks is higher than Maths marks");
		}
		if(Maths>English)
		{
			System.out.println("Maths marks is higher than English marks");
		}
		else {
			System.out.println("Both are equal");
		}
	}
	//problem statement 3
	//method to check if fees is infinite or not.
	void validateFees(Double fees) {
		if(fees.isInfinite()) //checking if the fees is infinite using infinite method
		{
			System.out.println("Fees is infinite");
		}else
		{
			System.out.println("Fees is not infinite");
			System.out.println(fees.byteValue()); //getting byte value of fees
		}
	}	
	public static void main(String[] args) 
	{
		Student st=new Student(); //object of main class
		//Test case for CalculateFeesStructure
		st.CalculateFeesStructure(234l,'C',600d, true); //test case 1
		st.CalculateFeesStructure(115l,'B',909.50d,true); //test case 2
		st.CalculateFeesStructure(980l,'G',1810d,false); //test case 3
		// Test case for CompareMarks
		st.CompareMarks(85l, 65d);//test case 1
		st.CompareMarks(56l, 98d);//test case 2
		st.CompareMarks(84l,84d);//test case 3
		//Test case for ValidateMarks
		st.validateFees(1123d);
	}

}
