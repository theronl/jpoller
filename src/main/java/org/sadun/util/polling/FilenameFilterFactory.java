/*
 * Levels Beyond CONFIDENTIAL
 *
 * Copyright 2003 - 2014 Levels Beyond Incorporated
 * All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of Levels Beyond Incorporated and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to Levels Beyond Incorporated
 * and its suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is unlawful and strictly forbidden unless prior written permission is obtained
 * from Levels Beyond Incorporated.
 */

/*
 * Created on Sep 9, 2004
 */
package org.sadun.util.polling;

import java.io.FilenameFilter;

/**
 * his interface is used in conjunction with the JMX instrumentation {@link ManagedDirectoryPoller
 * ManagedDirectoryPoller} of {@link DirectoryPoller DirectoryPoller}.
 * <p/>
 * The JMX console user can specify the name of a class implementing this interface, which is in turn used to produce a
 * {@link FilenameFilter FilenameFilter} object which is added to {@link ManagedDirectoryPoller
 * ManagedDirectoryPoller}.
 * <p/>
 * The implementing class must have a public default constructor.
 *
 * @author Cristiano Sadun
 */
public interface FilenameFilterFactory {

	/**
	 * Create the {@link java.io.FilenameFilter} to add to the {@link ManagedDirectoryPoller} MBean.
	 * <p/>
	 * The MBean JMX <tt>ObjectName</tt> is passed to the factory, so that it can discriminate among different Mbean
	 * instances.
	 * <p/>
	 *
	 * @param mBeanName the <tt>ObjectName</tt> of the MBean to which the {@link java.io.FilenameFilter}s are going to be
	 *                  added.
	 * @return java.io.FilenameFilter the filter object to use.
	 */
	public FilenameFilter createFilenameFilter(String mbeanName);

	/**
	 * Provides a description of the factory.
	 *
	 * @return String
	 */
	public String getDescription();
}
