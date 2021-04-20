package annoconfig;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class MediaTek implements MobileProcessor {

	@Override
	//@Primary
	public void process() {
		System.out.println("MediaTek Processor");
	}

}
