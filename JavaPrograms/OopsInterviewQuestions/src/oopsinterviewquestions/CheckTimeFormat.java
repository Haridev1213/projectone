package oopsinterviewquestions;
import java.util.Scanner;

public class CheckTimeFormat {
	private int hour;
	private int minute;
	private int second;
	
public CheckTimeFormat(int hr,int min,int sec) {
	hour=hr;
	minute=min;
	second=sec;
 }

public String Checkformat() {
	int hou=0,se=0,mi=0;
	if(hour>0&&hour<=24)
	{	
	hou=hour;
	}
	if(second>0&&second<60)
	{
	se=second;	
	}
	if(minute>0&&minute<60)
	{
	mi=minute;	
	}
	return hou+":"+mi+":"+se;
 }
	
}
