package com.lycenway;

import com.salesforce.dataloader.exception.ProcessInitializationException;
import com.salesforce.dataloader.process.ProcessRunner;

public class Starter {

	public static void main(String[] args) 
	{
		String logging = "initial";
		try {
			logging += "starting";
			ProcessRunner pr = ProcessRunner.getInstance("csvAccountExtractProcess");
			pr.setName("Starter");
			pr.getConfigOverrideMap().put("sfdc.debugMessages", "true");
			logging += pr.toString();
			pr.run();
		} catch (ProcessInitializationException e) {
			logging += e.getMessage();
		} finally {
			logging += "finally";
		}
		
		return;
	}
	
}
