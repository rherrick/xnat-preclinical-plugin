/*
 * GENERATED FILE
 * Created on Wed Aug 09 11:56:09 BST 2017
 *
 */
package org.nrg.xdat.turbine.modules.screens;
import org.apache.turbine.util.RunData;
import org.apache.velocity.context.Context;
import org.nrg.xdat.turbine.modules.screens.SecureReport;

/**
 * @author XDAT
 *
 */
public class XDATScreen_report_icr_preclinicalDemographicData extends SecureReport {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XDATScreen_report_icr_preclinicalDemographicData.class);
	/* (non-Javadoc)
	 * @see org.nrg.xdat.turbine.modules.screens.SecureReport#finalProcessing(org.apache.turbine.util.RunData, org.apache.velocity.context.Context)
	 */
	public void finalProcessing(RunData data, Context context) {
		try{
			org.nrg.xdat.om.IcrPreclinicaldemographicdata om = new org.nrg.xdat.om.IcrPreclinicaldemographicdata(item);
			context.put("om",om);
			System.out.println("Loaded om object (org.nrg.xdat.om.IcrPreclinicaldemographicdata) as context parameter 'om'.");
			context.put("subject",om.getSubjectData());
			System.out.println("Loaded subject object (org.nrg.xdat.om.XnatSubjectdata) as context parameter 'subject'.");
		} catch(Exception e){}
	}}
