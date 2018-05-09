package lab9;

public class Student {
	
	//Instance fields
	private String _name;
	private char _letterGrade;
	private double[] _testScores=new double[4];

	//Getters
	public String get_names() {return _name;}
	public double[] get_testScores() {return _testScores;}
	
	//Setters
	public void set_names(String _name) 
	{
		this._name = _name;
	}
	
	public void setGrade(double grade[]) 
	{
		for (int i = 0; i < grade.length; i++) 
		{
			this._testScores[i] = grade[i];
		}
		
	}
	
	
	public double getTotal() 
	{
		double total = 0,min=0;
		min = _testScores[0];
		for (int i = 0; i < _testScores.length; i++) 
		{
			 
			total += _testScores[i];
			
			if(_testScores[i] < min) 
			{
				min = _testScores[i];
			}
		}
		total = total - min;
		
		return total;
	}
	
	//method to get the average
	public double getAverage() 
	{
		double avg = getTotal() / 3;
		return avg;
	}
	
	
	//Method that returns a letter grade
	//based on student average
	public char studentLetterGrade() 
	{
		double avg = getAverage();
		
		if(avg >= 90) 
		{
			_letterGrade = 'A';
		}
		else if(avg >= 80 && avg <= 89) 
		{
			_letterGrade = 'B';
		}
		else if(avg >= 70 && avg <= 79) 
		{
			_letterGrade = 'C';
		}
		else if(avg >= 60 && avg <= 69) 
		{
			_letterGrade = 'D';
		}
		else 
		{
			_letterGrade = 'F';
		}
		
		return _letterGrade;
	}
	
}
