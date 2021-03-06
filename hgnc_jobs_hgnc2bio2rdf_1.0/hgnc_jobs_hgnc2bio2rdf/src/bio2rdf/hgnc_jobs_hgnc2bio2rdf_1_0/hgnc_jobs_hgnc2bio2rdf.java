// ============================================================================
//
// Copyright (c) 2005-2010, Talend Inc.
//
// This source code has been automatically generated by_Talend Open Studio for Data Integration
// / JobDesigner (CodeGenerator version 5.0.1.r74687)
// You can find more information about Talend products at www.talend.com.
// You may distribute this code under the terms of the GNU LGPL license
// http://www.gnu.org/licenses/lgpl.html).
//
// ============================================================================
package bio2rdf.hgnc_jobs_hgnc2bio2rdf_1_0;

import routines.Mathematical;
import routines.DataOperation;
import routines.Relational;
import routines.TalendDate;
import routines.TalendDataGenerator;
import routines.Numeric;
import routines.TalendString;
import routines.StringHandling;
import routines.system.*;
import routines.system.api.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.Comparator;

/**
 * Job: hgnc_jobs_hgnc2bio2rdf Purpose: <br>
 * Description: This JOB convert the two main files from HGNC (HUGO Gene
 * Nomenclature Commitee) download web page
 * (http://www.genenames.org/cgi-bin/hgnc_stats.pl) into Bio2RDF's triples. <br>
 * 
 * @author test@talend.com
 * @version 5.0.1.r74687
 * @status PROD
 */
public class hgnc_jobs_hgnc2bio2rdf implements TalendJob {

	public final Object obj = new Object();

	// for transmiting parameters purpose
	private Object valueObject = null;

	public Object getValueObject() {
		return this.valueObject;
	}

	public void setValueObject(Object valueObject) {
		this.valueObject = valueObject;
	}

	private final static String defaultCharset = java.nio.charset.Charset
			.defaultCharset().name();

	private final static String utf8Charset = "UTF-8";

	// create and load default properties
	private java.util.Properties defaultProps = new java.util.Properties();

	// create application properties with default
	public class ContextProperties extends java.util.Properties {

		public ContextProperties(java.util.Properties properties) {
			super(properties);
		}

		public ContextProperties() {
			super();
		}

		public void synchronizeContext() {

			if (workPath != null) {

				this.setProperty("workPath", workPath.toString());

			}

		}

		public String workPath;

		public String getWorkPath() {
			return this.workPath;
		}
	}

	private ContextProperties context = new ContextProperties();

	public ContextProperties getContext() {
		return this.context;
	}

	private final String jobVersion = "1.0";
	private final String jobName = "hgnc_jobs_hgnc2bio2rdf";
	private final String projectName = "BIO2RDF";
	public Integer errorCode = null;
	private String currentComponent = "";
	private final java.util.Map<String, Long> start_Hash = new java.util.HashMap<String, Long>();
	private final java.util.Map<String, Long> end_Hash = new java.util.HashMap<String, Long>();
	private final java.util.Map<String, Boolean> ok_Hash = new java.util.HashMap<String, Boolean>();
	private final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();
	public final java.util.List<String[]> globalBuffer = new java.util.ArrayList<String[]>();

	public boolean isExportedAsOSGI = false;

	private final java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
	private final java.io.PrintStream errorMessagePS = new java.io.PrintStream(
			new java.io.BufferedOutputStream(baos));

	public String getExceptionStackTrace() {
		if ("failure".equals(this.getStatus())) {
			errorMessagePS.flush();
			return baos.toString();
		}
		return null;
	}

	private Exception exception = null;

	public Exception getException() {
		if ("failure".equals(this.getStatus())) {
			return this.exception;
		}
		return null;
	}

	private class TalendException extends Exception {
		private java.util.Map<String, Object> globalMap = null;
		private Exception e = null;
		private String currentComponent = null;

		private TalendException(Exception e, String errorComponent,
				final java.util.Map<String, Object> globalMap) {
			this.currentComponent = errorComponent;
			this.globalMap = globalMap;
			this.e = e;
		}

