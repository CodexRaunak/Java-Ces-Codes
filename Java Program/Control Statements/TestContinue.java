class TestContinue
{
	public static void main(String args[])
	{
	for (int i = 0; i < 5; i++)
 	{
    		if (i == 2)
	 	{
        		continue; // skips printing when i equals 2
    		}
    		System.out.println(i);
	}
}
}