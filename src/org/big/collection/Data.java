package org.big.collection;

public class Data implements Comparable<Data> {
	
	String name;
	
	int age;

	public Data(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	@Override
	public String toString()
	{
		return "Data [name=" + name + ", age=" + age + "]";
	}
	
		public int compareTo(Data target)
		{
			if(this==target)
				return 0;
			else if(this.name.compareTo(target.name)>0)
            return 1;
            else if(this.name.compareTo(target.name)<0)
             return-1;
             else
             {
            	if(this.age>target.age)
            		return 1;
            	else if(this.age<target.age)
            		return-1;
            	else
            		return 0;
             }

		}
	}