		@Override
		public void printStackTrace() {
			if (!(e instanceof TalendException || e instanceof TDieException)) {
				globalMap.put(currentComponent + "_ERROR_MESSAGE", e
						.getMessage());
				System.err
						.println("Exception in component " + currentComponent);
			}
			if (!(e instanceof TDieException)) {
				if (e instanceof TalendException) {
					e.printStackTrace();
				} else {
					e.printStackTrace();
					e.printStackTrace(errorMessagePS);
					hgnc_jobs_hgnc2bio2rdf.this.exception = e;
				}
			}
			if (!(e instanceof TalendException)) {
				try {
					for (java.lang.reflect.Method m : this.getClass()
							.getEnclosingClass().getMethods()) {
						if (m.getName().compareTo(currentComponent + "_error") == 0) {
							m.invoke(hgnc_jobs_hgnc2bio2rdf.this, new Object[] {
									e, currentComponent, globalMap });
							break;
						}
					}

					if (!(e instanceof TDieException)) {
					}
				} catch (java.lang.SecurityException e) {
					this.e.printStackTrace();
				} catch (java.lang.IllegalArgumentException e) {
					this.e.printStackTrace();
				} catch (java.lang.IllegalAccessException e) {
					this.e.printStackTrace();
				} catch (java.lang.reflect.InvocationTargetException e) {
					this.e.printStackTrace();
				}
			}
		}
	}

	public void tRunJob_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		end_Hash.put("tRunJob_2", System.currentTimeMillis());

