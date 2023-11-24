package DateAndTime;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class JavaDateTimeFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//In this DateTimeFormatter we can define our own format of DateTime
		//d-> date
		//M-> month
		//y-> year
		//h-> hour(0-12)
		//H-> Hour(0-23)
		//m->minuts
		//s->seconds
		//S->nanoSeconds
		//z->TimeZone
		//Z->offset (+05:30)
		
		
		//In LocalDateTime we can not use Timezone and offset for that we have to use ZonedDateTime
		
		ZonedDateTime z=ZonedDateTime.now();
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy -- hh:mm:ss:SSSS (z)Z");
		System.out.println(df.format(z));

	}

}
