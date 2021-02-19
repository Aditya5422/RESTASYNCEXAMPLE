package com.example;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.container.AsyncResponse;

import org.springframework.stereotype.Service;

import com.example.model.CheckList;
@Service
public class CheckProcessImpl implements CheckProcess {

	@Override
	public void check(AsyncResponse resp, CheckList checkList) {
//	
//		Runnable t=()->{
//			resp.resume(true);
//	   };
//		new Thread(t).start();
		new Thread() {
			public void run() {
				if(checkList==null || checkList.getChecks()==null || checkList.getChecks().size()==0) {
					resp.resume(new BadRequestException());
				}
				resp.resume(true);
		}
		}.start();

	}


}