		tRunJob_2_onSubJobError(exception, errorComponent, globalMap);

	}

	public void tRunJob_3_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		end_Hash.put("tRunJob_3", System.currentTimeMillis());

		tRunJob_3_onSubJobError(exception, errorComponent, globalMap);

	}

	public void tRunJob_4_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		end_Hash.put("tRunJob_4", System.currentTimeMillis());

		tRunJob_4_onSubJobError(exception, errorComponent, globalMap);

	}

	public void tRunJob_2_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId()
				+ "", "FATAL", "", exception.getMessage(), ResumeUtil
				.getExceptionStackTrace(exception), "");

	}

	public void tRunJob_3_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId()
				+ "", "FATAL", "", exception.getMessage(), ResumeUtil
				.getExceptionStackTrace(exception), "");

	}

	public void tRunJob_4_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId()
				+ "", "FATAL", "", exception.getMessage(), ResumeUtil
				.getExceptionStackTrace(exception), "");

	}

	public void tRunJob_2Process(final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tRunJob_2_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		String iterateId = "";
		String currentComponent = "";

		try {

			String currentMethodName = new Exception().getStackTrace()[0]
					.getMethodName();
			boolean resumeIt = currentMethodName.equals(resumeEntryMethodName);
			if (resumeEntryMethodName == null || resumeIt || globalResumeTicket) {// start
																					// the
																					// resume
				globalResumeTicket = true;

				/**
				 * [tRunJob_2 begin ] start
				 */

				ok_Hash.put("tRunJob_2", false);
				start_Hash.put("tRunJob_2", System.currentTimeMillis());
				currentComponent = "tRunJob_2";

				int tos_count_tRunJob_2 = 0;

				/**
				 * [tRunJob_2 begin ] stop
				 */
				/**
				 * [tRunJob_2 main ] start
				 */

				currentComponent = "tRunJob_2";

				java.util.List<String> paraList_tRunJob_2 = new java.util.ArrayList<String>();
				paraList_tRunJob_2.add("--father_pid=" + pid);

				paraList_tRunJob_2.add("--root_pid=" + rootPid);

				paraList_tRunJob_2.add("--father_node=tRunJob_2");

				paraList_tRunJob_2.add("--context=Default");

				// for feature:10589
				paraList_tRunJob_2.add("--stat_port=" + portStats);

				if (resuming_logs_dir_path != null) {
					paraList_tRunJob_2.add("--resuming_logs_dir_path="
							+ resuming_logs_dir_path);
				}
				String childResumePath_tRunJob_2 = ResumeUtil
						.getChildJobCheckPointPath(resuming_checkpoint_path);
				String tRunJobName_tRunJob_2 = ResumeUtil
						.getRighttRunJob(resuming_checkpoint_path);
				if ("tRunJob_2".equals(tRunJobName_tRunJob_2)
						&& childResumePath_tRunJob_2 != null) {
					paraList_tRunJob_2
							.add("--resuming_checkpoint_path="
									+ ResumeUtil
											.getChildJobCheckPointPath(resuming_checkpoint_path));
				}
				paraList_tRunJob_2.add("--parent_part_launcher=JOB:" + jobName
						+ "/NODE:tRunJob_2");

				java.util.Map<String, Object> parentContextMap_tRunJob_2 = new java.util.HashMap<String, Object>();

				Object obj_tRunJob_2 = null;

				bio2rdf.hgnc_2_genefamily_1_0.hgnc_2_geneFamily childJob_tRunJob_2 = new bio2rdf.hgnc_2_genefamily_1_0.hgnc_2_geneFamily();
				childJob_tRunJob_2.parentContextMap = parentContextMap_tRunJob_2;
				String[][] childReturn_tRunJob_2 = childJob_tRunJob_2
						.runJob((String[]) paraList_tRunJob_2
								.toArray(new String[paraList_tRunJob_2.size()]));
				errorCode = childJob_tRunJob_2.getErrorCode();

				if (childJob_tRunJob_2.getErrorCode() == null) {
					globalMap.put("tRunJob_2_CHILD_RETURN_CODE",
							childJob_tRunJob_2.getStatus() != null
									&& ("failure").equals(childJob_tRunJob_2
											.getStatus()) ? 1 : 0);
				} else {
					globalMap.put("tRunJob_2_CHILD_RETURN_CODE",
							childJob_tRunJob_2.getErrorCode());
				}
				globalMap.put("tRunJob_2_CHILD_EXCEPTION_STACKTRACE",
						childJob_tRunJob_2.getExceptionStackTrace());

				if (childJob_tRunJob_2.getErrorCode() != null
						|| ("failure").equals(childJob_tRunJob_2.getStatus())) {
					throw new RuntimeException("Child job running failed");
				}

				tos_count_tRunJob_2++;

				/**
				 * [tRunJob_2 main ] stop
				 */
				/**
				 * [tRunJob_2 end ] start
				 */

				currentComponent = "tRunJob_2";

				ok_Hash.put("tRunJob_2", true);
				end_Hash.put("tRunJob_2", System.currentTimeMillis());

				/**
				 * [tRunJob_2 end ] stop
				 */

			}// end the resume

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil.addLog("CHECKPOINT",
						"CONNECTION:SUBJOB_OK:tRunJob_2:OnSubjobOk", "", Thread
								.currentThread().getId()
								+ "", "", "", "", "", "");
			}

			tRunJob_3Process(globalMap);

		} catch (Exception e) {

			throw new TalendException(e, currentComponent, globalMap);

		} catch (java.lang.Error error) {

			throw new java.lang.Error(error);

		}

		globalMap.put("tRunJob_2_SUBPROCESS_STATE", 1);
	}

	public void tRunJob_3Process(final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tRunJob_3_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		String iterateId = "";
		String currentComponent = "";

		try {

			String currentMethodName = new Exception().getStackTrace()[0]
					.getMethodName();
			boolean resumeIt = currentMethodName.equals(resumeEntryMethodName);
			if (resumeEntryMethodName == null || resumeIt || globalResumeTicket) {// start
																					// the
																					// resume
				globalResumeTicket = true;

				/**
				 * [tRunJob_3 begin ] start
				 */

				ok_Hash.put("tRunJob_3", false);
				start_Hash.put("tRunJob_3", System.currentTimeMillis());
				currentComponent = "tRunJob_3";

				int tos_count_tRunJob_3 = 0;

				/**
				 * [tRunJob_3 begin ] stop
				 */
				/**
				 * [tRunJob_3 main ] start
				 */

				currentComponent = "tRunJob_3";

				java.util.List<String> paraList_tRunJob_3 = new java.util.ArrayList<String>();
				paraList_tRunJob_3.add("--father_pid=" + pid);

				paraList_tRunJob_3.add("--root_pid=" + rootPid);

				paraList_tRunJob_3.add("--father_node=tRunJob_3");

				paraList_tRunJob_3.add("--context=Default");

				// for feature:10589
				paraList_tRunJob_3.add("--stat_port=" + portStats);

				if (resuming_logs_dir_path != null) {
					paraList_tRunJob_3.add("--resuming_logs_dir_path="
							+ resuming_logs_dir_path);
				}
				String childResumePath_tRunJob_3 = ResumeUtil
						.getChildJobCheckPointPath(resuming_checkpoint_path);
				String tRunJobName_tRunJob_3 = ResumeUtil
						.getRighttRunJob(resuming_checkpoint_path);
				if ("tRunJob_3".equals(tRunJobName_tRunJob_3)
						&& childResumePath_tRunJob_3 != null) {
					paraList_tRunJob_3
							.add("--resuming_checkpoint_path="
									+ ResumeUtil
											.getChildJobCheckPointPath(resuming_checkpoint_path));
				}
				paraList_tRunJob_3.add("--parent_part_launcher=JOB:" + jobName
						+ "/NODE:tRunJob_3");

				java.util.Map<String, Object> parentContextMap_tRunJob_3 = new java.util.HashMap<String, Object>();

				Object obj_tRunJob_3 = null;

				bio2rdf.hgnc_3_gene_1_0.hgnc_3_gene childJob_tRunJob_3 = new bio2rdf.hgnc_3_gene_1_0.hgnc_3_gene();
				childJob_tRunJob_3.parentContextMap = parentContextMap_tRunJob_3;
				String[][] childReturn_tRunJob_3 = childJob_tRunJob_3
						.runJob((String[]) paraList_tRunJob_3
								.toArray(new String[paraList_tRunJob_3.size()]));
				errorCode = childJob_tRunJob_3.getErrorCode();

				if (childJob_tRunJob_3.getErrorCode() == null) {
					globalMap.put("tRunJob_3_CHILD_RETURN_CODE",
							childJob_tRunJob_3.getStatus() != null
									&& ("failure").equals(childJob_tRunJob_3
											.getStatus()) ? 1 : 0);
				} else {
					globalMap.put("tRunJob_3_CHILD_RETURN_CODE",
							childJob_tRunJob_3.getErrorCode());
				}
				globalMap.put("tRunJob_3_CHILD_EXCEPTION_STACKTRACE",
						childJob_tRunJob_3.getExceptionStackTrace());

				if (childJob_tRunJob_3.getErrorCode() != null
						|| ("failure").equals(childJob_tRunJob_3.getStatus())) {
					throw new RuntimeException("Child job running failed");
				}

				tos_count_tRunJob_3++;

				/**
				 * [tRunJob_3 main ] stop
				 */
				/**
				 * [tRunJob_3 end ] start
				 */

				currentComponent = "tRunJob_3";

				ok_Hash.put("tRunJob_3", true);
				end_Hash.put("tRunJob_3", System.currentTimeMillis());

				/**
				 * [tRunJob_3 end ] stop
				 */

			}// end the resume

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil.addLog("CHECKPOINT",
						"CONNECTION:SUBJOB_OK:tRunJob_3:OnSubjobOk", "", Thread
								.currentThread().getId()
								+ "", "", "", "", "", "");
			}

			tRunJob_4Process(globalMap);

		} catch (Exception e) {

			throw new TalendException(e, currentComponent, globalMap);

		} catch (java.lang.Error error) {

			throw new java.lang.Error(error);

		}

		globalMap.put("tRunJob_3_SUBPROCESS_STATE", 1);
	}

	public void tRunJob_4Process(final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tRunJob_4_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		String iterateId = "";
		String currentComponent = "";

		try {

			String currentMethodName = new Exception().getStackTrace()[0]
					.getMethodName();
			boolean resumeIt = currentMethodName.equals(resumeEntryMethodName);
			if (resumeEntryMethodName == null || resumeIt || globalResumeTicket) {// start
																					// the
																					// resume
				globalResumeTicket = true;

				/**
				 * [tRunJob_4 begin ] start
				 */

				ok_Hash.put("tRunJob_4", false);
				start_Hash.put("tRunJob_4", System.currentTimeMillis());
				currentComponent = "tRunJob_4";

				int tos_count_tRunJob_4 = 0;

				/**
				 * [tRunJob_4 begin ] stop
				 */
				/**
				 * [tRunJob_4 main ] start
				 */

				currentComponent = "tRunJob_4";

				java.util.List<String> paraList_tRunJob_4 = new java.util.ArrayList<String>();
				paraList_tRunJob_4.add("--father_pid=" + pid);

				paraList_tRunJob_4.add("--root_pid=" + rootPid);

				paraList_tRunJob_4.add("--father_node=tRunJob_4");

				paraList_tRunJob_4.add("--context=Default");

				// for feature:10589
				paraList_tRunJob_4.add("--stat_port=" + portStats);

				if (resuming_logs_dir_path != null) {
					paraList_tRunJob_4.add("--resuming_logs_dir_path="
							+ resuming_logs_dir_path);
				}
				String childResumePath_tRunJob_4 = ResumeUtil
						.getChildJobCheckPointPath(resuming_checkpoint_path);
				String tRunJobName_tRunJob_4 = ResumeUtil
						.getRighttRunJob(resuming_checkpoint_path);
				if ("tRunJob_4".equals(tRunJobName_tRunJob_4)
						&& childResumePath_tRunJob_4 != null) {
					paraList_tRunJob_4
							.add("--resuming_checkpoint_path="
									+ ResumeUtil
											.getChildJobCheckPointPath(resuming_checkpoint_path));
				}
				paraList_tRunJob_4.add("--parent_part_launcher=JOB:" + jobName
						+ "/NODE:tRunJob_4");

				java.util.Map<String, Object> parentContextMap_tRunJob_4 = new java.util.HashMap<String, Object>();

				Object obj_tRunJob_4 = null;

				bio2rdf.hgnc_4_triples_1_0.hgnc_4_triples childJob_tRunJob_4 = new bio2rdf.hgnc_4_triples_1_0.hgnc_4_triples();
				childJob_tRunJob_4.parentContextMap = parentContextMap_tRunJob_4;
				String[][] childReturn_tRunJob_4 = childJob_tRunJob_4
						.runJob((String[]) paraList_tRunJob_4
								.toArray(new String[paraList_tRunJob_4.size()]));
				errorCode = childJob_tRunJob_4.getErrorCode();

				if (childJob_tRunJob_4.getErrorCode() == null) {
					globalMap.put("tRunJob_4_CHILD_RETURN_CODE",
							childJob_tRunJob_4.getStatus() != null
									&& ("failure").equals(childJob_tRunJob_4
											.getStatus()) ? 1 : 0);
				} else {
					globalMap.put("tRunJob_4_CHILD_RETURN_CODE",
							childJob_tRunJob_4.getErrorCode());
				}
				globalMap.put("tRunJob_4_CHILD_EXCEPTION_STACKTRACE",
						childJob_tRunJob_4.getExceptionStackTrace());

				if (childJob_tRunJob_4.getErrorCode() != null
						|| ("failure").equals(childJob_tRunJob_4.getStatus())) {
					throw new RuntimeException("Child job running failed");
				}

				tos_count_tRunJob_4++;

				/**
				 * [tRunJob_4 main ] stop
				 */
				/**
				 * [tRunJob_4 end ] start
				 */

				currentComponent = "tRunJob_4";

				ok_Hash.put("tRunJob_4", true);
				end_Hash.put("tRunJob_4", System.currentTimeMillis());

				/**
				 * [tRunJob_4 end ] stop
				 */

			}// end the resume

		} catch (Exception e) {

			throw new TalendException(e, currentComponent, globalMap);

		} catch (java.lang.Error error) {

			throw new java.lang.Error(error);

		}

		globalMap.put("tRunJob_4_SUBPROCESS_STATE", 1);
	}

	public String resuming_logs_dir_path = null;
	public String resuming_checkpoint_path = null;
	public String parent_part_launcher = null;
	private String resumeEntryMethodName = null;
	private boolean globalResumeTicket = false;

	public boolean watch = false;
	// portStats is null, it means don't execute the statistics
	public Integer portStats = null;
	public int portTraces = 4334;
	public String clientHost;
	public String defaultClientHost = "localhost";
	public String contextStr = "Default";
	public boolean isDefaultContext = true;
	public String pid = "0";
	public String rootPid = null;
	public String fatherPid = null;
	public String fatherNode = null;
	public long startTime = 0;
	public boolean isChildJob = false;

	private boolean execStat = true;

	private ThreadLocal threadLocal = new ThreadLocal();
	{
		java.util.Map threadRunResultMap = new java.util.HashMap();
		threadRunResultMap.put("errorCode", null);
		threadRunResultMap.put("status", "");
		threadLocal.set(threadRunResultMap);
	}

	private java.util.Properties context_param = new java.util.Properties();
	public java.util.Map<String, Object> parentContextMap = new java.util.HashMap<String, Object>();

	public String status = "";

	public static void main(String[] args) {
		final hgnc_jobs_hgnc2bio2rdf hgnc_jobs_hgnc2bio2rdfClass = new hgnc_jobs_hgnc2bio2rdf();

		int exitCode = hgnc_jobs_hgnc2bio2rdfClass.runJobInTOS(args);

		System.exit(exitCode);
	}

	public String[][] runJob(String[] args) {

		int exitCode = runJobInTOS(args);
		String[][] bufferValue = new String[][] { { Integer.toString(exitCode) } };

		return bufferValue;
	}

	public int runJobInTOS(String[] args) {

		String lastStr = "";
		for (String arg : args) {
			if (arg.equalsIgnoreCase("--context_param")) {
				lastStr = arg;
			} else if (lastStr.equals("")) {
				evalParam(arg);
			} else {
				evalParam(lastStr + " " + arg);
				lastStr = "";
			}
		}

		if (clientHost == null) {
			clientHost = defaultClientHost;
		}

		if (pid == null || "0".equals(pid)) {
			pid = TalendString.getAsciiRandomString(6);
		}

		if (rootPid == null) {
			rootPid = pid;
		}
		if (fatherPid == null) {
			fatherPid = pid;
		} else {
			isChildJob = true;
		}

		try {
			// call job/subjob with an existing context, like:
			// --context=production. if without this parameter, there will use
			// the default context instead.
			java.io.InputStream inContext = hgnc_jobs_hgnc2bio2rdf.class
					.getClassLoader().getResourceAsStream(
							"bio2rdf/hgnc_jobs_hgnc2bio2rdf_1_0/contexts/"
									+ contextStr + ".properties");
			if (isDefaultContext && inContext == null) {

			} else {
				if (inContext != null) {
					// defaultProps is in order to keep the original context
					// value
					defaultProps.load(inContext);
					inContext.close();
					context = new ContextProperties(defaultProps);
				} else {
					// print info and job continue to run, for case:
					// context_param is not empty.
					System.err.println("Could not find the context "
							+ contextStr);
				}

				if (!context_param.isEmpty()) {
					context.putAll(context_param);
				}

				context.workPath = (String) context.getProperty("workPath");

			}
		} catch (java.io.IOException ie) {
			System.err.println("Could not load context " + contextStr);
			ie.printStackTrace();
		}

		// get context value from parent directly
		if (parentContextMap != null && !parentContextMap.isEmpty()) {
			if (parentContextMap.containsKey("workPath")) {
				context.workPath = (String) parentContextMap.get("workPath");
			}
		}

		// Resume: init the resumeUtil
		resumeEntryMethodName = ResumeUtil
				.getResumeEntryMethodName(resuming_checkpoint_path);
		resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
		resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName,
				jobName, contextStr, jobVersion);

		// Resume: jobStart
		resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName,
				parent_part_launcher, Thread.currentThread().getId() + "", "",
				"", "", "", resumeUtil.convertToJsonText(context));

		long startUsedMemory = Runtime.getRuntime().totalMemory()
				- Runtime.getRuntime().freeMemory();
		long endUsedMemory = 0;
		long end = 0;

		startTime = System.currentTimeMillis();

		this.globalResumeTicket = true;// to run tPreJob

		this.globalResumeTicket = false;// to run others jobs

		try {
			errorCode = null;
			tRunJob_2Process(globalMap);
			if (!"failure".equals(status)) {
				status = "end";
			}
		} catch (TalendException e_tRunJob_2) {
			status = "failure";
			e_tRunJob_2.printStackTrace();
			globalMap.put("tRunJob_2_SUBPROCESS_STATE", -1);

		} finally {
		}

		this.globalResumeTicket = true;// to run tPostJob

		end = System.currentTimeMillis();

		if (watch) {
			System.out.println((end - startTime) + " milliseconds");
		}

		endUsedMemory = Runtime.getRuntime().totalMemory()
				- Runtime.getRuntime().freeMemory();
		if (false) {
			System.out
					.println((endUsedMemory - startUsedMemory)
							+ " bytes memory increase when running : hgnc_jobs_hgnc2bio2rdf");
		}

		int returnCode = 0;
		if (errorCode == null) {
			returnCode = status != null && status.equals("failure") ? 1 : 0;
		} else {
			returnCode = errorCode.intValue();
		}
		resumeUtil.addLog("JOB_ENDED", "JOB:" + jobName, parent_part_launcher,
				Thread.currentThread().getId() + "", "", "" + returnCode, "",
				"", "");

		return returnCode;

	}

	private void evalParam(String arg) {
		if (arg.startsWith("--resuming_logs_dir_path")) {
			resuming_logs_dir_path = arg.substring(25);
		} else if (arg.startsWith("--resuming_checkpoint_path")) {
			resuming_checkpoint_path = arg.substring(27);
		} else if (arg.startsWith("--parent_part_launcher")) {
			parent_part_launcher = arg.substring(23);
		} else if (arg.startsWith("--watch")) {
			watch = true;
		} else if (arg.startsWith("--stat_port=")) {
			String portStatsStr = arg.substring(12);
			if (portStatsStr != null && !portStatsStr.equals("null")) {
				portStats = Integer.parseInt(portStatsStr);
			}
		} else if (arg.startsWith("--trace_port=")) {
			portTraces = Integer.parseInt(arg.substring(13));
		} else if (arg.startsWith("--client_host=")) {
			clientHost = arg.substring(14);
		} else if (arg.startsWith("--context=")) {
			contextStr = arg.substring(10);
			isDefaultContext = false;
		} else if (arg.startsWith("--father_pid=")) {
			fatherPid = arg.substring(13);
		} else if (arg.startsWith("--root_pid=")) {
			rootPid = arg.substring(11);
		} else if (arg.startsWith("--father_node=")) {
			fatherNode = arg.substring(14);
		} else if (arg.startsWith("--pid=")) {
			pid = arg.substring(6);
		} else if (arg.startsWith("--context_param")) {
			String keyValue = arg.substring(16);
			int index = -1;
			if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
				context_param.put(keyValue.substring(0, index),
						replaceEscapeChars(keyValue.substring(index + 1)));
			}
		}

	}

	private final String[][] escapeChars = { { "\\n", "\n" }, { "\\'", "\'" },
			{ "\\r", "\r" }, { "\\f", "\f" }, { "\\b", "\b" }, { "\\t", "\t" },
			{ "\\\\", "\\" } };

	private String replaceEscapeChars(String keyValue) {
		if (keyValue == null || ("").equals(keyValue.trim())) {
			return keyValue;
		}
		for (String[] strArray : escapeChars) {
			keyValue = keyValue.replace(strArray[0], strArray[1]);
		}
		return keyValue;
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public String getStatus() {
		return status;
	}

	ResumeUtil resumeUtil = null;
}
/************************************************************************************************
 * 27420 characters generated by Talend Open Studio for Data Integration on the
 * 25 avril 2012 14:25:51 EDT
 ************************************************************************************************/
