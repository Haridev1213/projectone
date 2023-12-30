package String;
/**
 *program name : Comparision betweeen String Builder vs String Buffer
 * @author harid
 */
public class ComparisionBufferBuilder {
public static void main(String[] args) {
long startTime=System.currentTimeMillis();
//String Buffer
StringBuffer s=new StringBuffer("hari");
for(int i=0;i<100000;i++)
{
    s.append("dev");
}
    System.out.println("time taken for the strring buffer is"+(System.currentTimeMillis()-startTime)+"ms");
//String Builder    
startTime=System.currentTimeMillis();
StringBuilder s1=new StringBuilder("hari");
for(int i=0;i<100000;i++)
{
    s1.append("dev");
}
 System.out.println("time taken for the strring builder is"+(System.currentTimeMillis()-startTime)+"ms");    
} 
}
