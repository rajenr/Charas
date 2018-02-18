/********************************************************************** 
 *  COURSE:        CS 112 Intro to CS II 
 *  DAYS AND TIME: TuTh 1:30 pm - 3:20 pm
 *  CHAPTER #:     Cumulative
 *	PROJECT #:     Final Project
 *  PROGRAMMER(s): Reesha Rajen
 *  LAST MODIFIED: 12/11/2017
 *  PROGRAM TITLE: FileNotFoundException
 **********************************************************************
 *  PROGRAM DESCRIPTION: 
 *  Handles exceptions thrown in Charas program, extends Exception
 *  class.
 **********************************************************************/
public class FileNotFoundException extends Exception 
{
	/*** METHODS ***/
	
	//DESCRIPTION:    Default constructor for FileNotFoundException
	//PRE-CONDITION:  N/A
	//POST-CONDITION: Creates new instance of FileNotFoundException
	public FileNotFoundException() 
	{
		super("Error: File not found within folder.");
	}
}
