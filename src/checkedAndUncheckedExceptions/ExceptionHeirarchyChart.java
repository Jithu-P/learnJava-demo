package checkedAndUncheckedExceptions;

public class ExceptionHeirarchyChart {

	/*
	 *             ------------------------ Throwable -------
	 *             |                                         | 
	 *           Error                                    Exception
	 *                                                     |     |     
	 *                           RuntimeException ----------     |
	 *                                  |                        |
	 *                                  |                        |
	 *                                  |                        |
	 *                          {                                |      {
	 *                           NullPointerException            |       IOException
	 *                           NumberFormatException           |_____  SQLException
	 *                           ClassCastException                      MalformedURLException
	 *                           IndexOutOfBoundExceptions               ...
	 *                           ...                                     } 
	 *                           }    
	 * 
	 */
	
	/*
	In Java, both 'Error' and 'Exception' are sub classes of 'Throwable'
	
	'Error's are usually the things that can't be recovered from
	Example - Out of memory error, Stack overflow error etc. 
	
	All exceptions in Java are sub-classes of the 'Exception' class
	One such sub-class is 'RuntimeException'
	There are many sub classes for 'RuntimeException' also, as shown in the diagram
	
	***RuntimeException and all sub classes of it, are 'Unchecked Exceptions' in Java***
	
	***Any exception other than that is a 'Checked Exception', 
	and that includes the 'Exception' class itself and 
	any other sub-classes of 'Exception' besides 'RuntimeException'***
	*/
}
